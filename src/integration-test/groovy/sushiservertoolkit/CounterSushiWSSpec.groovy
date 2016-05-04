package sushiservertoolkit

import com.k_int.sushiServerToolkit.vanilla.*

import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class CounterSushiWSSpec extends Specification {


    def setup() {
    }

    def cleanup() {
    }

    void "Call getReport WS"() {
        expect:"All OK"
            true == true
    }
}
