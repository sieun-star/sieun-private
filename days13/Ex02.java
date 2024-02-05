package days13;

/**
 * @author SIEUN
 *@date2024. 1. 17. - 오후 3:26:47
 *@subject      
 *@content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int [][] m = new int[5][5];
		
		
		// 마방진
		magicSquare(m);
		
		//fillM01(m);
		//fillM02(m);
		//fillM03(m);
		//fillM04(m);
		dispM(m);
		

	} // main
	
	private static void magicSquare(int[][] m) {
		// 1) 첫 번째 행의 가운데 열    1
		// 2) 출력한 값이 5의 배수 o  -> 행만 증가
		//                            x  -> 열증가, 행감소
		//                                        ㄴ 행 벗어나는 경우 - 가장 큰 행의 값으로 설정
		//                                        ㄴ 열 벗어나는 경우 - 가장 작은 열의 값으로 설정
		int n = 1;
		int row=0, col =2;  // 첫번째 숫자가 찍힐 위치
		
		while (n<=25) {
			m[row][col] =n;
			
			dispM(m);
			
			//1초 후에 기다리기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			if (n%5==0) {row++;
			}else {
				col++; row--;
				if (col==5) col=0;
				else if (row==-1) row=4;
			}
			n++;
			
			
		}
		
		
	}
	
	/*
	private static void fillM04(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				 m[i][i%2==0? j :4-j]=m.length*i+j+1;
			}
		}
	}
	*/	
		/*[1]
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// if(i%2==0) m[i][j]=m.length*i+j+1;
				// else m[i][j]=(i+1)*m.length-j;
				 m[i][j]=i%2==0? m.length*i+j+1:(i+1)*m.length-j;
			}
		}
	}
       */

	/*
	private static void fillM03(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=m.length-i+m.length*j;
			}
		}
	}
	*/
	/*[1]
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[i].length; j++) {
			m[4-j][i]=5*i+j+1;
		}
	}
}
  */ 
	
	
	/*
	private static void fillM02(int[][] m) {
		for (int i = 0; i < m.length; i++) { 
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j]= i*m.length+j+1;   // 25,24,23~1
			}	
		}	
	}
	*/	
		/*
		for (int i = 0; i < m.length; i++) {  
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=25-(5*i+j);
			}	
		}	
	}
	*/
	
	/*
	private static void fillM02(int[][] m) {
		for (int i = 0, value=25; i < m.length; i++) {  
			for (int j = 0; j < m[i].length; j++, value--) {
				m[i][j]=value; // 25,24,23~1
			}	
		}	
	}
   */



	//[2]
	/*
	private static void fillM01(int[][] m) {
		for (int i = 0; i < m.length; i++) {  //행 갯수
			for (int j = 0; j < m[i].length; j++) { // 열 갯수
				m[i][j]= i*m.length+j+1;  // 1,2,3,4,~25
			}	
		}	
	}
	*/
	
	//[1]
	/*
	private static void fillM01(int[][] m) {
		for (int i = 0, value = 1; i < m.length; i++) {  //행 갯수
			for (int j = 0; j < m[i].length; j++, value++) { // 열 갯수
				m[i][j]= value;
			}	
		}
	}
   */
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {  //행 갯수
			for (int j = 0; j < m[i].length; j++) { // 열 갯수
				System.out.printf("[%02d]", m[i][j]);
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

} // class
