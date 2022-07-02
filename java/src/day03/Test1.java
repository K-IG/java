package day03;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		int m;
		int d = 0;
		System.out.print("년도를 입력하세요:");
		y = sc.nextInt();
		System.out.print("월을 입력하세요:");
		m = sc.nextInt();
		
		if(m == 4 || m== 6 || m==9 || m==11) {
			d =30; 
		}else if(m == 1 || m== 3 || m==5 || m==7 || m == 8 || m == 10 || m==12) {
			d = 31;
		}else if (m == 0) {
			System.out.println("구할 수 없습니다.");
		}else if (m == 2) {
			 if((y % 4==0) && !(y%100==0) || (y%400==0)) {
				 System.out.println("?");
			 }
		}
			System.out.println(y+"년의" + m + "월의 일수는" + d +"일입니다");

	}
}
