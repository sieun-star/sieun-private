package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오전 11:04:17
 *@subject
 *@content
 */
public class Ex04_02 {

	public static void main(String[] args) {
       
		Vector v = new Vector();
		v.addElement("강명건");
		v.add("박우현");
		v.add("김영진");
		v.add("홍길동");
		
		// ArrayList 동일, 멀티스레드 안전(동기화처리O)
		
		// Iterator       iterator()
		// ListIterator  listIterator() 설명..
		//   ㄴ Iterator에 양방향으로 조회 기능이 추가된 반복자
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println("-".repeat(40));
		
		
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
		}
		
		
		
	} // main

} // class




