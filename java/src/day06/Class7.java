package day06;

class Person{
	private String n;
	private String w;
	private int a;
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	}

public class Class7 {

	public static void main(String[] args) {
		//홍길동은 한국에서 온 23살이다.
		Person p = new Person();
		p.setN("홍길동");
		p.setW("한국");
		p.setA(23); 
		System.out.println(p.getN() + "은 " + p.getW() + "에서 온 " + p.getA() + "살이다.");
		//아무개은 캐나다에서 온 22살이다
		p.setN("아무개");
		p.setW("캐나다");
		p.setA(22);
		System.out.println(p.getN() + "은 " + p.getW() + "에서 온 " + p.getA() + "살이다.");
		
	}

}
