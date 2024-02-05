package days06;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오전 9:01:59
 *@subject
 *@content
 */
public class Ex01_05 {

	public static void main(String[] args) {
		//1. 세 정수 a, b, c 를 입력받아서 가장 큰수, 가장 작은수를 찾아서 출력하세요. 
       
		int a, b, c;
		try(Scanner scanner = new Scanner(System.in);) {
			
			System.out.println(" 정수 a_b_c 입력?");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			//[3] 
			
			int max = Math.max(a, b);
			max = Math.max(max, c);
			
			int min = Math.min(Math.min(a, b),c);
		
			//double   math.pow(3,2); 3의 제곱
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		


	} // main

} // class
