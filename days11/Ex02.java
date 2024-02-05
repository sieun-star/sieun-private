package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 15. - 오전 10:20:45
 *@subject
 *@content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
        /*
		2. main(){
		       int [] m = new int[3];
		       
		    }
		    1) 배열에 정수값을 입력받아서 추가하는 appendArray() 함수를 구현하고
		        배열 크기가 부족한 경우 3개씩 늘리는 코딩을 하세요 .
		    2) 배열을 출력하는 dispArray() 함수를 만드세요. 
		    
		    ( 매개변수, 리턴자료형은 각자 판단해서 정하세요 )    
		    
		  */
		
		int [] m = new int[3];
		
		
		m = appendArray(m);
		
		dispArray(m);

		
		
		
	} // main

	private static int [] appendArray(int[] m) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		char con = 'y';
		do {
			if (index == m.length) {
				int [] temp = new int[m.length+3];
				for (int i = 0; i < m.length; i++) {
					temp[i] = m[i];
				}
				m=temp;
			}
			System.out.printf(" > m[%d] 입력?", index);
			m[index++] = scanner.nextInt();
			
			System.out.printf("> 입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		System.out.println(" > i : " + Arrays.toString(m));
		return m;
		
	}

	private static void dispArray(int[] m) {
		
		System.out.println(Arrays.toString(m));
		
	}

} // class
