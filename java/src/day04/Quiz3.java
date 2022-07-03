package day04;
import java.util.Scanner;
public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		System.out.print(" 구구단 단수를 입력하세요: ");
			int i = sc.nextInt();
		for (int j = 1; j < 9; j++) {
				total = i * j;
				System.out.println(i+"X"+j+"= "+total);
				
			
		}
		

	}

}
