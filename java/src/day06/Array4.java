package day06;
	import java.util.Scanner;




public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array4 a = new Array4();
		String e[]  = {"대한민국","중국","일본","러시아"};
		String s[] = {"서울", "베이징", "도쿄","모스크바"};
		String h;
		System.out.print("수도를 알고싶은 나라를 입력해 주세요: ");
		h = sc.next();
		
		
	
		switch(h) {
		case "대한민국":
				System.out.println("서울");break;
			
		case "중국" :
			System.out.println("베이징");break;
		
		case "일본" :
			System.out.println("도쿄");break;
		
		case "러시아" :
			System.out.println("모스크바");break;
			
		}
		
		
		

	}

	
	}

