package days08;

import java.util.Random;

/**
 * @author SIEUN
 *@date2024. 1. 10. - 오후 2:29:15
 *@subject   (시험)
 *@content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		
		fillLotto(lotto);  // Call By Reference
		
		dispLotto(lotto);
		

	} // main

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i <lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i, lotto[i]);
		}
		System.out.println();
	
		}
		

	 private static void fillLotto(int[] lotto) {
	      // 1. 
	      Random rnd = new Random();
	      // 2. lotto[0]
	       int lottoNumber = rnd.nextInt(45)+1;
	       lotto[0] = lottoNumber;
	       System.out.println(lottoNumber);
	       // 3
	       int index = 1;
	      
	     out:while (index<=5) {
	          lottoNumber = rnd.nextInt(45)+1;
	          System.out.println(lottoNumber);
	          for (int i = 0; i < index; i++) {
	            if( lottoNumber == lotto[i]) {
	                continue out;
	            }  
	            
	         }
	          lotto[index++] = lottoNumber;
	          //index++;
	      } // while

	 
	 }
} // class
