import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class WrongDemo {

    public static void main(String[] args) throws ParseException {
        String stringDate="2020-01-02 22:00:00";
        SimpleDateFormat inputFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=inputFormat.parse(stringDate);
        System.out.println(date+":"+date.getTime());

        inputFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        Date date1=inputFormat.parse(stringDate);
        System.out.println(date1+":"+date1.getTime());
    }
}
