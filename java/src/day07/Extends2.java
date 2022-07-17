package day07;

public class Extends2 {

	public static void main(String[] args) {
		Member m = new Member("",123);
		m.go();

	}

}


class Human{
	
	protected String name;
	protected int a;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}

class Member extends Human{
	Member(String name, int a){
		super.name = name;
		super.a = a;
	}
	public void go() {
	setName("홍길동");
	setA(123);
	System.out.println("이름: " + name + " 나이: " + a);
	}
	
}
