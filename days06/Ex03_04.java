package days06;

import java.io.IOException;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 2:05:43
 *@subject
 *@content
 */
public class Ex03_04 {

	public static void main(String[] args) throws IOException {
		
		char one, con='y';
		int code;
		
		do {
			System.out.print("> 한 문자 입력 ?");
			code = System.in.read();
			one = (char)code;
			System.out.printf("%c\n", one );
			
			System.in.skip(System.in.available());
			
			System.out.print("\n\n 계속할거냐?");
			con =(char)System.in.read();  // 'y'   'n'   
			
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		   
		
		System.out.println("end");
		
		
		
	} // main

}  // class
