package days06;

import java.util.Arrays;
import java.util.Random;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 12:02:30
 *@subject     [ 암기 ]
 *@content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		// 2. 정수를 10개 저장할 배열 m 을 선언하고 5<= n && n <= 15 범위의 임의의 정수로 채워넣은 후 배열의 각 요소를 출력하는 코딩을 하세요.
       
		// [람다식과 스트림] 설명
		//                      5~15 사이 숫자를 랜덤하게   10개  ints -> int 문자열
		/*int [] m = new Random().ints(5,16).limit(10).toArray();
		
		System.out.println(Arrays.toString(m));
		*/
		
		int max = new Random().ints(5,16).limit(10).max().getAsInt();
		System.out.println();
		
	} // main

} // class
