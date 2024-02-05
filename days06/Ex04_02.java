package days06;

import java.util.Iterator;

/**
 * @author SIEUN
 *@date2024. 1. 8. - 오후 2:43:27
 *@subject
 *@content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		//4. 알파벳(대,소문자) 코드 및 문자를 출력하는  코딩을 하세요. ( 조건 : 한 라인에 10개씩 출력 )
		
		// Z(090) 91~96 a(097)
		
		for (int i = 'A' , count =1, lineNumber = 1; i <= 'z'; i++) {
			// if (i>'Z' && i<'a') continue;
			if (Character.isAlphabetic(i)) {
				if(count%10==1) System.out.printf("%d : ", lineNumber++);
				System.out.printf("%c(%03d)",(char)i,i );
			   
				/*
				if (Character.isUpperCase(i)) { // 대문자
					if (i%10==4) System.out.println();
					
				} else { // 소문자
					if (i%10==0) System.out.println();
				}
				*/
				
		        if (count%10==0) System.out.println();
			    count++;
			}		
		}
			
			

			
	} // main

} // class
