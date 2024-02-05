package days04;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오전 10:47:20
 *@subject      [] 인덱스(index)연산자 설명
 *@content      
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// String[] args  : [] 인덱스(index)연산자
		// 1. 한 학생의 국어 점수를 저장한 kor 변수 선언
		// int kor;
		// 2. 10명 학생의 국어 점수를 저장할 변수 선언
		// int kor01, kor02, koe03, kor10;
		
		// 배열 정의 ?  -시험
		//   ㄴ동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것
		// 배열 장점
		//    ㄴ관리 용이
		// 배열 선언 및 생성형식
		//     ㄴ자료형 [] 배열명; =new 자료형[배열크기];
		
		// int 배열 kors
		int [] kors = new int[3];
		// 배열의 크기 배열명.length
		System.out.printf("> 배열 크기 :%d\n", kors.length);
		// 1번학생의 국어점수 : 90
		// int kor = 90;
		// System.out.println(kor);
		
		// 첫 기억공간 : 0번째(첨자값) 요소   배열명[0]       kors[0] 
		// 두 기억공간 : 1번째 요소
		kors[0] = 90;
		kors[1] = 78;
		kors[2] = 89;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		
		// index 첨자값
		// lowerBound 아래첨자값  0
		// upperBound 윗첨자값    2 = 배열크기 -1 = 배열명.length -1
		// ArrayIndexOutOfBoundsException
		// kors[3] = 100;
		
		kors = null;
		// NullPointerException
		kors[0] = 90;
	
		


		
		
		
		
	} // main

} // class
