package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author SIEUN
 *@date2024. 1. 25. - 오전 10:29:09
 *@subject
 *@content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 조연화, 한재호, 류영은, 이동영
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		// Bubble Sort, Selcetion Sort
		/*
		Arrays.sort(m);  // 오름차순 정렬
		
		// 내림차순 정렬
		int [] temp = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			temp[ m.length-1-i ] = m[i];
		}
		*/
		// The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
		//                T[] 기본형은 못들어감..
		// Arrays.sort(m, Collections.reverseOrder());  int [] 이 아니라 Integer []로 바꿔야 사용 가능
		
		// int [] => Integer [] 변환
		// IntStream -> Stream<Inteager> => Integer []
		//  stream             boxed                    toArray
		Integer[] temp = Arrays.stream(m).boxed().toArray(Integer []::new);
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println(Arrays.toString(temp));
		
		// Integer [] => int [] 변환
		//    Stream<Integer>   Inststream                    int []
		m =Stream.of(temp).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(m));

	} // main

	
} // class
