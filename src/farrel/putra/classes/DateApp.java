package farrel.putra.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();

        // get current time
        System.out.println(date);
        // get current milisecond
        System.out.println(date.getTime());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.set(Calendar.YEAR, 2010); // set year as the written year in argument
        calendar.add(Calendar.YEAR, -10); // subtract year by 10 years
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 13);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
