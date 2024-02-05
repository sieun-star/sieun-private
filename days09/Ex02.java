package days09;

import java.util.Random;

/**
 * @author SIEUN
 *@date2024. 1. 11. - 오전 10:25:14
 *@subject   days08.Ex05_04.java 
 *@content
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		2. 로또 구현
		   1) 배열 선언
		   2) 랜덤하게 중복체크해서 로또번호 채워넣는 함수 선언
		   3) 로또 번호 출력 함수 선언
		*/
		// 로또 게임 횟수 입력 (n) : 3
		int n =3;
		
		int [] lotto = new int[n*6];

		fillLotto(lotto); 

		dispLotto(lotto);


	} // main

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i <lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i, lotto[i]);
		}
		System.out.println();

	}


	private static void fillLotto(int[] lotto) {
	
		Random rnd = new Random();
	
		
		int lottoNumber = rnd.nextInt(45)+1;
		lotto[0] = lottoNumber;
		System.out.println(lottoNumber);
	
		int index = 1;

		while (index<=5) {
			lottoNumber = rnd.nextInt(45)+1;
			System.out.println(lottoNumber);

			if(!isDuplicatedLotto(lotto, lottoNumber, index)) lotto[index++] = lottoNumber;
			
		}
	}
    
	private static boolean isDuplicatedLotto(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if( lottoNumber == lotto[i]) {
				return true;
			}  

		}return false;

	}
} // class
