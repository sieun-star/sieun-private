package days11;

import java.util.Arrays;

/**
 * @author SIEUN
 *@date2024. 1. 15. - 오전 10:31:29
 *@subject
 *@content
 */
public class Ex03 {

	public static void main(String[] args) {
        /*
		3. int [] m =  {3,5,2,4,1};
		정수 4가 있는 위치에 100을 삽입하는 코딩을 하세요.   
        */
		
		
		int [] m = {3,5,2,4,1};
		int foundIndex = indexOf(m , 4);
		// System.out.println(foundIndex);
		
		int [] temp = new int[m.length +5];
		// Arrays.copyOfRange(null, foundIndex, foundIndex);
		
		System.arraycopy(m, 0, temp, 0, m.length);
		for (int i = m.length; i >= foundIndex; i--) {
			temp[i+1] = temp[i];
		}
		temp[foundIndex] = 100;
		System.out.println(Arrays.toString(temp));
		
		// 100삭제
		for (int i = 4; i <=m.length; i++) {
			temp[i-1] = temp[i];
		}
		temp[5] = 0;
		System.out.println(Arrays.toString(temp));
		
		

	} // main

	//순차검색 (Sequence Search)
	private static int indexOf(int[] m, int n) {
		for (int i = 0; i < m.length; i++) {
		if ( m[i] == n) return i;
		}
		return -1;
	}

} // class
