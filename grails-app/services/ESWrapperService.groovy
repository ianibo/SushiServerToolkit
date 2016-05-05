import grails.transaction.Transactional
import org.elasticsearch.node.Node
import org.elasticsearch.node.NodeBuilder
import org.elasticsearch.client.transport.TransportClient
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.groovy.*
import org.elasticsearch.common.transport.InetSocketTransportAddress
import org.apache.commons.io.FileSystemUtils

// See https://templth.wordpress.com/2015/01/23/implementing-integration-testing-for-elasticsearch-with-java/
// for info on integration testing with es


@Transactional
class ESWrapperService {

  static transactional = false
  def grailsApplication
  def esclient = null;

  @javax.annotation.PostConstruct
  def init() {

    log.debug("ESWrapperService::init");
    log.debug("config :: ${grailsApplication.config.grails.elasticsearch}");

    def es_cluster_name = grailsApplication.config.grails?.es_cluster_name
    log.debug("es_cluster = ${es_cluster_name}");

    if ( grailsApplication.config.grails?.es_local_only ) {

        // see http://www.programcreek.com/java-api-examples/index.php?api=org.elasticsearch.node.NodeBuilder
        log.debug("Configuring ES in local only mode");

        def es_working_dir='./es'

        removeOldDataDir(es_working_dir + "/" + es_cluster_name);

        Settings settings = Settings.settingsBuilder()
                .put("path.home", es_working_dir)
                .put("path.conf", es_working_dir)
                .put("path.data", es_working_dir)
                .put("path.work", es_working_dir)
                .put("path.logs", es_working_dir)
                .put("http.port", 9500)
                .put("transport.tcp.port", 9600)
                .put("index.number_of_shards", "1")
                .put("index.number_of_replicas", "0")
                .put("discovery.zen.ping.multicast.enabled", "false")
                .build();

        log.debug("Make node");

        def node = NodeBuilder.nodeBuilder()
                      .local(false)
                      .clusterName(es_cluster_name)
                      .settings(settings)
                      .node()

        log.debug("Start node");
        // Start local ES server
        node.start();
    }
    else {
      if ( es_cluster_name ) {
        Settings settings = Settings.settingsBuilder()
                                       .put("client.transport.sniff", true)
                                       .put("cluster.name", es_cluster_name)
                                       .build();
        esclient = TransportClient.builder().settings(settings).build();
        // add transport addresses
        esclient.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300 as int))
      }
      else {
          log.error("NO ES Cluser configured");
      }
    }

    log.debug("ES Init completed");
  }

  def getClient() {
    log.debug("getClient()");
    return esclient
  }

  private static void removeOldDataDir(String datadir) throws Exception {
    File dataDir = new File(datadir);
    if (dataDir.exists()) {
      FileSystemUtils.deleteRecursively(dataDir);
    }
  }    
}
