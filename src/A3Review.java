import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 題目編號 Java-A3
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-06-2019
 * @since 1.0
 */
public class A3Review {

    public static void main(String args[]){
        try {
            Logger logger1 = LogManager.getLogger("a3_r_2");

            logger1.trace("This is trace message!!!");
            logger1.debug("wThis is debug message!!!");
            logger1.info("This is info message!!!");
            logger1.warn("This is warn message!!!");
            logger1.error("This is error message!!!");
            logger1.fatal("This is fatal message!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}