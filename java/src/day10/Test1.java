package day10;

import day02.If1;

public class Test1 {

	public static void main(String[] args) {
		Test222 t = new Test222();
		t.name();
	}

}

class Test2{
	String info = "안녕하세요 저는 홍길동입니다. 잘 부탁드립니다. 안녕히 계세요";
	public void name() {
		String result = "";
		int idx = 0;
		idx = info.indexOf("홍길동");
		result.substring(idx,idx+3);
		System.out.println(result);
	}
	public void hello(){
		String result = "";
		int idx = 0;
		idx = info.indexOf("안녕하세요");
		result.subSequence(idx, idx+1);
		System.out.println(result);
	}
	public void bye() {
		String result = "";
		int idx= 0;
		idx = info.indexOf("안녕히 계세요");
		result.subSequence(idx, idx+4);
		System.out.println(result);
		}
	
}