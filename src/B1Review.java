import java.util.Scanner;

/**
 * 題目編號 Java-B1：
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B1Review {
    public static void main(String args[]){
        String sentance = "ABCDEFABCCFEG";
        String subsentance = "AB";

        System.out.print("  S NA  IL      ".replaceAll("^\\s+", "").replaceAll("\\s+$", ""));

        System.out.println(sentance.indexOf(subsentance));  // 0

        // 從第六個字元開始找
        System.out.println(sentance.indexOf(subsentance, 6));   // 6

        // 從後面開始找
        System.out.println(sentance.lastIndexOf(subsentance));  // 6

        // trim() 頭尾去空白
        System.out.println("   I am a pan.    ".trim());

        // startsWith()
        System.out.println(sentance.startsWith("AB"));  // true
        System.out.println(sentance.startsWith("BA"));  // false

        // endsWith()
        System.out.println(sentance.endsWith("EG"));    // true
        System.out.println(sentance.endsWith("GE"));    // false

        // substring(m, m) 從 m(包含) 到 n(不包含)
        System.out.println(sentance.substring(3));  // DEFABCCFEG
        System.out.println(sentance.substring(3, 6));   // DEF

        // String class equals() overrides Object class equals()
        // 比較 value，而非 memory 位置
        System.out.println("QWQ".equals("QWQ"));    // true
        System.out.println("QWQ".equals("qwq"));    // false

        // contains() vs. indexOf()
        System.out.println(sentance.contains(subsentance));     // true

        // convert int to string
        System.out.println(String.valueOf(1234).getClass());    // String
    }
}
