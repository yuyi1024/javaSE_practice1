import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Property;

/**
 * 題目編號 Java-A4：
 *
 * @throws IOExpection if properties file not found
 * @author Yuyi Lee
 * @version 1.0 Jan-06-2019
 * @since 1.0
 */
public class A4 {

    public static void main(String args[]){

        try {
            // arg[0] -> 輸入之 properties 檔檔名
            // arg[1] -> 輸出之 txt 檔檔名
            String inputFilename = args[0];
            String outputFilename = args[1];

            Properties properties = new Properties();
            String configFile = "out/production/test/" + inputFilename + ".properties";
            InputStreamReader input = null;

            // 以 UTF8 輸入 properties 檔內容
            try{
                input = new InputStreamReader(new FileInputStream(configFile), "UTF8");
                properties.load(input);
            } catch (IOException e){
                System.out.println("File " + inputFilename + ".properties not found.");
            } finally {
                input.close();
            }

            Logger logger = LogManager.getLogger(A4.class);
            PrintWriter writer = new PrintWriter(outputFilename + ".txt", "UTF-8");

            for(String key : properties.stringPropertyNames()){
                logger.debug(key + " " + properties.getProperty(key));
                writer.println("[" + key + ", " + properties.getProperty(key) + "]");
            }

            writer.close();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input 2 arguments in cmd.");
            System.out.println("1.Filename of your propreties file(a4).");
            System.out.println("2.Filename of your output file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}