	package day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Review {
	public static void main(String[] args) {
		R1 r1 = new R1();
		r1.go();
		R2 r2 = new R2();
		r2.go();
		R2 r3 = new R3();
		r3.go(10,3);
	}

}

class R1{
	//클래스 멤버
	private String s1;						// 클래스 멤버변수는 일반적으로 private을 앞에 붙여줌
	
	
	public void go() {						// 클래스 멤버함수(메서드)는 일반적으로  public을 앞에 붙여줌
		//지역 (함수내부)
		
		String s1 = null;					// 지역변수는 만들때 초기화 작업을 같이 해준다. null은 빈값을 의미
		s1 ="hello world";
		this.s1 = s1.substring(0,4+1);		//  substring : 자르기
		if(s1.equals(this.s1)) {
			System.out.println("둘은 같다");
		}else {
			System.out.println("둘은 다르다");
		}
		System.out.println(this.s1);
	}
}

class R2{
	
	Calendar cal = Calendar.getInstance();
	Date date = cal.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-ss");
	
	String time = sdf.format(date);
	
	
	public void go() {
		System.out.println(time);
		int year = Integer.parseInt(time.substring(0, 4));
		System.out.println("작년은"+ (year-1));
		
		
	
	}
}

class R3{
	private int n1, n2;
	
	public void go(int n1 , int n2) {
		this.n1 = n1;
		this.n2 = n2;
		try {
		System.out.println(n1/n2);
		}catch (Exception e) {
			System.out.println("0으로는 나눌 수 없습니다");
		}
		
		
	}
}