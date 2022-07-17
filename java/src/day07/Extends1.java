package day07;

public class Extends1 {
	public static void main(String[] args) {
		ex1 e = new ex1("");
		e.go();
		
		
		
	}

}

class ex1{
	private String str;
	
	ex1(){
		
	}
	
	ex1(String str){
		this.str = str;
	
	
	}
	public void go() {
		System.out.println(str + "1번");
		
		
	}
}
class ex2 extends ex1{
	private String str;
	
	ex2(){
		
	}
	
	ex2(String str){
		this.str = str;
	
	
	}
	public void go() {
		super.go();
		
		
	}
}

//기존의 클래스를 복붙하고 싶으면 extends 사용
// 수정이 필요하면 함수를 다시 만드셈