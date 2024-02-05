package days05;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오후 3:36:15
 *@subject  if, switch, for, while, do~while
 *@content break
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		/*
		 *  [while / do~while 차이점]
	
		int i =10;
		while (i <2) {
			System.out.println("A");
		}
		do {
			System.out.println("B");
		} while (i <2);
		*/
		
		int kor;
		Scanner scanner = new Scanner(System.in);
		String strKor;
		// String regex = "[0-9]{1,3}";
		//String regex = "\\d{1,3}";
		String regex = "\\d{1,2}|100";
		/*
		int i=0;
		
		do {
			// System.out.print(">국어 점수 입력?");
			System.out.printf((i !=0 ?"다시 입력하세요>":"국어 점수를 입력하세요> "));
			
			strKor = scanner.next(); // 0~100
			i++;
		
		} while (!strKor.matches(regex));
		
		kor = Integer.parseInt(strKor);
		System.out.println("입력 국어 :" + kor);
		*/
		int count = 0;
	      
	      do {
	         if( count != 0) {
	            System.out.printf("[%d]번 실패!!!\n", count);
	            if( count == 5) {
	               System.out.println("> 오늘은 그만 하자 <");
	               return ;
	            }
	         }
	         System.out.printf("국어 점수 입력 ? ");         
	         strKor = scanner.next(); // 0~100    
	         count++;
	      } while (!strKor.matches(regex));
	      kor = Integer.parseInt(strKor);
			System.out.println("입력 국어 :" + kor);
		
		

	} // main

} // class
