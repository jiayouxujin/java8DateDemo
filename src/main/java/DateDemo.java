import java.util.Date;
import java.util.TimeZone;

public class DateDemo {
    public static void main(String[] args) {
        System.out.println(new Date(0));
        System.out.println(TimeZone.getDefault().getID()+":"+TimeZone.getDefault().getRawOffset()/3600000);
    }
}
