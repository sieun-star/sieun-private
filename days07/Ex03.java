package days07;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 9. - 오전 10:25:38
 *@subject
 *@content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		3. 이등변 삼각형 출력
		   행의 갯수를 입력받아서 이등변 삼각형 출력.
		[입력형식]
			> 행의 갯수를 입력하세요 ? 5
		[출력형식]
			1 : ____*____
			2 : ___***___
			3 : __*****__
			4 : _*******_
			5 : *********  
		*/ // [문제풀이]
		int row , col;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 행의 갯수를 입력하세요 ?");
		row = scanner.nextInt();
		col = 2*row-1;
		// 3/5  4/7  5/9
		
		for (int i = 1; i <= row; i++) { // 행 갯수
			System.out.printf("%d : ", i);
			for (int j = 1; j <= col; j++) {
				// System.out.print(i+j>=4? "*" : "_");
				// System.out.print(j-i<=2? "*" : "_");
				System.out.print(i+j>=row+1 && j-i<=row-1? "*" : "_");
			}
			System.out.println();	
		}
		
		
		
		
		
		
		/* [1]
		for (int i = 1; i <= 4; i++) { // 행 갯수
	       for (int j = 0; j < 4; j++) { // 열(별) 갯수
			System.out.print("*");
		}System.out.println();		
		}
		 */
		/*
		 * [2]
		// String.repeat(int cout);
		// System.out.println( "*".repeat(4));
		for (int i = 1; i <= 4; i++) {
			System.out.println("*".repeat(4));
		}
		 */
		/*
		 * [3]
		for (int i = 1; i <= 4; i++) { // 행 갯수
			for (int j = 1; j <= i; j++) { // 열(별) 갯수
				System.out.print("*");
			}
			System.out.println();	
		}
		 */
		/*
		for (int i = 1; i <= 4; i++) {
			System.out.println("*".repeat(i));
		}
		 */
		/*
		 *[4]
		for (int i = 1; i <= 4; i++) { // 행 갯수
			for (int j = 1; j <= 5-i; j++) { // 열(별) 갯수
				System.out.print("*");
			}
			System.out.println();	
		}

		for (int i = 4; i <= 1; i--) {
			System.out.println("*".repeat(i));
		}
		 */
		/*
		 *[5]
		for (int i = 1; i <= 4; i++) { // 행 갯수
			// 공백 출력 for
			for (int j = 1; j <= 4-i; j++) { // 공백출력
				System.out.print("_");
			}
			// 별 출력 for
			for (int j = 1; j <= i; j++) { // 열(별) 갯수
				System.out.print("*");
			}
			System.out.println();	
		}
		 */
		/*
		 *[6]
		for (int i = 1; i <= 4; i++) { // 행 갯수
			// 공백 출력 for
			for (int j = 1; j <= i-1; j++) { // 공백출력
				System.out.print("_");
			}
			// 별 출력 for
			for (int j = 1; j <= 5-i; j++) { // 열(별) 갯수
				System.out.print("*");
			}
			System.out.println();	
		}
		 */
		/*
		 * [7]
		for (int i = 1; i <= 3; i++) { // 행 갯수
			// 공백 출력 for
			for (int j = 1; j <= 3-i; j++) { // 공백출력
				System.out.print("_");
			}
			// 별 출력 for
			for (int j = 1; j <= i*2-1; j++) { // 열(별) 갯수
				System.out.print("*");
			}
			System.out.println();	
		}
		 */
		/*
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				// if(i=j) System.out.print("*");
				// else System.out.print("_");
				// System.out.print(i==j? "*" : "_");
				// System.out.print(i+j==6? "*" : "_");
				System.out.print(i==j || i+j==6? "*" : "_");	
			}
			System.out.println();
		}
		 */
		/*
		 * [5]-2

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) { 
				System.out.print(i+j>=5? "*" : "_");
			}
			System.out.println();	
		}
		*/



	} // main

} // class
