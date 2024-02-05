package days02;


/**
 * @author SIEUN
 *@date2024. 1. 2. - 오전 10:07:01
 *@subject
 *@content
 */
public class Ex02 {

	public static void main(String[] args) {
	
	// String 문자열 자료형                                %s
	// double 숫자(실수) 대표적인 자료형                 %f
	// int	숫자(정수) 대표적인 자료형                      %d 
	// char 문자 자료형                                     %c	
	// 지역변수(local variable) 
	String name = "홍길동"; // main() 메서드 안에서 사용 가능한 지역변수
	
	// {} 지역(범위, 영역) 연산자
	{
	    // Type mismatch: cannot convert from char to String (형변환 불가)
		char grade =  'A';	
		
		System.out.printf("1. 이름 : %s\"\n" , name );
		//System.out.println();
		System.out.printf("1. 등급 : '%c\'\n" , grade );
	}
		
	System.out.printf("2. 이름 : %s\"\n" , name );
	//grade cannot be resolved to a variable
	//System.out.printf("2. 등급 : '%c\'\n" , grade );	
	
	
	} //main

} //class
