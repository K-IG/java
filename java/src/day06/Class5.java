package day06;

	class ClassSEx{
// 캡슐, 접근권한제어자, 정보은닉 : 구라
// public, protected, default, private
	public int num1;			//public : 어디서든 사용 가능
	protected int num2;			//protected : 
	int num3;		//default	//default: 같은 패키지 내에서 사용
	private int num4;			//private : 내 클래스 안에서만 사용 가능
	
	void test() {
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0;
	}
	public void num(int num4) {
		this.num4 = num4;
	}
}
	
	
public class Class5 {

	public static void main(String[] args) {
		ClassSEx c = new ClassSEx();
		c.num1 = 1;
		c.num2 = 1;
		c.num3 = 1;
		System.out.println(c.num2);
		
	}

}
