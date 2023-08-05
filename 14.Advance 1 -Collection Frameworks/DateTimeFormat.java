import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E a");
        DateTimeFormatter df2=DateTimeFormatter.ISO_DATE_TIME;

        String my = dt.format(df);
        System.out.println(my);

        String my1 = dt.format(df2);
        System.out.println(my1);

        
    }
    
}
