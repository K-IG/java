package day10;

public class StringClass1 {

	public static void main(String[] args) {
		MyString1 ms1 = new MyString1();
		ms1.go();

	}

}

class Quiz1{
	String info="안녕하세요 저는 홍길동입니다.";
	public void name() {

		public void hello() {
			
		}
		publ 
		ic void bye;
		public void Info() {
			
		}
	}
}


class MyString1{
	
	int var1;				//자료형이 붉은색이고 소문자 (기본자료형)
	double var2;			//붉은색, 소문자(기본자료형)
	String var3;			//까만색, 맨 앞이 대문자 : 기본 자료형이 아닌 클래스
	boolean var4;			//붉은색, 소문자 (기본자료형)
	
	
	public void go() {
		// String만 갖고있는 메서드
		//1. equals(): 같은지 비교
		var3.equals("Hello world!");		//같으면 true, 다르면 false
		
		//2. contains(): 포함하는지 검사
		var3.contains("world");				//var3에 world가 들어있으면 true, 없으면false
		//3.replace(): 교체
		var3 =var3.replace("world", "Java");
		System.out.println(var3);
		
		//4. length(): 글자 갯수를 알려줌
		var1 = var3.length();
		System.out.println(var1);
		
		//5. indexOf(): 해당 글자의 위치를 알려줌
		var1 = var3.indexOf('!');
		System.out.println("!의 방번호는 : "+var1);
		
		//6. 방번호를 알려주면 해당 글자를 알려줌(반환)
		char var5 = var3.charAt(10);	//방번호는 0부터 시작
		System.out.println("10번째 방에 있는 문자는 " + var5);
		
		//7. substring(): 잘라내기
		var3 = var3.substring(0, 4+1); 		//Hello Java!
		System.out.println("0번부터 4번까지 자른 결과: " + var3);
		
		//8. + : 합치기
		var3 = var3 + "World!";
		System.out.println(var3 + "World!");
		
		
		
		
		
		
	}
}