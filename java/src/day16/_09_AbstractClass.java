package day16;

public class _09_AbstractClass {

	public static void main(String[] args) {
		

	}

}

// 인터페이스 상속은 implements로 진행
//  인터페이스 -> 클래스
// 인터페이스 -> 추상클래스 (일부만 미리 구현) -> 클래스

class MyClass2 extends MyClass1{

@Override
public void go() {
	System.out.println();
}

}