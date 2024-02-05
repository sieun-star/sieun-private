package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SIEUN
 *@date2024. 1. 25. - 오후 3:46:02
 *@subject
 *@content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 정규표현식(regular Expression == regex) == 정규식
		// - 문자열 속에 원하는 조건(패턴)과 일치하는 문자열을 찾기 위해서 사용된다.
		// - 미리 정의된 기호
		// - java.util.regex 패키지
		//       ㄴ Pattern 클래스    
		//       ㄴ Matcher 클래스
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
				               , "combat", "count", "date", "disc", "fx"};
		// 1) c로 시작하는 모든 문자(data)를 출력.
		/*
		for (int i = 0; i < data.length; i++) {
		    if(data[i].startsWith("c")) {
		    	System.out.println(data[i]);
		    }
		}
        */
		/*
		// String.matches() 메서드
		String regex ="c.*";
		for (int i = 0; i < data.length; i++) {
			if(data[i].matches(regex)) System.out.println(data[i]);
		}
       */
		
		String regex ="c.*";
		regex ="c[a-zA-Z]*";
		regex ="c[a-zA-Z0-9]*";
		regex ="c\\w*";    // [a-zA-Z0-9] == \\w
		regex ="c.";
		regex ="c\\.";
		regex ="c[0-9]";  // [0-9] == \\d   0~9까지
		regex ="c\\d";
		regex ="c.*t";  // c로 시작하고 t로 끝나는데 안에는 어떤문자라도 0개 이상
		regex ="c[^0-9]";  // 두번째는 숫자가 오면 안된다.
		regex ="c\\D";         // [^0-9] == \\D
		regex ="(b|c).{2}";  // 첫문자는 b또는 c이고 뒤에 아무글자 2개가 와야함
		regex ="[bc].{2}";   // 위에꺼랑 똑같음
		regex ="[bcd].{2,3}";  // b,c,d 중에 하나가 첫글자로 오고 뒤에는 2,3개의 글자 아무거나
		regex ="[b-d].{2,3}";   // 위에꺼랑 똑같음
		// bcd 문자는 제외한 알파벳 대소문자
		regex ="[A-Za-z && [^b-d]].*";   // * -> 0개 이상
		regex ="[A-Za-z && [^b-d]].+";  // + -> 1개 이상
		regex ="[A-Za-z && [^b-d]].?";   // ? -> 한문자가 와도 되고 안와도 되고 0,1
		
		Pattern p =Pattern.compile(regex);
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if (m.matches()) {
				System.out.println(data[i]);
			}
		}
		
		
		
		
		

	} // main

} // class
