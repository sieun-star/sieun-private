package days06;

import java.util.Iterator;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 2:43:27
 *@subject
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		//4. 알파벳(대,소문자) 코드 및 문자를 출력하는  코딩을 하세요. ( 조건 : 한 라인에 10개씩 출력 )
		
		//대문자 출력 for 문
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%c(%03d)", (char)i, i);
			if (i%10==4) System.out.println();
		} //
		
		//소문자 출력 for문
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.printf("%c(%03d)", (char)i, i);
			if (i%10==0) System.out.println();
		} //
		
	} // main

} // class
