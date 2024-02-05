package days04;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오후 4:02:05
 *@subject   for문 사용해서 1~N(10)의 합 출력 (시험)
 *@content
 */
public class Ex06_02 {

	//[3] 제일 좋은 코딩!
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d+", i);
			sum += i; // sum = sum + i;
		} //for
		System.out.printf("\b=%d\n", sum); // 글꼴때문에 안지워져 보임!! 콘솔창에서는 지워짐! \b 마지막 + 지워줌

	} // main


	/* [2]
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			System.out.printf(i==10? "%d" : "%d+", i);
			sum += i; // sum = sum + i;
		} //for
		System.out.printf("=%d\n", sum);



	} //main	

	 */

	/* [1]
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if (i==10) {
				System.out.printf("%d", i);
			} else {
				System.out.printf("%d+", i);
			} //if
			sum += i; // sum = sum + i;
		} //for
		System.out.printf("=%d\n", sum);



	} //main
	 */

} //class
