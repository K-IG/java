package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Review {

	public static void main(String[] args) {
		List_1 l = new List_1();
		l.go();
		System.out.println("--------------");
		Set_ set = new Set_();
		set.go();
		Map_ m = new Map_();
		m.go();

	}

}

class List_1 {
	ArrayList<String> ar = new ArrayList<>();

	public void go() {
		// 기존 배열의 불편한 점을 개선한 클래스

		// 추가 add 생성
		ar.add("한개"); // 0
		ar.add("두개"); // 1
		ar.add("세개"); // 2
		ar.add("네개"); // 3

		System.out.println(ar.get(0));

		ar.set(1, "두개수정");
		System.out.println(ar.get(1));

		ar.remove(1);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}

	}
}

class Set_ {
	Set<String> hs = new HashSet<>();

	public void go() {

		hs.add("한개");
		Iterator<String> iter = hs.iterator(); // 반복자
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}

class Map_ {
	// 키와 값으로 이루어짐
	Map<Integer, String> hm = new HashMap<>();

	// 일반배열 [1,2,3,4]
	// Map [키:"값",키:"값",키:"값"]
	public void go() {

		hm.put(1, "첫번째");
		hm.put(2, "두번째");
		hm.put(3, "세번째");
		hm.put(4, "네번째");

		// 보기 get
		System.out.println(hm.get(5));

		// 전체 보기는 keySet 사용
		System.out.println(hm.keySet());
		Set<Integer> set = hm.keySet();

		// set을 사용해서 값 전체보기
		Iterator<Integer> iter = set.iterator(); // 반복자
		while (iter.hasNext()) {
			int keyNum = iter.next();
			System.out.println(keyNum); // 키에 해당하는 값을 출력

		}
	}
}

/*
	{"날씨": "흐림", "기온":"23", "지역:"서울"} :JSON => Map
	//	List : 순서O, 중복O 배열
	//	Set : 순서X, 중복X 배열
	//	Map : 키와 값으로 이루어진 배열
 
 	//	ArrayList, HashMap
 */

