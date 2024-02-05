package days02;

/**
 * @author SIEUN
 *@date2024. 1. 2. - 오후 4:47:03
 *@subject
 *@content
 */
public class Ex11 {

	public static void main(String[] args) {
        //실수형 : float(4), double(8)
		//정수형 : int(4) ,   long(8)
		float f;    // 32비트 [부호비트1][8비트 지수(E) 1000 0010][23가수]
		double d;// 64비트 [부호비트1][             11비트 지수(E)][54가수]
		
		// [9.1234567]  10진수 실수 -> 2진수 실수 변환 -> 정규화 -> 저장
		// 1001.00011111110000011111.........(무한실수)
		// 정규화 (부동소수점) 
		// 1.0010001111111100010111...X2^3 (무한실수)
		//      가수(M)                                지수(E) = 127+3 = 130
		// 오차가 생기는 자료형 (double이 float 보다 오차가 적다)
		
		
		
		

	} //main

} //class
