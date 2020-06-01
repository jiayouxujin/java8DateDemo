import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class RightDemo {

    public static void main(String[] args) {
        String stringDate="2020-01-02 22:00:00";
        ZoneId timeZoneSH=ZoneId.of("Asia/Shanghai");
        ZoneId timeZoneNY=ZoneId.of("America/New_York");
        ZoneId timeZoneJST= ZoneOffset.ofHours(9);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZonedDateTime dateTime=ZonedDateTime.of(LocalDateTime.parse(stringDate,dateTimeFormatter),timeZoneJST);

        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        System.out.println(timeZoneSH.getId()+dateTimeFormatter1.withZone(timeZoneSH).format(dateTime));
        System.out.println(timeZoneNY.getId()+dateTimeFormatter1.withZone(timeZoneNY).format(dateTime));
        System.out.println(timeZoneJST.getId()+dateTimeFormatter1.withZone(timeZoneJST).format(dateTime));

    }
}
