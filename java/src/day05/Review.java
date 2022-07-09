package day05;

public class Review {

	public static void main(String[] args) {
		//출력 syso
		System.out.println("출력");

		
		//변수
		String str1 = "hello world";
		int num1 = 0;
		double dNum1 = 0.0;
		System.out.println(str1 + "," + num1 + ","+dNum1);
		
		//조건물 if, switch 
		if(num1 > 0) {
			System.out.println("양수");
		}else if(num1 == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		switch(num1) {
		case -1:
		System.out.println("-1");break;
		case 0:
			System.out.println("0");break;
		case 1:
			System.out.println("1");break;
			default:
				System.out.println("그밖에");
		}
		switch(num1 % 2) {
		case 0:
			System.out.println("짝수");
		case 1:
			System.out.println("홀수");
			
		}
		//반복분 while, for (+break, continue)
		int j = 0;
		while(j < 1) {
			System.out.println("while 문");
			j++;
		}
			for(int i = 0; i<1; i++) {
				
				System.out.println("for문");
			}
			for (int i = 0; i < 10; i++) {
				if(i == 5) {
					continue;
				}
				System.out.println(i+"번");
				
			}
		
		
	}

}
