package days05;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오후 4:51:46
 *@subject
 *@content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		//1~N 까지 합
		/*
		int sum =0;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> n 입력?");
		n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.printf("%d+", i);
		}
            System.out.printf("=%d\n", sum);
         */
		
		// [문제] 두 정수 n, m 을 입력받아서 두 정수 사이의 합을 출력하는 코딩
		
		int n, m;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> n_m 입력");
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		/*
		if (n>m) {
			for (int i = m; i <=n; i++) {
				sum += i;
				System.out.printf("%d+",i);
			}
		
	            System.out.printf("=%d\n", sum);
			
		} else {
			for (int i = n; i <=m; i++) {
				sum += i;
				System.out.printf("%d+",i);
			}
		
	            System.out.printf("=%d\n", sum);
		}
		*/ 
		//[2]
		/*
		if (n>m) {
			int temp =n;
			n = m;
			m = temp;
		}
		
		for (int i = n; i <=m; i++) {
			sum += i;
			System.out.printf("%d+",i);
		}
	
            System.out.printf("=%d\n", sum);
		
		*/
		//[3]
		
		int min = n>m? m:n;
		int max= n>m? n:m;
		
		for (int i =min; i <=max; i++) {
			sum += i;
			System.out.printf("%d+",i);
		}
	
            System.out.printf("=%d\n", sum);
            
            //[문제] 
            //두 정수 n,m을 입력 받아서 두 정수의 홀수의 합 출력
            
          
		
		
		
		
		
	} // main	

} // class
