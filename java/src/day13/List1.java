package day13;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// 배열의 분편한 점을 극복하고자 List, Set, Map 을 추가
		// List : 순서대로 추가
		// set : 순서없이 추가
		// Map : 순번의 이름을 직접 정해서 추가
		
		Lst1 lst1 = new Lst1();
		lst1.go();

	}

}

class Lst1 {
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		ArrayList<Double> arr3 = new ArrayList<>();

		//
		arr1.add("라면");
		arr1.add("김밥");
		arr1.add("떡볶이");
		arr1.add("순대");

		arr2.add(3000);
		arr2.add(2000);
		arr2.add(3500);
		arr2.add(4000);
		
		System.out.println(arr1.get(0));
		
		arr1.set(2, "라볶이");
		
		arr1.remove(2);
		arr2.remove(2);
		
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i) + ":"+ arr2.get(i));
			
		}

	}
}