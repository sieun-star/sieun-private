package days11;

import java.util.Arrays;

/**
 * @author SIEUN
 *@date2024. 1. 15. - 오전 11:24:14
 *@subject
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		int [] m = new int [10];
		for (int i = 0; i < m.length; i++) {
		    m[i] = i+1;
		    
		}
		System.out.println(Arrays.toString(m));
		
		// 배열섞기....
		shuffle(m);
		
		System.out.println(Arrays.toString(m));

	} // main

	
	private static void shuffle(int[] m) {
		int idx1=0, idx2;
		
		// idx1== idx2  1번방 고정 2번방 1~9번 랜덤하게 -> 1번방 2번방에 같은 값 나오지 않게!
		for (int i = 0; i < 10; i++) {
			idx2 = (int)(Math.random()*9)+1;
			
			int temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
		}
		
	}
	
	/* [1]
	private static void shuffle(int[] m) {
		int idx1, idx2;
		for (int i = 0; i < 10; i++) {
			idx1 = (int)(Math.random()*m.length);
			idx2 = (int)(Math.random()*m.length);
			
			int temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
		}
		
	}
    */
} // class
