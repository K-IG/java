package day14;

import java.util.Scanner;

public class Thread2 {

	public static void main(String args[]) {
		MyThread1 m = new MyThread1();
		MyThread2 m2 = new MyThread2();
		m.start();
		m2.start();

	}
}

class MyThread1 extends Thread {
	Scanner sc = new Scanner(System.in);
	String a;
	public void run() {
		System.out.println("아무거나 입력해주세요: ");
		a = sc.next();
		for (int i = 0; i < 1000000000; i++) {
			
			System.out.println(a);
			try {
				 MyThread1.sleep(500); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {
	
	public void run() {
		for (int i = 0; i < 1000000000; i++) {
			System.out.println("Hello world");
			try {
				MyThread2.sleep(1000); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
