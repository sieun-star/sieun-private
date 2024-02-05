package days08;

/**
 * @author SIEUN
 *@date2024. 1. 10. - 오후 12:42:05
 *@subject
 *@content
 */
public class Ex04_04 {

	public static void main(String[] args) {
         // [문제]
		 // [거듭제곱] = 누승 = 멱 = pow
		 // 밑수 를 지수만큼 반복해서 곱하는것.
		 // 2^3 = 2*2*2 = 8
		 // 2^-3 = 1/(2^3) = 1/8 = 0.125
		
		//int result = pow(2,3);
		int result = pow(2,-3);
		System.out.println(result);
		
		
	} // main
	//재귀함수
	private static int recursivePow(int a, int b) {
		return 0;
	}
	
    //일반함수
	private static int pow(int a, int b) {
		int result = 1;
		if (b>=1) {
			for (int i = 1; i <= b; i++) {
			}result*=a;
			return result;
		}else {
			for (int i = 1; i <= -b; i++) {	
		}result*=a;
	}return result;
	
	}
	
} // class
