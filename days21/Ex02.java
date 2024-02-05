package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author SIEUN
 *@date2024. 1. 29. - 오전 10:23:12
 *@subject
 *@content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [j.t 핵심클래스]
		// now() 메서드 사용
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());  // "2024-01-29"
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt); // 10:26:34.640067700
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2024-01-29T10:27:41.575501600
		
		// of() 메서드
		ld = LocalDate.of(2023, 12, 29);
		System.out.println(ld);
		
		lt = LocalTime.of(14, 20,11);
		System.out.println(lt);
		
		ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt); // 2023-12-29T14:20:11

	} // main

} // class

















