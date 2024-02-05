package days13;

/**
 * @author SIEUN
 *@date2024. 1. 17. - 오후 5:40:02
 *@subject      골뱅이, 대각선 숙제!
 *@content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		int [][] m = new int[5][5];
		
		/*
		[01][02][03][04][10]
		[05][06][07][08][26]
		[09][10][11][12][42]
		[13][14][15][16][58]
		[28][32][36][40][136]
	    */
		 //plusM(m);
		
		
		// 대각선
//		[01][02][04][07][11]
//		[03][05][08][12][16]
//		[06][09][13][17][20]
//		[10][14][18][21][23]
//		[15][19][22][24][25]
		
		tktjsM(m);
		
		// [골뱅이]
		/*
		 * [01][02][03][04][05]
		 * [16][17][18][19][06]              04  44  40  10  13  33  31  21  22
		 * [15][24][25][20][07]
		 * [14][23][22][21][08]
		 * [13][12][11][10][09]
		 */
		// rhfqoddlM(m);

		dispM(m);
		
		
	} // main

	private static void tktjsM(int[][] m) {
		int n =1;
		int row =0;
		int col = 0;
		int count = 1;
		while (n<=25) {
			m[row][col]=n;
			if (row+col==count) {
				
			}
		}
		
	}

	private static void rhfqoddlM(int[][] m) {
		int n =1;
		int row = 0;
		int col = 0;
		while (n<=25) {
			m[row][col]=n;
			if (col==4) {
				row++;
			}else if (row==4 && col==4) {
				col--;
			}else if (col==0) {
				row--;
			}else if (row==1) {
				col++;
			}else if (col==3) {
				row++;
			}else if (row==3 && col==3) {
				col--;
			}else if (col==1) {
				row --;
			}else if (row ==2) {
				col++;
			}
			
			
			n++;
		}
		
	}

	private static void plusM(int[][] m) {
		int n = 1;
		int row = 0, col=0;
		
		while (n<=16) {
			m[row][col]=n;
			
			
			
		}
		
	}
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {  //행 갯수
			for (int j = 0; j < m[i].length; j++) { // 열 갯수
				System.out.printf("[%02d]", m[i][j]);
			}
			System.out.println();
			
		}
	}

} // class
