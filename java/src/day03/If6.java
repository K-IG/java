package day03;
import java.util.Scanner;
public class If6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int y;
		int m;
		int d = 0; 
		y = sc.nextInt();
		
		System.out.println("월을 입력하세요");
		m = sc.nextInt();
		if(y<0)
			System.out.println("?");
		
		else {
			switch(m) {
			case 4: case 6: case 9: case 11:
				d =30;break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				d = 31; break;
			case 2: 
				if(((y)%4 ==0) && !(y%100==0)|| (y%400==0)) {
					d=29;
				}else 
					d = 28; break;
					default:
						System.out.println("월의 입력이 잘 못 되었습니다");
						
			}
			if(d == 0 )
				System.out.println("구할 수 없습니다.");
		else 
			System.out.println(y+"년의" + m + "월의 일수는" + d +"일입니다");
		


}
}
}