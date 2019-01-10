import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;

/**
 * 題目編號 Java-A3：將 log 寫進 console 跟 rollingfile
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-06-2019
 * @since 1.0
 */
public class A3 {

    public static void main(String args[]){
        Logger logger = LogManager.getLogger(A3.class);

        logger.trace("This is trace message!!!");
        logger.debug("This is debug message!!!");
        logger.info("This is info message!!!");
        logger.warn("This is warn message!!!");
        logger.error("This is error message!!!");
        logger.fatal("This is fatal message!!!");
    }
}