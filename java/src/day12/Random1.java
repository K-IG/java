package day12;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 Rand1 r1 = new Rand1();
			 r1.go1();
			 r1.go2();
			 r1.go3();
	}

}

class Rand1{
	Random rand = new Random();
	
	public void go1() {
		
		int result = rand.nextInt(10);
		System.out.println(result);
	}
	public void go2() {
		int result = rand.nextInt(10)+1;
		System.out.println(result);
		
	}

public void go3() {
	int result = rand.nextInt(6)+100;
	System.out.println(result);
}
}
