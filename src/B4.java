import java.util.*;

/**
 * 題目編號 Java-B4：在 Map 中放入數個 key & value 並印出
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B4 {

    public static void main(String args[]){

        try {

            // 無排序
            Map numberHashMap = new HashMap<>();
            putMapKeyValue(numberHashMap);
            printMapKeyValue(numberHashMap);

            // 依 insert 順序
            Map numberLinkedHashMap = new LinkedHashMap<>();
            putMapKeyValue(numberLinkedHashMap);
            printMapKeyValue(numberLinkedHashMap);

            // 依 key 排序
            Map numberTreeMap = new TreeMap<>();
            putMapKeyValue(numberTreeMap);
            printMapKeyValue(numberTreeMap);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void putMapKeyValue(Map map){
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
    }

    private static void printMapKeyValue(Map map){
        System.out.println(map.getClass());
        for(Object key : map.keySet()){
            System.out.println(key + "：" + map.get(key));
        }
        System.out.println();
    }
}
