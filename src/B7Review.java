import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.abs;

/**
 * 題目編號 Java-B7
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B7Review {
    public static void main(String args[]){

        // get current calendar
        Calendar calendar = Calendar.getInstance();
        Calendar currentCalendar = (Calendar)calendar.clone();

        // convert Calendar to Date
        System.out.println(calendar.getTime());

        // 加減日期時間
        calendar.add(Calendar.MONTH, -2);
        calendar.add(Calendar.HOUR, 4);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());

        // 比較兩個 Calendar before/after，return true/false
        System.out.println(calendar.after(currentCalendar));
        System.out.println(calendar.before(currentCalendar));

        // 比較大小
        System.out.println(currentCalendar.compareTo(calendar));    // 1
        System.out.println(calendar.compareTo(currentCalendar));    // -1

        System.out.println(calendar.equals(currentCalendar));   // false

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));   // 0~11
        System.out.println(calendar.get(Calendar.DATE));

        // set
        System.out.println(calendar.isSet(Calendar.MONTH));     // true
        calendar.set(1994, 10, 24);
        calendar.set(Calendar.HOUR, 8);
        calendar.setTime(new Date());
        calendar.setTimeInMillis(Long.parseLong("1546387201000"));

        // convert Calendar to String
        SimpleDateFormat defaultDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(defaultDateFormat.format(calendar.getTime()));

        // calc interval between two Calendar
        long totalSecond = TimeUnit.MILLISECONDS.toSeconds(abs(calendar.getTimeInMillis() - currentCalendar.getTimeInMillis()));
        long intervalDay = TimeUnit.SECONDS.toDays(totalSecond);
        totalSecond -= TimeUnit.DAYS.toSeconds(intervalDay);
        long intervalHour = TimeUnit.SECONDS.toHours(totalSecond);
        totalSecond -= TimeUnit.HOURS.toSeconds(intervalHour);
        long intervalMinute = TimeUnit.SECONDS.toMinutes(totalSecond);
        totalSecond -= TimeUnit.MINUTES.toSeconds(intervalMinute);
        long intervalSecond = TimeUnit.SECONDS.toSeconds(totalSecond);
        System.out.println(intervalDay + "days " + intervalHour + "hours " + intervalMinute + "minutes " + intervalSecond + "seconds");
    }
}
