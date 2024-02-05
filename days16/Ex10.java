package days16;

/**
 * @author SIEUN
 *@date2024. 1. 22. - 오후 3:07:22
 *@subject
 *@content
 */
public class Ex10 {

	public static void main(String[] args) {
		// [1] 사원 객체 생성
		/*
		Employee emp1 = new Employee("이준희", "서울 강남구", "010-1234-1234", "2023.12.29");
		emp1.dispEmpInfo();
		// Object.toString() 
		// days16.Employee@2a18f23c
		// 패키지명.클래스명@16진수값
		// toString() 사원 정보를 출력하도록 오버라이딩(재정의 함수) 
		System.out.println(emp1.toString());
		System.out.println(emp1);
		*/
		
		// [2] 정규직 사원 객체 생성
		// Regular emp2 = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		// Employee로 부터 상속받은 dispEmpInfo() 메서드의 단점(문제점)
		// 사우너정보를 출력하는데 basePay는 출력 X
		// emp2.dispEmpInfo();
		// System.out.println(emp2.toString()); // 부모 객체 생성 후 자식 객체 생성
		
		// 정규직은 사원이다. (is-a 관계)
		// 자식객체(new Regular)를 생성해서 부모 클래스(Employee emp2)에 참조시킬 수 있다.
		//   ㄴ 클래스의 자동 형변환 (Up Casting)
		// Employee emp2 = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		
		// 문제점.
		// emp2.getPay(); X
		
		// [3]
		// Up Casting - 클래스간의 형변환
		// Employee emp3 = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		// (문제점)
		// System.out.println(emp3.getPay());
		
		// [4]
		// 클래스 간의 형변환 - Up Casting ( 자동으로 형변환) 
		Employee emp4 = new Temp("박정호", "서울 목동", "010-2319-2422", "2020.01.01", 20, 250000);
		emp4.dispEmpInfo();
		// [문제점]
		// System.out.println(emp4.getPay());

	} // main

} // class
