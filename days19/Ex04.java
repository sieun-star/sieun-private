package days19;

import java.util.StringTokenizer;

/**
 * @author SIEUN
 *@date2024. 1. 25. - 오후 12:16:23
 *@subject
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {
		// StringTokenizer 클래스
		// String.split()
		String s = "구본혁, 권맑음, 김영진, 김진성";
		StringTokenizer st = new StringTokenizer(s, ",");  // 정규표현식 사용X
		
		/*
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());   // boolean true/false 
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());   // boolean true/false 
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());   // boolean true/false 
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());   // boolean true/false 
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());   // boolean true/false 
		*/
		
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name.stripLeading());
		}
		
		
		

	} // main

} // class
