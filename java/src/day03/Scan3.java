package day03;
import java.util.Scanner;
public class Scan3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		int e;
		int m;
		
		
		System.out.print("국어 점수를 입력하세요:");
		k = sc.nextInt();
		System.out.print("영어 점수를 입력하세요:");
		e = sc.nextInt();
		System.out.print("수학 점수를 입력하세요:");
		m = sc.nextInt();
		int total = k+e+m;
		
		if(k>=40 && e >= 40 && m>=40 && total >=150) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
			}sc.close();
	}
}


