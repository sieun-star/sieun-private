package days15;

/**
 * @author SIEUN
 *@date2024. 1. 19. - 오후 12:26:46
 *@subject      ~시험~
 *@content
 */
public class Ex05 {

	public static void main(String[] args) {
		//[시험2]
		// 어떤 클래스(Person)의 필드를 private로 선언했다.
		// private 선언된 필드에 접근하는 방법 ?
		// Person p1 = new Person("홍길동");
		// p1 사람의 이름을 홍길동으로 설정
		// The field Person.name [is not visible] 원인 : 접근지정자 때문
		// private 클래스 내에서만 참조(접근) 가능 
		// 같은 패키지 내부라도 접근 X 
		// p1.name = "홍길동";
		/*
		int age = 300;
	      if (age >= 0 && age <= 300) {
	         p1.age = age;         
	      } else {
	         System.out.println("나이의 범위가 벗어났다.");
	      }
		*/
		
		// p1.setAge(25);
		// System.out.println(p1.getAge());
		

	} // main

} // class
