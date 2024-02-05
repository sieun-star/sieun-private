package days06;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오전 10:20:34
 *@subject        Character.isDigit, Character.isAlphabetic
 *@content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		char one = '8';
		System.out.println(Character.isDigit(one)); // 숫자인지 아닌지 true/false 값
		if (Character.isDigit(one)) {
			System.out.println("숫자 O");
		} else {
			System.out.println("숫자 X");
			
		}
		
		one = 'A';
		one = 'a';
		one = '9';
		one = '한';
		
		System.out.println(Character.isAlphabetic(one)); // 문자인지 아닌지  true/false 값
			
				
		
		
		

	} // main

} // class
