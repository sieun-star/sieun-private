package days06;

import java.util.Iterator;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 4:17:40
 *@subject
 *@content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [구구단] = [multiplicaton table]
		//      2단 = [ 2nd lever ] = [ 2 times table ]		
		/*for (int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n",2, i, 2*i);
		}
		
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n",3, i, 3*i);
		}
		*/
		/*
		 * d=2
		 * 2단
		 *   ㄴ i = 1, 2, 3, 4, 5, 6, 7, 8, 9,      i = 10
		 *   
		 * d=3
		 * 3단
		 *   ㄴ i = 1, 2, 3, 4, 5, 6, 7, 8, 9,      i = 10 
		 *   
		 *d=4
		 * 4단
		 *   ㄴ i = 1, 2, 3, 4, 5, 6, 7, 8, 9,      i = 10 
		 *   
		 * 
		 */
		
		for (int d = 2; d <=9; d++) {
			System.out.printf("%d단\n", d);
			for (int i = 1; i <=9; i++) {
				System.out.printf("%d * %d = %d\n",d, i, d*i);
		} // for i		
		} // for d

	} // main

} // class
