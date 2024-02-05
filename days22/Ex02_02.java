package days22;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오전 10:26:11
 *@subject     놓침! 모르겠는머;; 캬캬 해냈다
 *@content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Person2("이동영", 25));
		list.add(new Person2("류영은", 20));
		list.add(new Person2("한재호", 27));
		list.add(new Person2("조연화", 22));
		list.add(new Person2("이재호", 29));
		
		System.out.println(list);
		
		// 오름차순 정렬 (나이)
		list.sort(null);
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person2 p = (Person2) ir.next();
			System.out.println(p);
		}
		
	} // main

} // class

@Data
@AllArgsConstructor
class Person2 implements Comparable{
	private String name;
	private int age;
	
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		return this.age - p.age;
	}
	
}




