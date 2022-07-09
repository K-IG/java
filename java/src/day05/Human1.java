package day05;


class Human{
	String name;
	String g;
	int a;
	int k;
	
	void 사람정보입력(String 이름, String 성별, int 나이, int 키) { 
		name = 이름;
		g = 성별;
		a = 나이;
		k = 키;
		
	}
	String 사람정보출력() { 
		return "이 사람의 이름: " + name +"," + " 성벌2 : "+ g + "," + " 나이: " + a +"," + " 키: "+ k;
	}
}

public class Human1 {

	public static void main(String[] args) {
		Human h = new Human();
		h.사람정보입력("김인근", "남자", 18, 999);
		System.out.println(h.사람정보출력());
		
		
		
		

	}

}
