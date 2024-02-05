package days06;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오전 10:35:27
 *@subject  -시험(암기)
 *@content
 */
public class Ex01_04 {

	public static void main(String[] args) {
		char one = '#';
		String strCheck = "#$!@";
		
		//                            정규표현식
		//boolean String.mathes(regex)
		
		// String regex = "one == '#' || one == '@' || one == '$' || one == '!'";
		// 숫자 \d{1,3} == [0-9]{1,3}
		// [0-9] ==[123456789]
		// [A-Za-z0-0]
		// [aeiouAEIOU]  알파벳 모음인지 물어보는 정규표현식
		
		String regex ="[#@$!]";
		if ((one+"").matches(regex)) { // char + "" -> String
			System.out.println("특수문자 O");
		}else {
			System.out.println("특수문자 X");
		}
		
		
	} // main

} // class
