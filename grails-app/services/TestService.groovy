import grails.transaction.Transactional
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint
class TestService {

    @WebMethod
    @WebResult
    String demoMethod() {
        return "demo"
    }
}
