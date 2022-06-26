package day02;
	import java.util.Scanner;
public class If2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("나이를 입력해주세요:");
			int a;
			a = sc.nextInt();
			if(a >= 20) {
				System.out.println("성인입니다");
			}
			if(a < 20 && a >= 14) {
				System.out.println("청소년 입니다");
			}
			if(a < 14) {
				System.out.println("어린이 입니다");
			}
			
				
	}

}
