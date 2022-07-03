package day04;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String id = "dddd";
		int pw = 0;

		while (i < 5) {
			System.out.print("아이디를 입력하세요: ");
			id = sc.next();
			System.out.print("비밀번호를 입력하세요: ");
			pw = sc.nextInt();
			if ((id.equals("hello") && pw == 1234)) {

				System.out.println("로그인 성공");
				break;

			} else {
				System.out.println("실패");

			}
			i++;
		}
	}
}
