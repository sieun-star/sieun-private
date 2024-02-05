package days02;

/**
 * @author SIEUN
 *@date2024. 1. 2. - 오후 3:42:12
 *@subject
 *@content
 */
public class Ex08 {

	public static void main(String[] args) {
	
       // [진법 변환]
	   // 16 진수 : 0 1 2 3 4 5 6 7 8 9 a(10) b(11) c(12) d(13) e(14) f(15)
	   // 10 진수 : 0 1 2 3 4 5 6 7 8 9 
	   // 8 진수 : 0 1 2 3 4 5 6 7
	   // 2 빈수 : 0 1 
		
		byte b = 10; //1byte   [0][0][0][0][1][0][1][0] -10을 2진수로 표현
		//  <암기>
		System.out.println(Integer.toBinaryString(b)); // "1010" 2진수
		System.out.println(Integer.toOctalString(b)); // "12"  8진수
		System.out.println(Integer.toHexString(b)); // "a"  16진수
		

		
		
		
	} //main

} //class
