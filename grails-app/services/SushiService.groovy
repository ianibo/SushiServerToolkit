

import com.k_int.sushiServerToolkit.counter.*;

import grails.transaction.Transactional
import org.grails.cxf.utils.*

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


import javax.xml.datatype.DatatypeFactory


@GrailsCxfEndpoint
@WebService(targetNamespace = "SushiService", name = "SushiServiceInterface", portName="SushiServicePort" )
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
class SushiService implements com.k_int.sushiServerToolkit.counter.SushiServiceInterface {


    @WebMethod(operationName = "GetReport", action = "SushiService:GetReportIn")
    @WebResult(name = "ReportResponse", targetNamespace = "http://www.niso.org/schemas/sushi/counter", partName = "messagePart")
    public CounterReportResponse getReport(
      @WebParam(partName = "messagePart", name = "ReportRequest", targetNamespace = "http://www.niso.org/schemas/sushi/counter")
      ReportRequest messagePart) {

      log.debug("counter::getReport");

      log.debug("Requester is asking for ${messagePart.reportDefinition.name}")

      def datatypeFactory = DatatypeFactory.newInstance()
      def result = new CounterReportResponse();
      result.report = new Reports()
      result.report.report=new ArrayList<Report>()
      def report = new Report()

      report.vendor = new Vendor()
      report.vendor.name="Vendor Name Str"
      report.vendor.id="vendor ID Str"
      // report.vendor.contact = new ArrayList<Contact>()
      report.vendor.webSiteUrl="Vendor Url Str"
      report.vendor.logoUrl="Vendor Url logo Str"


      report.customer = new ArrayList<Report.Customer>()

      def cust = new Report.Customer()
      cust.name="Customer Name Str"
      cust.id="Customer ID Str"
      cust.contact = new ArrayList<Contact>()
      cust.webSiteUrl="Customer Url Str"
      cust.logoUrl="Customer Url logo Str"
      report.customer.add(cust)

      report.created = datatypeFactory.newXMLGregorianCalendar("2000-03-04T20:00:00Z")
      report.id = "StrId"
      report.version = "StrVer"
      report.name =  "StrName"
      report.title =  "StrTitle"

      result.report.report.add(report)


      // Standard properties from SUSHI report response
      result.exception = new ArrayList<Exception>()
      result.requestor = new Requestor()
      result.requestor.id = "Req ID"
      result.requestor.name = "Req Name"
      result.requestor.email = "Req Email"
      result.customerReference = new CustomerReference()
      result.customerReference.id="CustRefId"
      result.reportDefinition = new ReportDefinition()

      result.reportDefinition.filters = new ReportDefinition.Filters()

      result.reportDefinition.filters.usageDateRange = new Range();
      result.reportDefinition.filters.usageDateRange.begin = datatypeFactory.newXMLGregorianCalendar("2001-03-04T20:00:00Z")
      result.reportDefinition.filters.usageDateRange.end = datatypeFactory.newXMLGregorianCalendar("2002-03-04T20:00:00Z")

      result.reportDefinition.filters.filter = new ArrayList<FilterName>()
      result.reportDefinition.filters.reportAttribute = new ArrayList<ReportAttribute>()

      result.reportDefinition.name="Report defn name";
      result.reportDefinition.release="Report defn release";

      result.created = datatypeFactory.newXMLGregorianCalendar("2003-03-04T20:00:00Z")
      result.id = "ResultId"


      log.debug("counter::getReport returning result");
      return result;
    }

    @WebMethod
    @WebResult
    String simpleMethod() {
        return "demo"
    }

}
