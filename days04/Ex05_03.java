package days04;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오후 2:21:02
 *@subject   정수(n)를 입력받아서 
 *@content   짝수(even number), 홀수(odd number)   라고 출력
 *                 
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int n;
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.print("> 정수(n) 입력?");
			n = scanner.nextInt();
			if (n%2==0) {
				System.out.println("짝수(even number)");
			}else { // 홀수 경우
				System.out.println("홀수(odd number)");
			}
		} catch (Exception e) {
		}
		
		
		

	} //main

} //class
