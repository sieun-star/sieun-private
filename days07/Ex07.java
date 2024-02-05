package days07;

import java.util.Iterator;

/**
 * @author SIEUN
 *@date2024. 1. 9. - 오후 2:34:49
 *@subject  (시험)
 *@content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [피보나치 수열]
		// 항(term)
		// 1+1+2+3+5+8+13+21...???=??
		int firstTerm = 1;
		int secondTerm = 1;
		
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		while ((nextTerm = firstTerm + secondTerm)<=100) {
			//nextTerm = firstTerm + secondTerm;
			//if (nextTerm>100) break;
			sum+= nextTerm;
			System.out.printf("%d+", nextTerm);
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}System.out.printf("=%d\n", sum);
		
		
		
		
		/*
		//[2]
		// 토끼 암컷 1
		// 토끼 수컷 1
		
		int firstTerm = 1;
		int secondTerm = 1;
		//1+1+2+3+5+8+13+21+34+55+89+=232
		//f   s
		//    f   s
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		while (true) {
			nextTerm = firstTerm + secondTerm;
			if (nextTerm>100) break;
			sum+= nextTerm;
			System.out.printf("%d+", nextTerm);
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}System.out.printf("=%d\n", sum);
		*/
		
		
		
		
		
		/*
        [1]
		int [] x = new int[100];
		x[1]=1;
		x[2]=1;
		int sum =x[1]+x[2];
		System.out.printf("%d+%d+",x[1], x[2]);
		for (int i = 3; i < 100; i++) {
			x[i] = x[i-1]+x[i-2];
			if (x[i] >100) break;
			System.out.printf("%d+", x[i]);
			sum += x[i];
		}
		System.out.printf("=%d\n", sum);
		*/
		
		
		
	} // main

} // class
