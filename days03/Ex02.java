package days03;

/**
 * @author SIEUN
 *@date2024. 1. 3. - 오전 11:19:46
 *@subject
 *@content
 */
public class Ex02 {

	public static void main(String[] args) {
        
		
		int i = Integer.MAX_VALUE;       //100;
		int j = 100;
		
		// int k =i + j;  -> 산술 오버플로워(overflow) 발생, int로 표현할 수 있는 최대값을 넘어서 -값으로 표시됨. 
		
		long k =(long)i + j;
		
		System.out.printf("%d + %d = %d\n", i, j, k);
		

		
		
		
		
	} //main

} //class
