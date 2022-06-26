package day02;

import java.util.Scanner;
	import java.util.Scanner;
public class IIf4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요:");
		int a;
		a = sc.nextInt();
		if(a >= 20) {
			//20이상
			System.out.println("성인입니다");
		}
		if(a < 20 && a >= 14) {
			//14이상 20미만
			System.out.println("청소년 입니다");
		}
		if(a < 14) {
			//14 미만
			System.out.println("어린이 입니다");
		}

	}
	 
}
