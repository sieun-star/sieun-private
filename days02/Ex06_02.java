package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author SIEUN
 *@date2024. 1. 2. - 오후 2:01:53
 *@subject
 *@content  키보드로 부터 나이를 입력받아서 입력받은 나이를 출력
 */
public class Ex06_02 {

	public static void main(String[] args) throws IOException {

 
       /* BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
		System.out.print("> 나이 입력?");
		byte age = 27;
		
		br = 
		System.out.printf("> 나이 : %d\n ");
		*/
		
		// 1. 나이를 저장할 변수 선언 -128~127
		byte age;
		// 2. br 객체 선언
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(">나이 입력?");
		
		// Type mismatch: cannot convert from String to byte
		// String => byte
		//age = br.readLine();  // 문자열 "23" -> 숫자(정수) byte 형 변환
		
		/*String strAge = br.readLine();
		age = Byte.parseByte(strAge);
		*/
		
		age = Byte.parseByte(br.readLine());
		
		//String %s
		// char %c
		// boolean %b
		
		
		
		System.out.printf(">나이 : %d\n", age);
		
		
		
		
		
		
	} // main

} // class
