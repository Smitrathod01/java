import java.util.*;

public class CalanderFUnction {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance(); 
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone());

        Calendar a = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(a.getCalendarType());
        System.out.println(a.getTimeZone().getID());

        //calander methods
        System.out.println(a.get(Calendar.DATE));
        System.out.println(a.get(Calendar.SECOND));
        //u can print railway like time by printing both hour and min in sout

        GregorianCalendar d = new GregorianCalendar();
        System.out.println(d.isLeapYear(2020));//will show leap year or not



    }
    
}
