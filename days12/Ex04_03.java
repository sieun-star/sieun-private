package days12;

/**
 * @author SIEUN
 *@date2024. 1. 16. - 오후 12:06:58
 *@subject     [수업 종료 후 풀어보기]  
 *@content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// 3행 4열 2차원 배열
		int [][] n = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int row = n.length;
		int col = n[0].length;
		// 2행 6열 2차원 배열
		int [][] m = new int [2][6];
		
		// n -> m 
		/*
		i=0 j=0   00
		i=0 j=1   01
		i=0 j=2   02
		i=0 j=3   03
		
		i=1 j=0   04
		i=1 j=1   05
		i=1 j=2   10
		i=1 j=3   11
		
		i=2 j=0   12
		i=2 j=1   13
		i=2 j=2   14
		i=2 j=3   15      
*/

        
        for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				m[][]=n[i][j];
			}
		}
		

		
		

		
		dispN(n);
		

	} // main

	private static void dispN(int[][] n) {
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
