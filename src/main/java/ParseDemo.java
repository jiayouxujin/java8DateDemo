import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ParseDemo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
        System.out.println("defaultLocale:"+Locale.getDefault());
        Calendar calendar=Calendar.getInstance();
        calendar.set(2019,Calendar.DECEMBER,29,0,0,0);
        SimpleDateFormat YYYY=new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(String.format("格式化" + YYYY.format(calendar.getTime())));
        System.out.println("weekYear"+calendar.getWeekYear());
        System.out.println("firstDayOfWeek"+calendar.getFirstDayOfWeek());
        System.out.println("minimalDaysInFirstWeek"+calendar.getMinimalDaysInFirstWeek());
    }
}
