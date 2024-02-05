package days22;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오전 10:26:11
 *@subject
 *@content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 5. 이름, 나이 필드를 가진 Person 클래스를 선언하고
		//    ArrayList 컬렉션 클래스에  Person 객체를 요소로 추가하고 
		//    이름으로 오름차순 정렬해서 출력하는 코딩을 하세요 .
		
		ArrayList list = new ArrayList();
		list.add(new Person("이동영", 25));
		list.add(new Person("류영은", 20));
		list.add(new Person("한재호", 27));
		list.add(new Person("조연화", 22));
		list.add(new Person("이재호", 29));
		
		System.out.println(list);
		
		// 오름차순 정렬
		/*
		list.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person)o1;
				Person p2 = (Person)o2;
				
				String p1Name = p1.getName();
				String p2Name = p2.getName();
				return p1Name.compareTo(p2Name);
			}	});

		// 반복자 출력
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person p = (Person) ir.next();
			System.out.println(p);
		}
		*/
		
		list.sort((o1, o2) -> {
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			int p1Age = p1.getAge();
			int p2Age = p2.getAge();
			return p1Age - p2Age;
		});
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person p = (Person) ir.next();
			System.out.println(p);
		}
		
	} // main

} // class

@Data
@AllArgsConstructor
class Person{
	private String name;
	private int age;

}




