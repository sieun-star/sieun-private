package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 3:55:06
 *@subject
 *@content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		
		String name ;
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine(); // lee chang ik
		System.out.printf("name : %s\n", name);
		
		// String.toCharArray()
		// String -> char[] 변화하는 함수(메서드)
		char [] nameCharArray = name.toCharArray();
		
		// 배열 안의 값을 확인하는 용도로 Arrays.toString() 메서드를 사용.
		// [ l, e, e,  , c, h, a, n, g,  , i, k]
		System.out.println(Arrays.toString(nameCharArray));
		
		// 2) char [] -> String 변환하는 방법 : String.valueOf() 메서드
		name = String.valueOf(nameCharArray);
		System.out.printf("name : %s\n", name);
		
		
	} // main

} // class
