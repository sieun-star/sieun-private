package days10;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 11. - 오후 5:28:51
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 10진수 정수를 입력받아서 8진수로 출력
	   
		int n = 10;
		
		int reminder, share;
		
		String strResult = "";
		
		while (n!=0) {
			share = n / 8;
			reminder = n%8;
			// System.out.println(reminder);
			strResult +=reminder;
			n = share;
		}
		
		String reverseStrResult = "";
		for (int i = 0; i < strResult.length(); i++) {
			reverseStrResult += strResult.charAt(strResult.length()-1-i);
		}
		System.out.println(reverseStrResult);
		
		
	} // main

} // class
