package day02;
	import java.util.Scanner;
public class Qz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력해 주세요:");
		int a;
		a = sc.nextInt();
		if(a>= 90) { 
			System.out.println("A");
		}
		else if(a>= 80){
			System.out.println("B");		
		}
	
		else if(a>= 70) {
			System.out.println("C");
		}
		else {
		System.out.println("F");
	}
		
	}

}


