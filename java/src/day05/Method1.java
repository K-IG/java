package day05;

public class Method1 {
	public static void main(String[] args) {
		myprint();
		myprint(); 
		absMinus(-3,2);
		
		
		int result = absMinus2(10,-4);
		System.out.println(result);
		 
	}
	static void myprint() {
		// myprint 기호: 안녕하세요 반갑습니다.를 보여주는 기능
//		System.out.println("안녕하세요 반갑습니다.");
	}
	//+ 와 동일한 기능
	static void add2(int num1, int num2){
		System.out.println(num1+num2);
	}
	static void add3(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	static void absMinus(int num1, int num2) {
		if(num1 <0 || num2 <0) {
			num1 *=-1;
			num2 *=-1;
		}else if(num1 >0 && num2 <0 || num1 <0 && num2 >0 || num1 >0 && num2 >0){
			num1 *= 1;
			num2 *=-1;
		}else if(num1 <0 || num2 >0) {
			num1 *=-1;
			num2 *=1;
		}else if(num1 >0 || num2 >0) {
			num1 *=1;
			num2 *=1;
		}
		System.out.println(num1 - num2);
	}
	static int absMinus2(int num1, int num2) {
		int abs1 = num1, abs2 = num2;
		abs1 *= -1;
		abs2 *= -1;
	}else if(abs1 < 0) {
		abs1 *=-1;
	}else if(abs2 <0) {
		abs2 *=-1;
	}
	return abs1 - abs2;
}
}

//메소드 : 클레스 안에 있는 함수