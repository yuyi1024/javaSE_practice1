import java.util.HashMap;

/**
 * 題目編號 Java-B3：為 HashMap 設定值並印出
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B3 {
    public static void main(String args[]){
        try {
            HashMap<String, Integer> namberHashmap = new HashMap<>();
            namberHashmap.put("one", 1);
            namberHashmap.put("two", 2);
            namberHashmap.put("three", 3);
            System.out.println(namberHashmap.get("two"));   // 2

            // key 不存在，return null
            System.out.println(namberHashmap.get("four"));  // null

            // key 是否存在
            System.out.println(namberHashmap.containsKey("three"));  // true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
