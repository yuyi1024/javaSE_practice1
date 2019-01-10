
/**
 * 題目編號 Java-B8：若第一個命令列參數為 -a 卻沒有第二個參數，丟出錯誤
 *
 * @param args[0] the element to insert
 * @throws Exception if args[0] is "-a" but args.length <= 1
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B8 {

    public static void main(String args[]) throws Exception{

        try{

            // 若 args[0] 是 "-a" ，則 args[1] 必須存在，否則 throw Exception
            if(args[0].equals("-a") && args.length <= 1){
                throw new Exception("Argument 2 is required.");
            }
            for(String arg : args){
                System.out.print(arg + " ");
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please input an argument in cmd.");
            e.printStackTrace();
        }
    }
}
