import java.lang.Runtime;
import java.io.IOException;

/**
 * 題目編號 Java-B9：在命令列第一個參數輸入執行檔檔名，並執行該檔
 *
 * @param args[0] the element to insert
 * @author Yuyi Lee
 * @version 1.0 Jan-03-2019
 * @since 1.0
 */
public class B9 {

    public static void main(String args[]){

        try {
            Runtime runtime = Runtime.getRuntime();
            String applicationName = "cmd /c start " + args[0];
            runtime.exec(applicationName);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please insert application name.");
        } catch (IOException e){
            System.out.println("Application Not Found.");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
