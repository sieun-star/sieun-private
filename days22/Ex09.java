package days22;

import java.util.HashSet;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오후 2:19:07
 *@subject
 *@content
 */
public class Ex09 {

	public static void main(String[] args) {
		// Collection
		//   ㄴ List - ArrayList, Vector, LinkedList, Stack, Queue(LinkedList), Priority Queue
		//   ㄴ Set - 순서유지X, 중복허용X 
		//              HashSet 컬렉션 클래스 
		//              만약) Set +[ 순서 유지 O ] -> LinkedHashSet 컬렉션 클래스를 사용한다.
		//                            [ 중복 허용 X ]
		// HashSet hs = new HashSet(16, 0.75);
		HashSet hs = new HashSet();
		// hs.add(hs);   hs.addAll(hs);
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		System.out.println(hs);  // [1, 9, 10, 15]  1) 순서유지X
		
		hs.add(1); // 2) 중복 허용X
		System.out.println(hs); // [1, 9, 10, 15]

		
		
		

	} // main

} // class








