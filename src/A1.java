import java.util.*;

/**
 * 題目編號 Java-A1：計算句子的單字出現次數
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-05-2019
 * @since 1.0
 */
public class A1 {
    public static void main(String args[]){
        try {
            String originString = "This is a book. That is a pencil.This is good, and that is bad”.";

            // 將句子以','和'.'和' '分割
            String splitWordsArray[] = originString.split(",|\\.| ");
//            String splitWordsArra1y = originString.replaceAll(",|\\.", " ");

            HashMap<String, Integer> wordAndTimesMap = new HashMap<>();

            for(String word : splitWordsArray){

                // 將每個 word 的字首轉大寫
                if(word.length() > 1){
                    word = word.substring(0, 1).toUpperCase() + word.substring(1);
                } else{
                    word = word.toUpperCase();
                }
                // 將 wordsArray 中 的 word 計算次數，並以 {單字 => 次數} 寫進 map 裡
                if(word.length() > 0){
                    if(wordAndTimesMap.get(word) == null){
                        wordAndTimesMap.put(word, 1);
                    } else{
                        int appearTimes = wordAndTimesMap.get(word) + 1;
                        wordAndTimesMap.put(word, appearTimes);
                    }
                }
            }

            ArrayList<Map.Entry<String, Integer>> wordAndTimeList = new ArrayList<>(wordAndTimesMap.entrySet());

            Collections.sort(wordAndTimeList, new Comparator<Map.Entry<String, Integer>>(){
                @Override
                public int compare(Map.Entry<String, Integer> element1, Map.Entry<String, Integer> element2){

                    // if e1 > e2 -> 1 : e1往後比
                    // if e1 = e2 -> 0 : e1往後比
                    // if e1 < e2 -> -1: e1往前比
                    return element1.getValue().compareTo(element2.getValue());
                }
            });
            System.out.println();
            for(Map.Entry<String, Integer> listElement : wordAndTimeList){
                System.out.println(listElement.getKey() + "  " + listElement.getValue());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}