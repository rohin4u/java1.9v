package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		
//		List l = new ArrayList<>();
//		l.add(10);
//		l.add(23);
//		l.add(100);
//		System.out.println(l);
		
//		List<Integer> list = List.of(10, 30, 40);
//		
//		Integer i = list.get(0);
//		System.out.println(i);
		
//		Map<Integer, Integer> m = new HashMap<>();
//
//		m.put(101, 205);
//		m.put(102, 206);
//		m.put(103, 207);
//		m.put(104, 207);
//		
//		Set<Entry<Integer, Integer>> entrySet = m.entrySet();
//		System.out.println(entrySet);
//		Iterator<Entry<Integer, Integer>> itr = entrySet.iterator();
//		
//		while(itr.hasNext()) {
//			Entry<Integer, Integer> next = itr.next();
//			System.out.println(next);
//		}
//		Set<Integer> keySet = m.keySet();
//		Iterator<Integer> itrr = keySet.iterator();
//		while(itrr.hasNext()) {
//			
//			Integer next = itrr.next();
//			System.out.println(next);
//		}
		
		
		Map<Integer, Integer> m1 = Map.of(10,20, 40, 50, 70, 80);
		System.out.println(m1);
		
		Set<Integer> keySet = m1.keySet();
		Iterator<Integer> itr2 = keySet.iterator();
		
		while(itr2.hasNext()) {
			Integer next = itr2.next();
			System.out.println(next);
		}
		

	}

}
