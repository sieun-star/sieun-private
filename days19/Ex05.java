package days19;

/**
 * @author SIEUN
 *@date2024. 1. 25. - 오후 12:26:45
 *@subject
 *@content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [java.lang.Math 클래스]
		// 모든 멤버들(필드, 메서드)  : static 
		// Math. 객체 생성할 필요 없이 바로 사용 가능
		System.out.println(Math.random());
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.max(2, 3));
		System.out.println(Math.min(2, 3));
		System.out.println(Math.abs(-99));
		System.out.println(Math.abs(-99.98));
		System.out.println(Math.sqrt(4)); // 루트
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		// (기억) 올림(절상) double
		System.out.println(Math.ceil(2.0));     // 2.0
		System.out.println(Math.ceil(2.179));  // 3.0
		System.out.println(Math.ceil(2.579));  // 3.0
		System.out.println(Math.ceil(2.979));  // 3.0

        // 내림(절삭) double		
		System.out.println(Math.floor(2.0));     // 2.0
		System.out.println(Math.floor(2.179));  // 2.0
		System.out.println(Math.floor(2.579));  // 2.0
		System.out.println(Math.floor(2.979));  // 2.0
		
		// 소숫점 첫 번째 자리에서 반올림 long
		System.out.println(Math.round(2.179));  // 2
		System.out.println(Math.round(2.579));  // 3
		System.out.println(Math.round(2.979));  // 3
		
		// Math 클래스는 최대 성능을 얻기 위해서 JVM이 설치된 OS(운영체제)의 메서드를 호출해서 처리한다. 
		// 그래서 운영체제(OS)에 따라서 결과가 다르게 나오기도 한다. 
		
		//  ->[ StrictMath 클래스 ] 성능은 포기하고 결과값이 동일하게 처리하기 위한 클래스 
		
		
	} // main

} // class
