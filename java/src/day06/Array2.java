package day06;
import java.util.Scanner;
public class Array2 {

	private static int i;
	private static char[][] num;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayEx array1Ex = new ArrayEx();
		String[] m = {"커피1","커피2","커피3","커피4"};		
		System.out.println("커피 종류를 선택하세요:");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			if("커피1" != null) {
				System.out.println(num[i]);
			}
			System.out.println();
		case 2:
			if("커피2" != null) {
				System.out.println(num[i]);
			}
		case 3 : if("커피2" != null) {
			System.out.println(num[i]);
		} 
			
		case 4:if("커피2" != null) {
			System.out.println(num[i]);
		}
		
		}
		
		int num[] = {1000,2000,3000,4000}; 
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			array1Ex.go();
		}
		for (int i = 0; i < num.length; i++) {
		
			
		}System.out.println("고객님께서 선택하신 커피의 종류와 가격은: " + num[i]);
		
		
		
	}
		
		

	}


