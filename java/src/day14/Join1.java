package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Join1 {

	public static Object arrList;

	public static void main(String[] args) {
		

	}

}

class InitClass extends Thread{
	ArrayList<String> arrList = new ArrayList<String>(         
	Scanner sc = new Scanner(System.in);
	private String ss;
	@Override
	public void run() {
		while(true) {
			ss = sc.nextLine();
			Join1.arrList.add(ss);
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class AfterClass{
	
	@Override
	public void run() {
		System.out.println("그 다음 쓰레드 시작");
		for (int i = 0; i < Join1.arrList.size(); i++) {
			System.out.println(Join1.arrList.get(i));
		}
		System.out.println("그 다음 쓰레드 끝");
	}
	
}