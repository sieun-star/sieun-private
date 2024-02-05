package days05;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오후 5:30:45
 *@subject
 *@content
 */
public class Ex10_01 {

	public static void main(String[] args) {
		//[문제] 
        //두 정수 n,m을 입력 받아서 두 정수의 홀수의 합 출력
		
		int n,m;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" n_m 입력");
		n=scanner.nextInt();
		m=scanner.nextInt();

		int min = n > m ? m:n;
		int max = n> m ? n:m;
		
		for (int i = min; i <= max; i+=2) {
          
			sum += i;
			System.out.printf("%d+", i);
		}
		System.out.printf("=%d\n", sum);
		
	} // main

} // class
