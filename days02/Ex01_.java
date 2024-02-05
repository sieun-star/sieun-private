package days02;

public class Ex01_ {

	public static void main(String [] args){

		// 자료형 변수명[=초기값];
		// 식별자(identifier) - 변수명, 클래스명, 메서드명 등등
		// 식별자를 부여하는 방법(검색)
		/*
		 *n 변수(variable)
		 *'n' 한 문자
		 *"n" 문자열 = 'n' + '\0'
		 */
		
		// 변수 초기화
		String name="홍길동";
		double height=185.22;  //%f
		
        //Invalid escape sequence (valid ones are \b \t \n \f \r \" \' \\ )
		// System.out.printf("이름 : \"%s\", 키 : %fcm", name, height);
	
		System.out.printf("이름 : \"%s\", 키 : %fcm", name, height);
		
		
	 
} // main
} // class