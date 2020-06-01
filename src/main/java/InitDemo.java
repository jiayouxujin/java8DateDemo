import java.util.Date;

public class InitDemo {

    public static void main(String[] args) {
        Date wrongDate = new Date(2019, 12, 31, 11, 12, 13);
        System.out.println(wrongDate);

        Date rightDate=new Date(2019-1900,11,31,11,12,13);
        System.out.println(rightDate);
    }

}
