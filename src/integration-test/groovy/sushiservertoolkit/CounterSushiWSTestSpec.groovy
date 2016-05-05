package sushiservertoolkit

import grails.test.mixin.integration.Integration
import grails.transaction.*

import spock.lang.*
import geb.spock.*
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.datatype.DatatypeFactory
import com.k_int.sushiServerToolkit.counter.*
import org.apache.commons.logging.LogFactory
import groovy.util.logging.*


/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Log4j
@Stepwise
@Integration
@Rollback
class CounterSushiWSTestSpec extends GebSpec {


    @Shared
    SushiService ss

    @Shared
    SushiServiceInterface port

    @Shared
    datatypeFactory 

    def setup() {

      datatypeFactory = DatatypeFactory.newInstance()

      QName SERVICE_NAME = new QName("SushiService", "SushiServiceService");
      ss = new SushiService(new URL('http://localhost:8080/services/sushi?wsdl'),SERVICE_NAME);
      port = ss.getSushiServicePort();


    }

    def cleanup() {
    }

    // This is a bit of a cheat -- really this setup is for making http requests, but we're just using the
    // JXB stubs to call the web service.
    void "Call getReport WS"() {
        when:"We get hold of the Sushi port"
            com.k_int.sushiServerToolkit.counter.ReportRequest _getReport_messagePart = new com.k_int.sushiServerToolkit.counter.ReportRequest();
            _getReport_messagePart.requestor = new Requestor()
            _getReport_messagePart.requestor.id = "0001"
            _getReport_messagePart.requestor.name = "User 0001"
            _getReport_messagePart.requestor.email = "user0001@borcetshire.ac.uk"
            _getReport_messagePart.customerReference = new CustomerReference()
            _getReport_messagePart.customerReference.id = "ArcherConsortium/UoBorcetshire"
            _getReport_messagePart.reportDefinition = new ReportDefinition()
            _getReport_messagePart.reportDefinition.filters = new ReportDefinition.Filters()
            _getReport_messagePart.reportDefinition.filters.usageDateRange = new Range()
            _getReport_messagePart.reportDefinition.filters.usageDateRange.begin = datatypeFactory.newXMLGregorianCalendar("2016-01-01T00:00:00Z")
            _getReport_messagePart.reportDefinition.filters.usageDateRange.end = datatypeFactory.newXMLGregorianCalendar("2016-02-01T00:00:00Z")
            _getReport_messagePart.reportDefinition.filters.filter = []
            _getReport_messagePart.reportDefinition.filters.reportAttribute = new ArrayList<ReportAttribute>()
            _getReport_messagePart.reportDefinition.name="JR1a"
            _getReport_messagePart.reportDefinition.release="1"
            _getReport_messagePart.created = datatypeFactory.newXMLGregorianCalendar("2000-03-04T20:00:00Z")
            _getReport_messagePart.id = "ReportRequestId0000001"
        then:"Call Counter getReport"
            com.k_int.sushiServerToolkit.counter.CounterReportResponse _getReport__return = port.getReport(_getReport_messagePart);
        expect:"All OK"
            true == true
    }
}
