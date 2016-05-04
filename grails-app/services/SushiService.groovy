

import com.k_int.sushiServerToolkit.counter.*;

import grails.transaction.Transactional
import org.grails.cxf.utils.*

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@GrailsCxfEndpoint
@WebService(targetNamespace = "SushiService", name = "SushiServiceInterface")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
class SushiService implements com.k_int.sushiServerToolkit.counter.SushiServiceInterface {


    @WebMethod(operationName = "GetReport", action = "SushiService:GetReportIn")
    @WebResult(name = "ReportResponse", targetNamespace = "http://www.niso.org/schemas/sushi/counter", partName = "messagePart")
    public CounterReportResponse getReport(
      @WebParam(partName = "messagePart", name = "ReportRequest", targetNamespace = "http://www.niso.org/schemas/sushi/counter")
      ReportRequest messagePart) {

      log.debug("counter::getReport");
      return new CounterReportResponse();
    }

    @WebMethod
    @WebResult
    String simpleMethod() {
        return "demo"
    }

}
