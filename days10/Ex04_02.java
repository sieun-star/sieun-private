package days10;

import java.util.Arrays;

/**
 * @author SIEUN
 *@date2024. 1. 12. - 오후 4:16:46
 *@subject
 *@content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// (테스트)배열의 가득 차면 배열 크기를 늘려서 추가.
		int [] m = new int [3];
		int index = 0;
		
		m[index++] =1;
		m[index++] =2;
		m[index++] =3;
		
		// index ==3 ArrayIndexOutOfBoundsException
		if (m.length==index) {
			int [] temp = new int[m.length +3];
			for (int i = 0; i < m.length; i++) {
				temp[i]=m[i];
			}
			m=temp;
		}
		m[index++] =4;
		System.out.print(Arrays.toString(m));

	} // main

} // class
