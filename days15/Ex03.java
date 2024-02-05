package days15;

/**
 * @author SIEUN
 *@date2024. 1. 19. - 오전 11:08:17
 *@subject      시험(암기! 완벽perfect하게)
 *@content
 */
public class Ex03 {

	// field
	String name;
	int age;
	
	// 디폴트 생성자(Default Constructor)
	public Ex03() {
		System.out.println("> Ex03 Default Constructor...");
		name = "익명";
		age = 20;
	}
	
	public Ex03(String n, int a) {
		System.out.println("> Ex03 2 Constructor...");
		name = n;
		age = a;
	}
	
	public Ex03(String n) {
		System.out.println("> Ex03 1 Constructor...");
		name = n;
		age = 20;
	}

	// java.exe Ex03 실행 -> main() 실행 
	public static void main(String[] args) {
		/*
		 * [시험1] 생성자(Constructor)
		 * 1. 일종의 메서드이다.
		 * 2. 메서드명 == 클래스명
		 * 3. 리턴자료형을 사용하지 않는다. return문 X
		 * 4. 매개변수 없는 생성자를 디폴트 생성자라고 한다.
		 *    ( Default Constructor)
		 * 5. 접근지정자를 사용할 수 있다.
		 *     기타제어자는 사용 할 수 없다.
		 * 6. 호출 시점 : 인위적으로 호출할 수 없다.
		 *                  객체가 생성될 때 자동으로 호출된다.
		 * 7. 생성자의 역할 : 
		 *            객체 생성 -> 자동으로 생성자 호출 -> 필드 초기화 역할.                 
		 * 8. 생성자는 오버로딩(overloading) 할 수 있다.
		 *     오버로딩의 의미 : 중복함수 
		 *     예) drawLine()
		 *     예) drawLine(int n)
		 *     예) drawLine(int n, String style)
		 * 9. 클래스를 선언 시 생성자를 1개라도 선언되지 않으면 컴파일러가 자동으로 디폴트 생성자를 추가해서 컴파일한다.    
		 * 10. 생성자는 상속되지 않는다.(그냥 암기)        
		 */
		
		// The method Ex03() is undefined for the type Ex03
		// Ex03(); // 인위적 호출 X
		
		/*
		// Ex03 obj =  new Ex03(); // 객체 생성 시 자동 호출
		// Ex03 obj =  new Ex03("이시은"); // 매개변수는 객체 생성시 필드 초기화
		// Ex03 obj =  new Ex03("이시은", 28); 
		
		// The constructor Ex03(String, int, String) is undefined
		Ex03 obj =  new Ex03("이시은", 28 , "부장"); 
        System.out.println(obj.name);
        System.out.println(obj.age);
		*/
		
		// The constructor Sample() is undefined
		// Sample sample = new Sample(); 매개변서 String s를 받는 생성자가 선언되어 자동으로 디폴트 생성자가 추가되어 컴파이 되지 않는다.
		
		System.out.println("end");
		
		
	} // main

} // class


class Sample{
	
	String name;
	
	public Sample(String s) {
		name = s;
	}
	
}
