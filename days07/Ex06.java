package days07;

/**
 * @author SIEUN
 *@date2024. 1. 9. - 오후 2:21:46
 *@subject
 *@content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 1/2+2/3+3/4.....+8/9+9/10=??
		
		double sum = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d/%d+",i,i+1);
			sum += (double)i/(i+1);
		}
		System.out.printf("\b=%f\n", sum);
		

	} // main

} // class
