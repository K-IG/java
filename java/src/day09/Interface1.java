package day09;

public interface Interface1 {
	// interface = 상수 + 함수 선언
	// 변수 선언 : 변수는 변수인데 값 변경이 안됨 final
	// 함수 선언 : {}구현부 없음
	final int num = 0;
	final static String str1 ="";
	
	//  final : 한번 값을 주면 변경이 안됨(상수), 법적인 문제
	//	static: 우선순위가 높다. 클래스간에 객체화없이 사용이 가능
	
	void go();			//{}가 없으니 선언: 상속받은 곳에서 반드시 만들어줘야함         
	
		
		
}
