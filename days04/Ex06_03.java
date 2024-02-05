
package days04;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오후 4:23:07
 *@subject
 *@content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		for (     ;    ;    ){
			if (i >10 ) break;
			sum+=i;
			System.out.printf("%d+",i++);
			// i++;
			// ++i;
		} //for 조건식이 없으면 무한루프, 조건식에 참/거짓으로 판명되는 식이면 길이가 길어도 상관없다.
		
		// Unreachable code
		System.out.printf("=%d\n", sum);
		 
		
		
		
		
	} // main

} // class
