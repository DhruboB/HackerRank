package warmap;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _10TimeConversion {

    public static void main(String[] args) {
        String time12 = "07:05:45PM";
        try {
            DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");
            DateFormat dateFormat24 = new SimpleDateFormat("HH:mm:ss");
            Date time = dateFormat.parse(time12);
            String time24 = dateFormat24.format(time);
            System.out.println(time);
            System.out.println(time24);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
