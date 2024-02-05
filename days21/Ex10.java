package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author SIEUN
 *@date2024. 1. 29. - 오후 12:41:13
 *@subject
 *@content
 */
public class Ex10 {

	public static void main(String[] args) {
		// DateTimeFormatter 형식화 클래스
		
		// [2] 날자문자열 -> 파싱 -> 핵심클래스 변환
		String source = "2023년 08월 10일 (목)";
		
		String pattern = "yyyy년 MM월 dd일 (E)";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(source, formatter);
		
		System.out.println(d);
		
		
		/* [1] //            <-  포맷  <-
		LocalDateTime dt = LocalDateTime.now();
		//2024-01-29T14:03:21.769665400
		System.out.println(dt);
		
		//
		String pattern = "yyyy/MM/dd E hh:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		String output = dtf.format(dt);
		
		System.out.println(output);
        */
		
	} // main

} // class
