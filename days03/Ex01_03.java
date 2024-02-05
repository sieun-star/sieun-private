package days03;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 3. - 오전 9:42:08
 *@subject
 *@content
 */
public class Ex01_03 {

	public static void main(String[] args){


		// Ctrl + Shift + O 자동으로 import 구문 처리 

		String name;
		byte kor, eng, mat;
		short tot; 
		double avg;

        Scanner scanner = new Scanner(System.in);
         
        // Scanner 구분자를 콤마(,) 사용하고 싶다 -> 찾아보기(검색) 홍길동,90,78,38
        // nextXXX() 메서드 사용 
		System.out.print("> 이름_국어_영어_수학 입력 ? ");
		name = scanner.next(); // scanner.nextLine();
		kor = scanner.nextByte();
		eng = scanner.nextByte();
		mat =scanner.nextByte();


		//강제형변환 1번째 경우
		tot =(short)(kor + eng + mat); // int 보다 작은 자료형은 연산할 때 CPU 가 int 자료형으로 처리해서 연산
		avg =(double)tot /3; // 3.0   3.  3d



		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f이다.", name, kor, eng, mat, tot, avg);











	} //main

} //class
