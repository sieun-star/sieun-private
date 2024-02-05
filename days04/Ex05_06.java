package days04;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오후 3:08:56
 *@subject    조건문 if, if~else 활용
 *@content    국어 점수를 입력받아서
 *                  등급(수, 우, 미, 양, 가) 출력
 *                      90 이상  100 이하 : 수
 *                      kor >=90 && kor <=100
 *                      80 이상   90미만   : 우
 *                      kor >=80 && kor <=89
 *                      70 이상   80미만   : 미
 *                      kor >=70 && kor <=79
 *                      60 이상   70미만   : 양
 *                      kor >=60 && kor <=69
 *                       0 이상    60미만  : 가
 *                       kor >=0 && kor <=59
 */
public class Ex05_06 {
  
	public static void main(String [] args) {
		/*int kor;
		
		try(Scanner scanner = new Scanner(System.in);) {
			kor = scanner.nextInt();
			
			if(kor<=100 && kor>=90 ) {System.out.println("수");
		} catch (Exception e) {
		}
		*/
		
		int kor;
		char grade = '가';
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.print("> 국어 점수 입력?");
			kor = scanner.nextInt();
			
			if (0<=kor && kor <=100) { // 수, 우, 미, 양, 가
			
			if (kor >=90 ) {
				grade = '수';
			} 
			else if (kor >=80) {
				grade = '우';
			}
			else if ( kor >=70) {
				grade = '미';
			} 
			else if (kor >=60) {
				grade = '양';
			} 
			else {
				grade = '가';
			} 
		     System.out.printf("점수(%d)는 등급(%c)이다.", kor, grade);
			} else {
                   System.out.println("국어 점수 (0~100). 입력잘못!!");
			}
			
		} catch (Exception e) {
			 System.out.println("국어 점수 (0~100). 입력잘못(숫자X)!!");
		} //try
		
		
		
		
		
	} // main
	
	
} // class
