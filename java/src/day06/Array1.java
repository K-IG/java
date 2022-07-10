package day06;
class ArrayEx{
	public void go() {
		int num1 = 1000, num2 = 1500, num3 = 1200, num4 = 3000;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		int num[] = {1000,2000,3000,4000}; 
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
		}
		String ss[] = {"a""b""c""d"};
		int nn[] = {1,2,3,4};
		double dd[] = {1.0,2.0,3.0,4.0};
		boolean bb[] = {false, true,true,false};
	}
}
public class Array1 {

	public static void main(String[] args) {
		ArrayEx array1Ex = new ArrayEx();
		array1Ex.go();
		

	}

}
