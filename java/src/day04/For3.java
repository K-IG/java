package day04;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("나이를 입력하세요:");
			int a;
			a = sc.nextInt();
			
			if(a >= 50) {
				System.out.println("50대 이상입니다");
			}
			else if(a >= 40) {
				System.out.println("40대 이상입니다");
			}
			else if(a >= 30) {
				System.out.println("30대 이상입니다");
			}
			else if(a >= 20) {
				System.out.println("20대 이상입니다");
			}
			else {
				System.out.println("미성년자 입니다.");
			}
		}

	}	

}


