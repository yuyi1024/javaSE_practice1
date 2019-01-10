import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * 題目編號 Java-B5：使用 SimpleDateFormat 印出當下日期時間
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B5 {
    public static void main(String args[]){

        try {
            SimpleDateFormat defaultDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            // Date convert String
            Date dateToConvert = new Date();
            String resultSring = defaultDateFormat.format(dateToConvert);
            System.out.println(resultSring);

            // String convert Date
            String stringToConvet = "2019-01-03 15:55:17";
            Date resultDate = defaultDateFormat.parse(stringToConvet);
            System.out.println(resultDate);

        } catch (ParseException e) {
            System.out.println("String is not formatted by specific format.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
