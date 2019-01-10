import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class test {
    public static void main(String args[]) throws ParseException {
//        HashMap map = new HashMap<>();
//        map.put("1", "aaa");
//        map.put("4", "bbb");
//        map.put("6", "ccc");
//        map.put("2", "ddd");

//        for(Object k : map.entrySet()){
//            System.out.println(k);
//        }
//        System.out.println(map.get("3"));
//        System.out.println(map.containsKey("3"));
//        System.out.println(" abc de ".replaceAll("^+\\s", "").replaceAll("\\s+$", ""));

//        StringBuffer sb = new StringBuffer();
//        sb.append("I").append(" am").append(" a").append(" pen.");

//        String s = "2019/01/03 15:55:17";
//        DateFormat df = DateFormat.getDateInstance();
//        Date d = df.parse(s);

//        Calendar c = Calendar.getInstance();
//        c.setTime(new Date());
//        c.add(Calendar.MONTH, -1);
//        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println( f.format(c.getTime()));

//        String x = null;
//        x.equals("w");
//        int i = 888;
//        String a = Integer.toString(i);
//        System.out.println("888".equals(i));

        Date d1 = new Date(14,5,12);
//        Date d2 = new Date();
        Date d2 = new Date(){
            @Override
            public boolean after(Date dd){
                return false;
            }
        };

        System.out.println(d2.after(d1));
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(EraserSize.LARGE_ERASER.getSize());

    }
}
