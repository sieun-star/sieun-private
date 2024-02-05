package days08;

/**
 * @author SIEUN
 *@date2024. 1. 10. - 오전 11:50:44
 *@subject
 *@content
 */
public class Ex04_02 {

	public static void main(String[] args) {
	    //1~n 까지의 합을 반환하는 일반함수
		//1~n 까지의 합을 반환하는 재귀함수
		int n = 10;
		// int result = sum(n);
		int result = recursiveSum(n);
		System.out.printf("1~%d=%d\n", n, result);

	} // main
	
	//재귀함수 : 트리 구조 - 검색
	private static int recursiveSum(int n) {
		if (n==1) return n;
		else return n + recursiveSum(n-1);
	}
	/*
	 * [ 재귀함수 처리 과정 설명 ]
	 * recursiveSum(10)
	 *  ㄴ return 10 + 9 + 8+ ...+ 2 + recursiveSum(1)
	 */
	
    //일반함수
	private static int sum(int n) {
		int result = 0;
		for (int i = 1; i <=n; i++) {
			result +=i;
		}
		return result;
	}

} // class
