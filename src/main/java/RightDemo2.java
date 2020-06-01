import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class RightDemo2 {

    private static DateTimeFormatter dateTimeFormatter=new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR)
            .appendLiteral("/")
            .appendValue(ChronoField.MONTH_OF_YEAR)
            .appendLiteral("/")
            .appendValue(ChronoField.DAY_OF_MONTH)
            .appendLiteral(" ")
            .appendValue(ChronoField.HOUR_OF_DAY)
            .appendLiteral(":")
            .appendValue(ChronoField.MINUTE_OF_HOUR)
            .appendLiteral(":")
            .appendValue(ChronoField.SECOND_OF_MINUTE)
            .appendLiteral(".")
            .appendValue(ChronoField.MILLI_OF_SECOND)
            .toFormatter();

    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.parse("2020/1/2 12:35:56.789",dateTimeFormatter);
        System.out.println(localDateTime.format(dateTimeFormatter));
        String dt="20160901";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyyMM");
        System.out.println("result"+dateTimeFormatter.parse(dt));
    }
}
