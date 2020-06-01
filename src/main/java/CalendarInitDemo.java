import java.util.Calendar;
import java.util.TimeZone;

public class CalendarInitDemo {

    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(2019,11,31,11,12,13);
        System.out.println(calendar.getTime());
        Calendar calendar1=Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        calendar1.set(2019,Calendar.DECEMBER,31,11,12,13);
        System.out.println(calendar1.getTime());
    }
}
