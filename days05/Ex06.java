package days05;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오후 2:00:20
 *@subject       ASCII 256가지 출력
 *@content
 *                0~31 제어문자
 *                32~127 일반문자( 숫자, 대소문자 등)
 *                128 ~사선 문자...
 *                
 *                문제1) 한 라인에 10개씩 출력
 *                   --개행 
 */
public class Ex06 {

	public static void main(String[] args) {
		  
	      //ASCII  10   개행    LineFeed(LF)         '\n'
	      //ASCII  13   개행    CarrageReturn(CR)    '\r'
	      
	      // 개행 '\r\n' 엔터

		for (int i = 0; i < 256; i++) {

			// System.out.printf("%d-%c\n", i, i);
			System.out.printf("[%c]", (char)i);
			if ( i%10==9 ) {
				System.out.println();
			}
		} // for
          /*
           *  i = 0 1 2 3 4 5 6 8 9 개행
           *       10                 19	개행	
           */      
		
		
		
		
		

	} // main	

} // class
