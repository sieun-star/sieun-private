package days03;

/**
 * @author SIEUN
 *@date2024. 1. 3. - 오전 10:38:36
 *@subject   [형변환 설명]
 *@content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		/*
		 * [형변환]
		 * 1. 정의 : 변수 또는 상수의 자료형(타입)을 다른 자료형(타입)으로 변환하는것.
		 * 2. 예
		 *     int -> byte
		 *     byte -> int
		 *     int -> float
		 *     double -> int
		 *     String -> int
		 *     int -> String
		 *     char -> String
		 *     String -> char
		 * 3. 형 변환하는 방법
		 *     1) 자동 형변환 - 2가지
		 *     2) 강제 형변환 
		 *         ㄱ.1경우
		 *         ㄴ.방법
		 *             (변환하고자하는 자료형)   cast 연산자
		 *             cast 강제 형변환.
		 *             
		 *             3+5*2=13  연산자 우선순위 *>+
		 *             (3+5)*2  () 최우선연산자 
		 */

         byte b = 100; // [0][1][1][0][0][1][0][0] 8비트
         //자동형변환 첫 번째 경우 ( 좌측에 있는 자료형의 크기가 더 크면 자동으로 형변환)
         long l = b;       // [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
		System.out.println(l);
		// 
		double d =l;     // [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
		System.out.println(d);
		// 정수계열보다 실수계열이 더 크다고 인식됨(long 이 8바이트지만 float(4바이트)이 실수계열이라 더 크다고 인식)
		float f = l;
		System.out.println(f);
		
		// int i = 100L; 자동 형변환 X
		
		// Type mismatch: cannot convert from double to float 
		//float f2 = 3.14; 3.14를 double로 인식해서 자동형변환 X
		//float f2 = 3.14F;
		
		
		int x = 100;
		long y =100;
		// Type mismatch: cannot convert from long to int
		// 자동형변환 두번째경우 작은자료형 연산  큰자료형 => 자동 큰자료형
		long z = x + y; // [][][][] + [][][][][][][][]
		
		
		
		
	}

}
