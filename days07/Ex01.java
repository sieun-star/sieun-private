package days07;
/**
 * @author SIEUN
 *@date2024. 1. 9. - 오전 9:01:17
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <=5; j++) {
				System.out.printf("%d*%d=%02d ", j, i, j*i);
			}System.out.println();
		}System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 6; j <=9; j++) {
				System.out.printf("%d*%d=%02d ", j, i, j*i);
			}System.out.println();
		}
		*/
		for (int k = 1; k <=2; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j =4*k- 2; j <=4*k+1; j++) {
					System.out.printf("%d*%d=%02d ", j, i, j*i);
				}System.out.println();
			}
		}
		
		
		
		
		
		
	} // main

} // class
