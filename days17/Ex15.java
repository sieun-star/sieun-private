package days17;

import java.io.IOException;

/**
 * @author SIEUN
 *@date2024. 1. 23. - 오후 4:29:07
 *@subject
 *@content
 */
public class Ex15 {

	public static void main(String[] args) {

		// 컴파일러가 예외처리를 확인 o, x
		
		// 컴파일 오류 o
		// "checked 예외" Exception 자손예외클래스는 컴파일러가 예외발생 확인한다. 
		// throw new IOException("강제 IO 예외 발생");
		// throw new Exception("강제 예외 발생");
		
		// 컴파일 오류 x
		// 컴파일러가 예외 발생을 확인하지 않는다. why? RuntimeException 자손~들은 컴파일러가 예외발생 확인 하지 않는다.
		// "unchecked 예외"
		throw new RuntimeException("강제 예외 발생");

		


	} // main

} // class
