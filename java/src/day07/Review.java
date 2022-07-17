package day07;

class ReviewClass{
	private int num[] = {1,2,3,4};
	
	public void go() {
	
	System.out.println("객체화 성공!");
	}
	
	public void numChange() {
		int sum = num[0];
		num[0] = 11;
		num[1] = 22;
		num[2] = 33;
		num[3] = 44;
		for (int i = 0; i < num.length; i++) {
			sum = num[i];
		}
		System.out.println(sum);
		
	}
	
	
	
	
}



public class Review {

	public static void main(String[] args) {
		ReviewClass r = new ReviewClass();
		numChange n = new numChange();
		r.go();
		
	
	}

}
