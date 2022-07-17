package day08;

public class Review {

	//public class : 한 파일당 하나만 존재할 수 있음
	public static void main(String[] args) {
	//main 함수 : 실행시 프로그램의 시작점
		ReviewClass rc = new ReviewClass();
		rc.go();
		Review2 rc1 = new Review2();
	}

}
//class : 반, 꾸러미 (변수 + 변수)
class ReviewClass{
	
	private String str;
	public String myString() {
		System.out.println("myString함수 실행");
		return "문자열";
	}
	public void go() {
		myString();
		System.out.println(str);
	}
}
class Review2 extends  ReviewClass{
	//ReviewClass의 코드가 붙여넣기 되어있음
	//추가
	private int num = 10;
	public int myNum() {
		System.out.println(num);
		return num;
	}
	public String myString() {
		return "수정한 myString 함수";
	}
	
	
}