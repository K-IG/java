package day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time1 {

	public static void main(String[] args) {
		

	}

}

class NowTime{
public void go() {
	// main
	Calendar cal = Calendar.getInstance();
	Date date = cal.getTime();
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH분 ss초");
	System.out.println(sdf1.format(date));
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
	SimpleDateFormat sdf3 = new SimpleDateFormat("MM");
	System.out.println(sdf2.format(date)+"년");
	System.out.println(sdf3.format(date)+"월");	
}

	public void go2() {
		
		
	}
		
	}
	
