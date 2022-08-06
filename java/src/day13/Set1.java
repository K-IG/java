package day13;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {

	public static void main(String[] args) {
		HashSet1 hs1 = new HashSet1();
		hs1.go();
		//Set은 순서가 없다, 중복이 안됨
		//Set은 중복없이 저장할 때만 쓰인다
		TreeSet1 t1 = new TreeSet1();
		t1.go();
	}

}

class HashSet1{
	public void go() {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		// 추가 add
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		
		
		Iterator<Integer> it1 = hs1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}
}

class TreeSet1{
	public void go() {
		TreeSet1<Integer> t1 = new TreeSet1<Integer>();
		t1.add(1);
	}
	
	
	
	
	
	
	
}
