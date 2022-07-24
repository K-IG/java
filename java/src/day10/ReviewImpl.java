package day10;

public class ReviewImpl {

	public static void main(String[] args) {
		Review r1 = new ReviewImpl();
		r1.func1();
		r1.func2(11);
		
		final int number = 12;
		number = 33;
		
		
		
	}
	@Override
	public void func1() {
		String str ="";
		System.out.println("impl에서 구현");
		
		
	}

}

class Review2{
	
	public void go() {
		ReviewImpl.str = "객체화없이 정적변수 대입/사용";
	}
}

