import grails.util.BuildSettings
import grails.util.Environment

def targetDir = BuildSettings.TARGET_DIR

// See http://logback.qos.ch/manual/groovy.html for details on configuration
appender('STDOUT', ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%level %logger - %msg%n"
    }
}

appender("APPENDER", FileAppender) {
  file = "${targetDir}/debug.log"
  append = false
  encoder(PatternLayoutEncoder) {
    pattern = "%d %level %logger - %msg%n"
  }
}



root(ERROR, ['STDOUT'])
logger 'grails.app.init.BootStrap', DEBUG, ["APPENDER"]
logger 'grails.app.services', DEBUG, ["APPENDER"]
logger 'org.apache.cxf', INFO, ["APPENDER"]


if (Environment.isDevelopmentMode() && targetDir) {
    appender("FULL_STACKTRACE", FileAppender) {
        file = "${targetDir}/stacktrace.log"
        append = true
        encoder(PatternLayoutEncoder) {
            pattern = "%level %logger - %msg%n"
        }
    }
    logger("StackTrace", ERROR, ['FULL_STACKTRACE'], false)
}
