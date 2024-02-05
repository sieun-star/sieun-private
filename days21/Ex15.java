package days21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SIEUN
 *@date2024. 1. 29. - 오후 4:33:34
 *@subject      days19.Ex02.java
 *@content
 */
public class Ex15 {

	public static void main(String[] args) {
		

		String my_str = "abc1Addfggg4556b";
		int n = 6;

		String[] answer = solution(my_str, n);

		System.out.println(Arrays.toString(answer));
		
		
	} // main

	public static String[] solution(String my_str, int n) {
		
		String[] answer = {};
		
		ArrayList list = new ArrayList();
		
		StringBuilder sb = new StringBuilder(my_str);
		
		try {
			while (true) {
				list.add(sb.substring(0, n));    sb.delete(0, n);
			}
		} catch (Exception e) {
			list.add(sb.substring(0)); 
		}
	
		// System.out.println(list);
		
		// [문제점] ArrayList -> String [] 변환
		//           String [] -> ArrayList 변환
		// list.forEach(name -> System.out.println(name));
		
		// [ JAVA 8 Stream 사용한 예제 ]
        // answer = (String[]) list.stream().toArray(String [] :: new);  // 기억하삼~

		answer = (String[]) list.toArray(new String[0]);
		
		return answer;
	}
	
	/*
	public static String[] solution(String my_str, int n) {
	       int answerLength = (int) Math.ceil( (double)my_str.length() / n ); 
	       
	        String[] answer = new String[answerLength];
	        
	        /*
	        String a = my_str.substring(0, 6);
	        System.out.println( a );
	        
	        a = my_str.substring(6, 12);
	        System.out.println( a );
	        
	        a = my_str.substring(12, 16);
	        System.out.println( a );
	        */
	        /*
	        int beginIndex = 0, endIndex;
	        String str = null;
	        int my_strLength = my_str.length();
	        int index = 0;
	        while (index != answerLength) {
	           endIndex = beginIndex + n;
	           if( endIndex > my_strLength)  endIndex = my_strLength;
	           str = my_str.substring(beginIndex, endIndex);
	           beginIndex = endIndex;
	           answer[index++] = str;
	      } // while
	        
	        return answer;
	    }
	    */
	
} // class
