package days10;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 11. - 오후 5:28:51
 *@subject
 *@content
 */
public class Ex01_03 {

	public static void main(String[] args) {
	   //10진수 정수를 입력받아서 16진수로 출력
		
		int n = 125;   // 0x7D
		
		int reminder, share;
		
		String strHex = "";
		
		// 0123456789ABCDEF
		char [] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'}; 
		while (n!=0) {
			share = n / 16;
			reminder = n%16;
			strHex = ch[reminder] + strHex;
			n = share;
		}
		
		System.out.println(strHex);
		
		
	} // main

} // class
