package day02;
	import java.util.Scanner;
public class If4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요: ");
		int a;
		a = sc.nextInt();
		
		if(a >=20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
	
	}
}