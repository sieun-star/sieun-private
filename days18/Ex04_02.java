package days18;

import java.util.Arrays;

/**
 * @author SIEUN
 *@date2024. 1. 24. - 오후 2:05:37
 *@subject
 *@content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// String todo="TODO Auto-generated method Auto stub";
		
		
		// System.out.println(todo.codePointAt(0)); 코드값
		// boolean  todo.equals("");
		// int     todo.compareTo("");     0 양수 음수
		// int todo.compareToIgnoreCase(""); 0 양수 음수 (대소문자 구분 없이 비교)
		/*
		System.out.println("ABC".compareToIgnoreCase("AbC")); //   0  대소문자 구분 없기 때문에 같다!
		System.out.println("ABC".compareTo("AcC")); // -33      코드값의 차이만큼!
		System.out.println("CBC".compareTo("AcC")); // -2
		*/
		/*
		// boolean   todo.endsWith(suffix);   // 접미사   문자열로 끝나는지
		// boolean   todo.startsWith(prefix); // 접두사    문자열로 시작하는지
		
		String url = "https://www.naver.com";
		System.out.println(url.startsWith("https://"));
		System.out.println(url.endsWith(".com"));
		*/
		/*
		// [문제]
		String directory = "C:\\spring\\src";
		String fileName = "Sample.java";
		
		// char 마지막한문자 = directory.charAt(directory.length()-1);
		// if(마지막한문자=='\')
		
		// String path = directory + fileName;
		// String path = directory +"\\"+ fileName;
		String path = directory+(directory.endsWith("\\")? "" : "\\")+fileName;
		
		// C:\spring\src\Sample.java
		System.out.println(path);
		*/
		
		// boolean      todo.equals(todo);
		// boolean      todo.equalsIgnoreCase(todo);
		
		// byte [] todoByteArray = todo.getBytes();
		// System.out.println(Arrays.toString(todoByteArray));
		
		// todo.indexOf(0);       앞에서 부터 찾아서 찾은 인덱스값을 반환
		// todo.lastIndexOf(0); 뒤에서 부터 찾아서 찾은 인덱스값을 반환
		// System.out.println(todo.indexOf("Auto"));          // 5
		// System.out.println(todo.lastIndexOf("Auto"));     // 27    Auto 가 하나라면 똑같은 위치값이 찍힌다.
		
		// todo.matches(regex);
		
		// ------------------------------
		// System.out.println(  "-".repeat(30) );    반복
		
		String todo="TODO Auto-generated all method Alert stub";
		
		// char [] -> String
		char [] m = {'a','2','x'};
		String s = new String(m);
		
		// String.valueOf()  각 자료형의값을 문자열(String) 변환하는 메서드
		// 3.14 + ""
		// true + ""
		// 100 + ""
		/*
		char [] m = {'a','2','x'};
		String s =String.valueOf(m);
		System.out.println(s); // "a2x"
		*/
		
		// String.format("")
		// System.out.println("<ul><li>"+String.join("</li><li>", "권맑음","구본혁","한재호")+"</li></ul>");
		
		// todo auto-generated all method alert stub
		// System.out.println(todo.toLowerCase());
		// TODO AUTO-GENERATED ALL METHOD ALERT STUB
		// System.out.println(todo.toUpperCase());
		
		// System.out.println(todo.toString());
		
		// String -> byte[]  getByte()
		// String -> char[]  toCharArray()
		// char [] todoCharArr = todo.toCharArray();
		
		/*
		System.out.println( todo.replace('e', '*') );
		System.out.println( todo.replace("method", "방법") );
		//                                                regex 정규표현식
		System.out.println( todo.replaceAll("[Aa]\\.*", "*") );    
		System.out.println( todo.replaceFirst("[Aa]\\.*", "*") );    // 정규표현식을 만족하는 첫번째만 
		*/
	
		/*
		String regex = " ";
		// String [] todoArr = todo.split(regex);  
		String [] todoArr = todo.split(regex, 3);  // limit 3 
		System.out.println(Arrays.toString(todoArr));
		*/
		
		/*
		// todo.strip();             // trim()  앞 뒤 공백 제거
		// todo.stripLeading();  // 앞 공백 제거
		// todo.stripTrailing();   // 뒤 공백 제거
		System.out.println("["+"    홍길동   ".trim()+"]");
		System.out.println("["+"    홍길동   ".strip()+"]");
		System.out.println("["+"    홍길동   ".stripLeading()+"]");
		System.out.println("["+"    홍길동   ".stripTrailing()+"]");
		*/
		
		// todo.substring(0);
		// todo.substring(0, 0);
		
		// todo.subSequence(beginIndex, endIndex)
		// 1) 기능
		// 2) 차이점: 리턴자료형 CharSequence
		// System.out.println(todo.substring(2, 7)); // 2번째부터 7번째 앞까지 짜르기  DO Au 리턴자료형 String
		// System.out.println(todo.subSequence(2, 7)); //  2번째부터 7번째 앞까지 짜르기 리턴자료형 CharSequence
		

	} // main

} // class
