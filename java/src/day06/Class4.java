package day06;

class 사칙연산{
	
	private int sum;
	public void A(int[] x){
		int sum = x[0];
		for(int i = 0; i<x.length; i++) {
			sum += x[i];
		}
	}
		
		public void A1(int[] x){
			int sum = x[0];
			for(int i = 0; i<x.length; i++) {
				sum -= x[i];
			}
		}
			public void A2(int[] x){
				int sum = x[0];
				for(int i = 0; i<x.length; i++) {
					sum *= x[i];
				}
			}
				public void A3(int[] x){
					int sum = x[0];
					for(int i = 0; i<x.length; i++) {
						sum /= x[i];
					}
				}
				public int 출력() {
					return sum;	
					
				}

				
				
}

public class Class4 {

	public static void main(String[] args) {
		사칙연산 sh = new 사칙연산();
		
		

	}

}

