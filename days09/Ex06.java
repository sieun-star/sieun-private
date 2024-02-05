package days09;

import java.util.Arrays;

/**
 * @author SIEUN
 *@date2024. 1. 11. - 오전 11:31:45
 *@subject
 *@content
 */
public class Ex06 {

	public static void main(String[] args) {
		//6. 정수를 입력받아서 2진수로 출력하는 코딩을 하세요. 
		//                      int(4byte)
	    //    10 => 00000000 00000000 00000000 00001010
		

		int [] binaryArr = new int[32];
		int n = 10;
		int index = binaryArr.length -1; // 배열크기 -1 
		int reminder;  // 나머지 저장할 변수
		
		while (n!=0) {
			int share = n / 2;
			reminder = n%2;
			binaryArr[index--] = reminder;
			n = share;
		}
		// System.out.println(Arrays.toString(binaryArr));
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d", binaryArr[i]);
			if (i%8==7) System.out.print(" ");
		}
		
		
		/*
		 * [1]
		int n = 10;
		String binaryN = Integer.toBinaryString(n);
		System.out.println(binaryN); // "1010"; (문자열)
		
		//String -> Int 변환
	    System.out.printf("%032d", Integer.parseInt(binaryN));
	    // String value = String.format("%032d", Integer.parseInt(binaryN));
		*/
		
		
	} // main

} // class
