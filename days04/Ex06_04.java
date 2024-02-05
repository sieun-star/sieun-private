package days04;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오후 4:43:18
 *@subject
 *@content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 15; i >=5; i--) {
			sum+=i-5;
			System.out.printf("%d+", i-5);
		}// for
		System.out.printf("\b=%d\n", sum);

	} //main

} // class
