package days06;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 5:16:35
 *@subject
 *@content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// [이름(label) 붙은 반복문]
		// break 라벨명;
		// continue 라벨명; 
		OUT:for (int i = 2; i <= 9; i++) {
			IN:for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%02d ", i, j, i*j);
				if (i*j ==24) break OUT;
			}
			System.out.println();
		}
		
		
		

	} // main

} // class
