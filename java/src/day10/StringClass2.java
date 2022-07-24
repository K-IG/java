package day10;

public class StringClass2 {

	public static void main(String[] args) {
		Quiz2 q2 = new Quiz2();
		String info1 = "STAname=A01price=001000num=02ED";
		String info2 = "STAname=A01price=001000num=01ED";
		q2.go(info1);
		q2.go(info2);

	}

}
class Quiz2{
	 String Name;    
	 int num;       
	 public int price;  
	
	public void go(String info) {
		int idx = 0;
		idx = info.indexOf("STAname");
		Name.subSequence(idx, idx+1);
		System.out.println("아메리카노");
		
		idx = info.indexOf("price");
		this.price = price;
		System.out.println(2000);
	
			
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}