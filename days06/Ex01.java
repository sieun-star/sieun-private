package days06;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오전 9:01:59
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
		//1. 세 정수 a, b, c 를 입력받아서 가장 큰수, 가장 작은수를 찾아서 출력하세요. 
       
		int a, b, c;
		try(Scanner scanner = new Scanner(System.in);) {
			
			System.out.println(" 정수 a_b_c 입력?");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			//[2]
			//int max = a>b ? a>c? a:c:b>c? b:c;
			//int min =
			
			
			/* [1]
			 * int max, min;
			if (a>b) {
				if (a>c) {	
					System.out.println("큰 수 : a");
				}else {
					System.out.println("큰 수 : c");
				}
				
			}else {
				if (b>c) {	
					System.out.println("큰 수 : b");
				}else {
					System.out.println("큰 수 : c");
				}
				
			}
			*/
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	} // main

} // class
