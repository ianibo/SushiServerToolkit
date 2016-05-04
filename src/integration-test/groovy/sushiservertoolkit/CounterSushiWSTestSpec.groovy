package sushiservertoolkit

import grails.test.mixin.integration.Integration
import grails.transaction.*

import spock.lang.*
import geb.spock.*

import com.k_int.sushiServerToolkit.vanilla.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class CounterSushiWSTestSpec extends GebSpec {


    @Shared
    SushiService ss

    @Shared
    SushiServiceInterface port


    def setup() {
      ss = new SushiService('http://localhost:8080/services/vanillaSushi', 'SushiService');
      port = ss.getSushiServicePort();
    }

    def cleanup() {
    }

    // This is a bit of a cheat -- really this setup is for making http requests, but we're just using the
    // JXB stubs to call the web service.
    void "Call getReport WS"() {
        when:"Call Counter getReport"
            com.k_int.sushiServerToolkit.vanilla.ReportRequest _getReport_messagePart = new com.k_int.sushiServerToolkit.vanilla.ReportRequest();
            com.k_int.sushiServerToolkit.vanilla.ReportResponse _getReport__return = port.getReport(_getReport_messagePart);
        expect:"All OK"
            true == true
    }
}
