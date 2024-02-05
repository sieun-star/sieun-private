package days06;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 12:40:50
 *@subject
 *@content
 */
public class Ex03_02 {

	public static void main(String[] args) {
	
		char one;
		//Syntax error on token "continue", invalid VariableDeclaratorId 잘못된 변수명 ( 예약어를 식별자로 사용할 수 없기 때문에)
		char con= 'y';
		
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("한 문자 입력 ?");
			one = scanner.next().charAt(0);
			System.out.printf("one='%c'\n", one);
			
			System.out.print("\n\n 계속할거냐?");
			con = scanner.next().charAt(0);  // 'y'   'n'   
			
		} while (con == 'y' || con == 'Y');
		
             System.out.println("end");


	} // main

} // class
