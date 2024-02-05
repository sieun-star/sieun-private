package days05;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오후 2:26:00
 *@subject
 *@content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 한 라인에 ASCII 10개 출력
		
		for (int i = 0, lineNumber =1; i < 256; i++) {
			//if (i%10 ==0) System.out.printf("%d : ", i/10+1);
			if (i%10==0) System.out.printf("%d : ", lineNumber++);
			System.out.printf("[%c]",(char)i);
			
			if (i%10==9) {
				System.out.println();
			}
		}
		
		
		
	} // main

} // class
