package days08;

import java.util.Random;

/**
 * @author SIEUN
 *@date2024. 1. 10. - 오후 3:44:12
 *@subject
 *@content
 */
public class Ex05_05 {

	public static void main(String[] args) {
	    new Random()
	               .ints(1,46)                        // 1~45정수
	               .distinct()                         // 중복제거
	               .limit(6)                           // 6개
	               .sorted()                          // 오름차순 정렬
	               .forEach(System.out :: println); //메서드 참조
	              // .forEach(n->System.out.println(n));  -> 람다 연산자
		
		
	} // main

} // class
