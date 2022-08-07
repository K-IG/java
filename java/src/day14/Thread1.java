package day14;

public class Thread1 {

	public static void main(String[] args) {
		MyClass1 m1 = new MyClass1();
		m1.go();
		MyClass2 m2 = new MyClass2();
		m2.go();
		MyClass3 m3 = new MyClass3();
		m3.go();
		
		//프로그램 : 개발자가 만든 애플리케이션
		//프로세스 : 실행중인 프로그램
	}

}

class MyClass1{
	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyClass1");
			try {
				sleep(500);
				catch
			}
		}
	}

	
	
	
	
}






class MyClass2{
	public int  go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyClass2");
		}
	return 0;	
	}

}                   



class MyClass3{
	public String go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyClass3");
		}
		return " ";
	}
}






