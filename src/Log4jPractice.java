import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
////import org.apache.logging.log4j.core.*;
//import org.apache.logging.log4j.core.appender.FileAppender;
//import org.apache.logging.log4j.core.config.ConfigurationFactory;
//import org.apache.logging.log4j.core.config.plugins.Plugin;

//
//import org.apache.logging.log4j.core.Appender;
//import org.apache.logging.log4j.core.LoggerContext;
//import org.apache.logging.log4j.core.appender.ConsoleAppender;
//import org.apache.logging.log4j.core.appender.FileAppender;
//import org.apache.logging.log4j.Level;
////import org.apache.logging.log4j.core.Logger;
//import org.apache.logging.log4j.core.appender.RollingFileAppender;
//import org.apache.logging.log4j.core.appender.rolling.TimeBasedTriggeringPolicy;
//import org.apache.logging.log4j.core.config.AppenderRef;
//import org.apache.logging.log4j.core.config.Configuration;
//import org.apache.logging.log4j.core.config.LoggerConfig;
//import org.apache.logging.log4j.core.layout.PatternLayout;
//


/**
 * 題目編號
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class Log4jPractice {

    public static void main(String args[]){
//        LoggerContext loggerContext = (LoggerContext) LogManager.getContext(false);
//        Configuration config = loggerContext.getConfiguration();
//
//
//        PatternLayout layout = PatternLayout.newBuilder()
//                .withConfiguration(config)
//                .withPattern("%d{yyyy-MM-dd HH:mm:ss:SSS:SSS} %-5p %c{1}:%L - %m%n")
//                .build();
//
//        ConsoleAppender consoleAppender = ConsoleAppender.newBuilder()
//                .setConfiguration(config)
//                .withLayout(layout)
//                .withName("CONSOLE_APPENDER")
//                .build();
//
//        TimeBasedTriggeringPolicy policy = TimeBasedTriggeringPolicy.newBuilder()
//                .withInterval(1)
//                .withModulate(true)
//                .build();
//
//        RollingFileAppender rollingFileAppender = RollingFileAppender.newBuilder()
//                .setConfiguration(config)
//                .withLayout(layout)
//                .withName("ROLLING_FILE_APPENDER")
//                .withFileName("system_notice.log")
//                .withFilePattern("system_notice.log.%d{yyyy-MM-dd-mm}")
//                .withPolicy(policy)
//                .build();
//
//
//
//        consoleAppender.start();
//        config.addAppender(consoleAppender);
//
//        rollingFileAppender.start();
//        config.addAppender(rollingFileAppender);
//
//        AppenderRef appenderRef1 = AppenderRef.createAppenderRef("CONSOLE_APPENDER", Level.DEBUG, null);
//        AppenderRef appenderRef2 = AppenderRef.createAppenderRef("ROLLING_FILE_APPENDER", Level.DEBUG, null);
//
//        AppenderRef[] refs = new AppenderRef[] { appenderRef1, appenderRef2 };
//
//
//
//        LoggerConfig loggerConfig = LoggerConfig
//                .createLogger(false, Level.DEBUG, "A3", "true", refs, null, config, null);
//
//        loggerConfig.addAppender(consoleAppender, null, null);
//        loggerConfig.addAppender(rollingFileAppender, null, null);
//
//        config.addLogger("A3", loggerConfig);
//        loggerContext.updateLoggers();


        Logger logger = LogManager.getLogger(A3.class);
        logger.debug("This is debug message!!!");
        logger.info("This is info message!!!");
        logger.error("This is error message!!!");

    }
}