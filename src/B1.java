import java.util.Scanner;

/**
 * 題目編號 Java-B1：判斷字串 a 是否包含字串 b
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B1 {
    public static void main(String args[]){
        try {
            Scanner input = new Scanner(System.in);

            // 取得輸入的字串
            System.out.print("Input sentence:");
            String inputSentence = input.next();
            System.out.print("Input subsentence:");
            String inputSubsentence = input.next();

            // 判斷輸入之子字串是否包含在主字串內
            String outputResult = "";
            if(inputSentence.indexOf(inputSubsentence) >= 0){
                outputResult = "<" + inputSubsentence + "> is included in <" + inputSentence + ">";
            } else{
                outputResult = "<" + inputSubsentence + "> is not included in <" + inputSentence + ">";
            }
            System.out.println(outputResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
