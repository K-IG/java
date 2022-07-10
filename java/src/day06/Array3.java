package day06;

public class Array3 {

	public static void main(String[] args) {
		Array3Ex a = new Array3Ex();
		a.go();
	}
}



class Array3Ex {
	public void go() {
		String arr1[] = {"a","b","c","d","e","f"};		
		
		int arr2[] = new int[256];
		
		for(int i=0; i < arr2.length; i++) {
			arr2[i] = i+1;
			System.out.println(arr2[i]);
		}
		
		String arr3[];
		arr3 = new String[3];
		arr3[0] = "a";
		arr3[1] = "b";
		arr3[2] = "c";
		
		arr3[0] = "d";
		arr3[2] = "g";
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
			
		}
		
	}
}