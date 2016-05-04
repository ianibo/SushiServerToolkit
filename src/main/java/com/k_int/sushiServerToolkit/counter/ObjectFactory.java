
package com.k_int.sushiServerToolkit.counter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.k_int.sushiServerToolkit.counter package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Reports_QNAME = new QName("http://www.niso.org/schemas/counter", "Reports");
    private final static QName _ReportResponseElement_QNAME = new QName("http://www.niso.org/schemas/sushi/counter", "ReportResponse");
    private final static QName _ReportRequestElement_QNAME = new QName("http://www.niso.org/schemas/sushi/counter", "ReportRequest");
    private final static QName _ReportRequest_QNAME = new QName("http://www.niso.org/schemas/sushi", "ReportRequest");
    private final static QName _ReportResponse_QNAME = new QName("http://www.niso.org/schemas/sushi", "ReportResponse");
    private final static QName _ExceptionHelpUrl_QNAME = new QName("http://www.niso.org/schemas/sushi", "HelpUrl");
    private final static QName _ExceptionData_QNAME = new QName("http://www.niso.org/schemas/sushi", "Data");
    private final static QName _CustomerReferenceName_QNAME = new QName("http://www.niso.org/schemas/sushi", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.k_int.sushiServerToolkit.counter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportDefinition }
     * 
     */
    public ReportDefinition createReportDefinition() {
        return new ReportDefinition();
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link Reports }
     * 
     */
    public Reports createReports() {
        return new Reports();
    }

    /**
     * Create an instance of {@link com.k_int.sushiServerToolkit.counter.Customer }
     * 
     */
    public com.k_int.sushiServerToolkit.counter.Customer createCustomer() {
        return new com.k_int.sushiServerToolkit.counter.Customer();
    }

    /**
     * Create an instance of {@link IPAddress }
     * 
     */
    public IPAddress createIPAddress() {
        return new IPAddress();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link ItemAttribute }
     * 
     */
    public ItemAttribute createItemAttribute() {
        return new ItemAttribute();
    }

    /**
     * Create an instance of {@link ItemContributorID }
     * 
     */
    public ItemContributorID createItemContributorID() {
        return new ItemContributorID();
    }

    /**
     * Create an instance of {@link ItemContributor }
     * 
     */
    public ItemContributor createItemContributor() {
        return new ItemContributor();
    }

    /**
     * Create an instance of {@link ItemDate }
     * 
     */
    public ItemDate createItemDate() {
        return new ItemDate();
    }

    /**
     * Create an instance of {@link ParentItem }
     * 
     */
    public ParentItem createParentItem() {
        return new ParentItem();
    }

    /**
     * Create an instance of {@link ReportItem }
     * 
     */
    public ReportItem createReportItem() {
        return new ReportItem();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Consortium }
     * 
     */
    public Consortium createConsortium() {
        return new Consortium();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link Metric }
     * 
     */
    public Metric createMetric() {
        return new Metric();
    }

    /**
     * Create an instance of {@link PerformanceCounter }
     * 
     */
    public PerformanceCounter createPerformanceCounter() {
        return new PerformanceCounter();
    }

    /**
     * Create an instance of {@link CounterReportResponse }
     * 
     */
    public CounterReportResponse createCounterReportResponse() {
        return new CounterReportResponse();
    }

    /**
     * Create an instance of {@link ReportRequest }
     * 
     */
    public ReportRequest createReportRequest() {
        return new ReportRequest();
    }

    /**
     * Create an instance of {@link ReportResponse }
     * 
     */
    public ReportResponse createReportResponse() {
        return new ReportResponse();
    }

    /**
     * Create an instance of {@link Requestor }
     * 
     */
    public Requestor createRequestor() {
        return new Requestor();
    }

    /**
     * Create an instance of {@link FilterName }
     * 
     */
    public FilterName createFilterName() {
        return new FilterName();
    }

    /**
     * Create an instance of {@link ReportAttribute }
     * 
     */
    public ReportAttribute createReportAttribute() {
        return new ReportAttribute();
    }

    /**
     * Create an instance of {@link Range }
     * 
     */
    public Range createRange() {
        return new Range();
    }

    /**
     * Create an instance of {@link CustomerReference }
     * 
     */
    public CustomerReference createCustomerReference() {
        return new CustomerReference();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link ReportDefinition.Filters }
     * 
     */
    public ReportDefinition.Filters createReportDefinitionFilters() {
        return new ReportDefinition.Filters();
    }

    /**
     * Create an instance of {@link Report.Customer }
     * 
     */
    public Report.Customer createReportCustomer() {
        return new Report.Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/counter", name = "Reports")
    public JAXBElement<Reports> createReports(Reports value) {
        return new JAXBElement<Reports>(_Reports_QNAME, Reports.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CounterReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi/counter", name = "ReportResponse")
    public JAXBElement<CounterReportResponse> createReportResponseElement(CounterReportResponse value) {
        return new JAXBElement<CounterReportResponse>(_ReportResponseElement_QNAME, CounterReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi/counter", name = "ReportRequest")
    public JAXBElement<ReportRequest> createReportRequestElement(ReportRequest value) {
        return new JAXBElement<ReportRequest>(_ReportRequestElement_QNAME, ReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "ReportRequest")
    public JAXBElement<ReportRequest> createReportRequest(ReportRequest value) {
        return new JAXBElement<ReportRequest>(_ReportRequest_QNAME, ReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "ReportResponse")
    public JAXBElement<ReportResponse> createReportResponse(ReportResponse value) {
        return new JAXBElement<ReportResponse>(_ReportResponse_QNAME, ReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "HelpUrl", scope = Exception.class)
    public JAXBElement<String> createExceptionHelpUrl(String value) {
        return new JAXBElement<String>(_ExceptionHelpUrl_QNAME, String.class, Exception.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "Data", scope = Exception.class)
    public JAXBElement<Object> createExceptionData(Object value) {
        return new JAXBElement<Object>(_ExceptionData_QNAME, Object.class, Exception.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "Name", scope = CustomerReference.class)
    public JAXBElement<String> createCustomerReferenceName(String value) {
        return new JAXBElement<String>(_CustomerReferenceName_QNAME, String.class, CustomerReference.class, value);
    }

}
