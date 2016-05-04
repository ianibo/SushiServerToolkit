import com.k_int.sushiServerToolkit.counter.*;

class CounterServiceEndpoint implements com.k_int.sushiServerToolkit.counter.SushiServiceInterface {


    public CounterReportResponse getReport(ReportRequest messagePart) {
      log.debug("counter::getReport");
      return new CounterReportResponse();
    }
}
