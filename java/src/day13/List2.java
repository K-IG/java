package day13;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		
		Lst2 lst2 = new Lst2();
		lst2.go();

	}

}

class Lst2 {
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();

		//
		arr1.add("아메리카노");
		arr1.add("카페라때");
		arr1.add("카페모카");
		arr1.add("카라멜마끼아또");
		arr1.add("에스프레소");
		arr1.add("오렌지주스");
		arr1.add("카페모카");

		arr2.add(1000);
		arr2.add(2000);
		arr2.add(3000);
		arr2.add(4000);
		arr2.add(5000);
		arr2.add(6000);
		arr2.add(7000);
		
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i) + ":"+ arr2.get(i));
			
		}

	}
}


	