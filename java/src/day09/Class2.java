package day09;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
		
	
interface starbucks{
	void make(String coffee);
	void calculation(int cal);
	
}
	abstract class a implements starbucks{
		public void make() {
			System.out.println("커피 만들기");	
		}
		public void claculation() {
			System.out.println("판매");
		}
		abstract class b extends a{
			
			
		
		}
	}



