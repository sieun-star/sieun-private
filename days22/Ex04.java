package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오전 11:04:17
 *@subject
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {
        // Vector 컬렉션 클래스
		//    ㄴ   List 인터페이스
		//    ㄴ   순서유지 O, 중복허용 O
		//    ㄴ   ArrayList 동일
		//            차이점 : 멀티 스레드 안전(동기화 처리가 되어져 있다)
		
		// StringBuffer     멀티 스레드 안전(동기화 처리가 되어져 있다)
		// StringBuilder    멀티 스레드 안전X (동기화 처리 X)

		// Vector v = new Vector(10,0);
		Vector v = new Vector();
		v.addElement("강명건");
		v.add("박우현");
		v.add("김영진");
		// v.add(null);
		// v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());  // 3
		System.out.println(v.capacity());  //10 (초기용량)
		
		v.trimToSize();  // 빈용량 제거
		System.out.println(v.capacity());  //3 
		
		v.setSize(5);
		System.out.println(v);  // [강명건, 박우현, 김영진, null, null]
		
		// 요소를 얻어오는 메서드 : get(), elementAt();
		String name = (String) v.get(0);
		name = (String) v.elementAt(0);
		
		// v.clear();  모든 요소 삭제
		// v.remove(index); == v.removeElementAt(index);
		// v.remove("홍길동");  == v.removeElement("홍길동");
		
		// boolean v.isEmpty();
		
		// 모든 요소를 출력 : 반복자(iterator)  Vector 값 변화시 바로 예외 발생
		/*
		Iterator ir = v.iterator();
		while (ir.hasNext()) {
			String s = (String) ir.next();
			System.out.println(s);
		}
		*/
		
		// 모든 요소를 출력 : 열거자(enumeration) Vector 값 변화시 예외 발생 X
		/*
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			name = (String) en.nextElement();
			System.out.println(name);
		}
		*/
		
		// 반복자와 열거자의 차이점 파악.
		
		// v 벡터 안에  nullX2 null 요소 삭제
		v.removeIf(n -> n==null);
		// System.out.println(v);
		// v.forEach(n->System.out.println(n));
		//             메서드 참조
		v.forEach(System.out::println);
		
		
		// v.clear();  모든 요소 삭제
		// v.clone();  복제
		
		v.get(0); // 첫 번째 요소 얻어오는 코딩.
		v.firstElement();
		
		v.get(v.size()-1); // 마지막 요소 얻어오는 코딩.
		v.lastElement();
		
		v.add(1,"홍길동"); // 1위치에 홍길동 삽입
		v.insertElementAt("홍길동", 1);
		
		//[][][2][3][4][][]   v.subList(2, 5);
		List sublist = v.subList(0, 2);
		System.out.println(sublist);
		
	} // main

} // class




