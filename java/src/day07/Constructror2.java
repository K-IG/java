package day07;

public class Constructror2 {

	public static void main(String[] args) {
		Person p = new Person("","",1);
		p.go();
		
		
		

	}

}

class Person{
	// 생성자를 통해서 set
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
		Person(String n , String w, int a){
			setA(1);
			setN("ㅇㄹㅇ");
			setW("대한민국");
			
			
		}
		
		
		public void go() {
		//go 함수를 통해서 syso(get)
			System.out.println( "나라:"+getW()+ " 이름: "+ getN()+ " 나이: " +getA());
			
	}
}