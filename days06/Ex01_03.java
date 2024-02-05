package days06;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오전 10:35:27
 *@subject  -시험(암기)
 *@content
 */
public class Ex01_03 {

	public static void main(String[] args) {
		char one = '#';
		String strCheck = "#$!@";
		boolean flag = false;
		
		for (int i = 0; i < strCheck.length(); i++) {
			System.out.printf("%d - '%c'\n", i , strCheck.charAt(i));	
			if (one==strCheck.charAt(i)) {
				
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("특수문자 O");
		}else {
			System.out.println("특수문자 X");
		}
		
		

	} // main

} // class
