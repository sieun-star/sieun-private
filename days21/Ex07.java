package days21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * @author SIEUN
 *@date2024. 1. 29. - 오전 11:46:40
 *@subject
 *@content
 */
public class Ex07 {

	public static void main(String[] args) {
		String source = "2009년 12월 30일";
		// java.time.format.DateTimeParseException: Text '2009년 12월 30일' could not be parsed at index 4
		// String source = "2009.12.30";
		// String source = "2009/12/30";
		// String source = "2009-12-30";
		// 날짜형식의 String -> LocalDate 타입 변환.
		// 1) SDF.parse()
		
		/*
		// LocalDate d = LocalDate.parse(source);
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(source, dtf);
		System.out.println(d);
		*/
		
		// 이번 달의 마지막 날짜 몇 일까지?
		// Date, Calendar
		// [ LocalDate ]
		/* [1]
		LocalDate d = LocalDate.now();
		System.out.println(d); // 2024-01-29
		
		d = d.withDayOfMonth(1);
		System.out.println(d); // 2024-01-01
		d = d.plusMonths(1);
		System.out.println(d); // 2024-02-01
		d = d.minusDays(1);
		System.out.println(d); // 2024-01-31
		System.out.println(d.getDayOfMonth()); // 31
		*/
		
		// [2]
		/*
		LocalDate d = LocalDate.now();
		System.out.println(d.lengthOfMonth());  // 31
		d = d.plusMonths(1);
		System.out.println(d.lengthOfMonth());  // 29
		*/
		
		// [3]
		LocalDate d = LocalDate.now();
		LocalDate lastday = d.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastday);  // 
		// Temporal + Adjuster
		//   시간상의        조정자
		
		// [ TemporalAdjuster ]
		// 날짜, 시간을 수정할 때 with(), plus(), minus()
		// 다음 달 첫 째주 화요일날 모임...
		// 다음 달 마지막 주 토요일날 모임...
		// 자주 사용되는 날짜 계산들을 대신해 주는 메서드를 미리 정의해 놓은 클래스 : TemporalAdjusters 클래스
		// 
		

	} // main

} // class







