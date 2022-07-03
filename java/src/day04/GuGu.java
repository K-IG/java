package day04;

public class GuGu {

	public static void main(String[] args) {
		System.out.println("구구단 출력");
		int total= 0;
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j<=9; j++) {
				total = i * j;
				System.out.println(i + "x" + j + "=" + total);
				
			}
			
		}

	}

}
