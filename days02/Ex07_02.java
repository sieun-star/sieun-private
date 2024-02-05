package days02;

import java.util.Calendar;

/**
 * @author SIEUN
 *@date2024. 1. 2. - 오후 3:04:37
 *@subject
 *@content
 */
public class Ex07_02 {
	
	public static void main(String[] args) {
		int i = 10;
		System.out.printf("%d\t%o\t%x\t%X\n", i,i,i,i); // \t 탭 키
		System.out.printf("%1$d\t%1$o\t%1$x\t%1$X\n", i);
		System.out.printf("%1$d\t%1$#o\t%1$#x\t%1$#X\n", i);
		
		// 날짜 클래스 
		Calendar c = Calendar.getInstance();
		System.out.printf("%1$tY - %1$tm - %1$te\n", c);
		
		// 출력서식 사용할 때 형식(문법)
		// %[argument_index$][flags][width][.precision]conversion
		boolean gender = true;
		System.out.printf("%b\n", gender);
		
		int tot = 277;
		double avg = 92.3333333333333;
		
		System.out.printf("총점 : [%10d]\n", tot);   // 전체 넓이를 10으로 하고 우측 정렬
		System.out.printf("총점 : [%-10d]\n", tot);  // 전체 넓이를 10으로 하고 좌측 정렬 
		System.out.printf("평균 : [%10.2f]\n", avg); //전체 넓이를 10으로 하고 소숫점 2번째 자리까지 반올림 우측정렬
		
		int money = 123456;
		System.out.printf("머니 : %,d \n", money); //, 찍으면 3자리마다 자동으로 , 찍어줌
		
		int no = 15;
		//  0015로 출력
		System.out.printf("NO : [%04d] \n", no); // 넓이 앞에 0을 쓰면 빈자리 0으로 채움
		
		
	} // main

} // class
