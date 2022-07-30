         package day10;

import java.awt.Menu;

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
	
	@SuppressWarnings("null")
	public void go(String info) {
		int idx = info.indexOf("name=");
		Name.subSequence(idx +5, idx+8);
		String munuCode = null;
		if(munuCode.equals("A01")) {
			munuCode = "아메리카노";
		}
		else if(munuCode.equals("A03")) {
			munuCode = "카푸치노";
		}
		else if (munuCode.equals("A04")) {
			munuCode = "카페라떼";
		}
		else if (munuCode.equals("E01")) {
			munuCode = "오렌지 주스";			
		}
		idx = info.indexOf("num=");
		String numCode = info.substring(idx +4, idx +6);
		int num = Integer.parseInt(numCode);
		
		idx = info.indexOf("price");
		String priceCode = info.substring(idx +6, num +12);
		System.out.println(priceCode);
		
		System.out.println(Name+ " " + num+"잔 주문" + price*num+"원");
		
	
			
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}