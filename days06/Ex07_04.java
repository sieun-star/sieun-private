package days06;

import java.util.Iterator;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 4:17:40
 *@subject
 *@content
 */
public class Ex07_04 {

	public static void main(String[] args) {
		
		// [구구단 세로 출력]
		for (int i = 1; i <=9; i++) {
			// System.out.printf("[%d단]", d);
			for (int d = 2; d <=9; d++) {
				 System.out.printf("%d*%d=%02d ",d, i, d*i);
		} // for i		
			System.out.println();
		} // for d
		
		
		// while문 사용해서 코딩.
		
		/*
		int d= 2;
		int i = 1;
		
		
		while (d <= 9) {
			System.out.printf("%d단\n", d);
			i = 1;
			while (i <=9) {
				System.out.printf("%d * %d = %d\n",d, i, d*i);
				i++;
			} // while i
			d++;
		} // while d
		*/
		
	
		
		
		

	} // main

} // class
