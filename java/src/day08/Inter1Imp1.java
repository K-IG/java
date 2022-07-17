package day08;

public class Inter1Imp1 extends MyClass implements Inter1{

	//myClass
	//인터페이스를 상속(지정)받으면 인터페이스의 함수를 모두 완성해줘야함
	//Implements 라는 것으로 상속을 받고 클래스에 빨간밑줄이 가면 마우스를 올려준다
	// Add umimplemented methods 라는 것을 클릭해서 오버라이딩(재정의,수정)힌다.
	
	public static void main(String[] args) {
		//static : 우선순위 높음,
		Inter1Imp1 imp1 = new Inter1Imp1();
		imp1.go();
		
		Inter1 inter1 = new Inter1Imp1();
		inter1.go();

		
	}
	
	public void go() {
		
		System.out.println("인터페이스 상속 완료");
	}

}

class MyClass{
	
}


class MyClass2{
	
}

interface MyInter{
	
}
