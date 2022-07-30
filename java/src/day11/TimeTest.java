package day11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeTest {

	public static void main(String[] args) {
		

	}

}

class DateTimeUtil {
    public static String getTomorrow(String pattern) {
        DateFormat dtf = new SimpleDateFormat(pattern);
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        return dtf.format(cal.getTime());
    }

    public static void main(String[] args) {
        
        System.out.println(getTomorrow(" yyyy-MM-dd-HH-mm-ss"));
    }
}