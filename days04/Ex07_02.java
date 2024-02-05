package days04;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오후 5:22:52
 *@subject
 *@content
 */
public class Ex07_02 {

	public static void main(String[] args) {

		int kor;
		char grade = '가';
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.print("> 국어 점수 입력?");
			kor = scanner.nextInt();
			// 
			switch (kor / 10) {
			case 10:
				System.out.println("수");
				break;
			case 9:
				System.out.println("수");
				break;
			case 8:
				System.out.println("우");
				break;
			case 7:
				System.out.println("미");
				break;
			case 6:
				System.out.println("양");
				break;
			case 5:
				System.out.println("가");
				break;
			case 4:
				System.out.println("가");
				break;
			case 3:
				System.out.println("가");
				break;
			case 2:
				System.out.println("가");
				break;
			case 1:
				System.out.println("가");
				break;
			case 0:
				System.out.println("가");
				break;
			default:
				System.out.println("입력잘못!!");
				break;
			}
          System.out.printf("점수(%d)는 등급(%c)이다", kor, grade);
		} catch (Exception e) {
			System.out.println("국어 점수 (0~100). 입력잘못(숫자X)!!");
		} //try




	} // main

} // class
