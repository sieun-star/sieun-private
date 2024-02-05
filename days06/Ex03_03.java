package days06;

import java.io.IOException;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 2:05:43
 *@subject
 *@content
 */
public class Ex03_03 {

	public static void main(String[] args) throws IOException {
		
		char one;
		int code;
		System.out.print("> 한 문자 입력 ?");
		
		// read() : 표준입력장치의 입력스트림으로부터 다음 byte를 읽어서 0~255까지의 int 정수를 반환하는 함수(메서드)
		//            스트림의 끝을 만나면 -1 값을 반환. 리턴자료형 int
		code = System.in.read();
		one = (char)code;
		System.out.printf("%c\n", one );
		
		/*
		System.in.read(); // CR 13  '\r'      입력할때 엔터값 '\r' , '\n' 지워주기
		System.in.read();//  LF  10  '\n'
		*/
		
		System.in.skip(System.in.available()); // 뒤에 잉여 바이트 제거
	
		System.out.print("> 한 문자 입력 ?");
		code = System.in.read();
		one = (char)code;
		System.out.printf("%c\n", one );
		
		System.out.println("end");
		
		
		
	} // main

}  // class
