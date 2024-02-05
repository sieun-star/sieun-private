package days02;


/**
 * @author SIEUN
 *@date2024. 1. 2. - 오전 10:49:19
 *@subject
 *@content
 */
public class Ex03 {

	public static void main(String[] args) {
         // Alt + Shift + Y (짤린 문장 보여주기)
		String name = "이시은";  //%s
		int age = 27;  //%d
		final double PI = 3.141592; //%f
		char grade = 'A';  //%c
		
		System.out.printf("이름:%s, 나이:%d, PI:%f, 등급:%c\n", name, age, PI, grade);
		
		/*
		 * [식별자 명명 규칙]
		 * 1. 자바는 대소문자 구분한다.  
		 *String name; o      ,      syso(Name); X
		 * 2. 키워드(예약어)를 사용 x 
		 * int char; X
		 * 3. $  _  특수문자 사용 가능
		 * int $age, _age; o
		 * 4. 숫자로 시작할 수 없다.
		 * int 1kor; x, int kor1 o
		 */
       
		int kor1;
        //int 1kor; 사용불가
		
		int $age, a$ge;
		int _height, h_eight;
		
		//String first name; 사용불가 (중간에 띄어쓰면 first만 변수로 인식)
		//String first_name; 사용가능
		//String firstName; 권장
		// int #age; -> 사용 불가
		
		
	} //main	

} //class
