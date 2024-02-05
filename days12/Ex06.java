package days12;

import java.util.Random;

/**
 * @author SIEUN
 *@date2024. 1. 16. - 오후 12:33:58
 *@subject     로또 돌리기
 *@content
 */
public class Ex06 {

	public static void main(String[] args) {
		int n =5;

		//int [] lotto = new int[n*6];

		int [][] lotto = new int [n][6]; // 5행 6열 2차원배열
		
	    for (int i = 0; i < n; i++) {
			fillLotto(lotto[i]);
		}
		
		for (int i = 0; i < n; i++) {
			dispLotto(lotto[i]);
		}
		
		

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

		while (index<=5) {
			lottoNumber = rnd.nextInt(45)+1;
			System.out.println(lottoNumber);

			if(!isDuplicatedLotto(lotto, lottoNumber, index)) lotto[index++] = lottoNumber;
			//index++;
		} // while
		
	}
    //중복되면 true 반환
	//중복되지 않으면 false 반환
	private static boolean isDuplicatedLotto(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if( lottoNumber == lotto[i]) {
				return true;
			}  

		}return false;

	}
} // class
