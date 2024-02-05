package days19;

import java.io.UnsupportedEncodingException;

/**
 * @author SIEUN
 *@date2024. 1. 25. - 오후 12:09:37
 *@subject
 *@content
 */
public class Ex03 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "가";
		byte [] bArr = str.getBytes("UTF-8");
		
		for (int i = 0; i < bArr.length; i++) {
			System.out.printf("[%02x]", bArr[i]);
		}
		System.out.println();

		// byte [] => String 변화
		String s = new String(bArr, "UTF-8");
		System.out.println(s);
		
		
		str = "가";
		bArr = str.getBytes("EUC-KR");
		
		for (int i = 0; i < bArr.length; i++) {
			System.out.printf("[%02x]", bArr[i]);
		}
		System.out.println();

		// byte [] => String 변화
		s = new String(bArr, "UTF-8");
		System.out.println(s);
		
		
		
	} // main

} // class













