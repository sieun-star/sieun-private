package days18;

/**
 * @author SIEUN
 *@date2024. 1. 24. - 오후 4:45:11
 *@subject
 *@content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		/*
	      문제 설명
	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
	      */
		
		System.out.println(solution(3)); // "수박수"
		System.out.println(solution(4)); // "수박수박"
		
		
		
	} // main

	
	private static String solution(int n) {
		String answer = "";
		StringBuffer sb = new StringBuffer();
		
		int 몫 = n/2;
		int 나머지 =n%2;
		
		for (int i = 0; i <몫; i++)  sb.append("수박");
		// sb.append("수박".repeat(몫));
		
		if ( 나머지 ==1 ) sb.append('수');
		
		answer = sb.toString();
		return answer;
	}
	
	
	
	
	/* [2]
	public static String solution(int n) {
		// 1<=자연수<=10000
		String answer = "";
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <=n; i++) {
			if (flag) {
				sb.append('수');
			}else {
				sb.append('박');
			}
			flag = !flag;
		}
		// StringBuilder -> String
		answer= sb.toString();
		return answer;
	}
	*/
	
	/* [1]
	public static String solution(int n) {
		// 1<=자연수<=10000
		String answer = "";
		
		for (int i = 1; i <=n; i++) {
			if (i%2==1) {
				answer +="수";
			}else {
				answer +="박";
			}
		}
		
		return answer;
	}
    */
}// class







