package day05;

public class Class02 {

	public static void main(String[] args) {
				MyStr ms = new MyStr();
		
	}
}
	
class MyStr {
	String str = "";
	void myprint () {
		System.out.println(str);
	}
	void seveprint(String in) {
		str = in;
		MyStr ms = new MyStr();
		ms.seveprint("hello");
		ms.myprint();
	}
}

