package days06;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 3:38:59
 *@subject
 *@content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 5. 두 정수(x, y)를 입력받아서 두 정수 사이의 짝수의 합을 출력하는 코딩을 하세요. 
		
		int x, y, sum =0;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y= scanner.nextInt();
		
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		/*
		for (int i = min; i <= max; i++) {
			if ( i%2==0 ) {
				sum+=i;
				System.out.printf("%d+", i);
			
		}
		}
		*/
		if (min%2!=0)  min++;
		for (int i = min; i <= max; i+=2) {
				sum+=i;
				System.out.printf("%d+", i);
		
		}
		System.out.printf("=%d\n", sum);
		
		
		
	} // main

} // class
