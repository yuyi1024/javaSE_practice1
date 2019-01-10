import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 題目編號 Java-B7：建立 Calendar 物件，並計算自 1970/1/1 經過之毫秒
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B7 {
    public static void main(String args[]){

        try {
            SimpleDateFormat defaultDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

            // String 轉 Date
            String dateString = "2003/11/10 20:00:00";
            Date date = defaultDateFormat.parse(dateString);

            // 建立 Calender，取得 millseconds
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(calendar.getTimeInMillis() + " milliseconds ago from 1970/1/1");

            // Date 轉 String
            Date today = new Date();
            String todayString = defaultDateFormat.format(today);
            System.out.println(todayString);

        } catch (ParseException e) {
            System.out.println("Wrong format to parse.");
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
