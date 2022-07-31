package day12;
import java.util.Scanner;
import java.util.Random;
public class Random2 {

	public static void main(String[] args) {
		Random3 r3 = new Random3();
		r3.go1();
	}

}

class Random3{
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	public void go1() {
		int a;
		int b;
		System.out.println("숫자를 입력하세요: ");
		a = sc.nextInt();
		System.out.println("숫자를 입력하세요:");
		b = sc.nextInt();
		System.out.println(result);
		
	}	
}

