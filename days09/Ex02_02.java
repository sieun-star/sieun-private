package days09;

import java.util.Random;

/**
 * @author SIEUN
 *@date2024. 1. 11. - 오전 10:25:14
 *@subject   days08.Ex05_04.java 
 *@content
 */
public class Ex02_02 {

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
		
		for (int i = 0; i <n; i++) {
			fillLotto(lotto, i);  // 한 게임을 채워넣는 함수
		}

		dispLotto(lotto);


	} // main

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i <lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d] ", i, lotto[i]);
			if (i%6==5) System.out.println(); // 로또게임 한게임당 개행
		}
		System.out.println();

	}


	private static void fillLotto(int[] lotto,int i) { // i = 0, 1, 2
	
		Random rnd = new Random();
		
		int lottoNumber = rnd.nextInt(45)+1;
		lotto[0+6*i] = lottoNumber;
		System.out.printf("[%d]",lottoNumber);
	
		int index = 6*i+1;

		while (index<=6*i+5) {
			lottoNumber = rnd.nextInt(45)+1;
			System.out.printf("[%d]",lottoNumber);

			if(!isDuplicatedLotto(lotto, lottoNumber, index,i)) lotto[index++] = lottoNumber;
			
		}
		System.out.println();
	}
    
	private static boolean isDuplicatedLotto(int[] lotto, int lottoNumber, int index, int i) {
		for (int j=6*i ; j < index ; j++) {
			if( lottoNumber == lotto[j]) {
				return true;
			}  

		}return false;

	}
} // class
