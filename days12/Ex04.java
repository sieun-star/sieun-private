package days12;

/**
 * @author SIEUN
 *@date2024. 1. 16. - 오전 11:33:18
 *@subject
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 2차원 배열 -> 1차원 배열 옮기는 코딩
		int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };
		dispM(m);  
		
		int [][] n = new int [3][4];
		int row = n.length;
		int col = n[0].length;
		
		// 1차원 배열 -> 2차원 배열 옮기는 코딩
		for (int i = 0; i < m.length; i++) {
			n[i/col][i%col] = m[i];
		}
		
		
		idspN(n);
		

	} // main

	private static void idspN(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("n[%d][%d]=%d ", i, j, n[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
		}
		System.out.println();
	}

} // class
