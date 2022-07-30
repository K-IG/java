package day11;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		 int num = Integer.parseInt(sc.nextLine());
		 if(999 >= num) {
			 System.out.println(num);
		 } else if(num <= 2147483647) {
			 System.out.printf("%,d",num);
			 
		 }
	
	
	
	}
}