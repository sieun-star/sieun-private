package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author SIEUN
 *@date2024. 1. 29. - 오전 11:09:40
 *@subject
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {
		// String  불변 
		/*
		String a  = "xyz";
		a.replace('y', '와');
		System.out.println(a);  // "xyz"
		*/
		/*
		// j.t 핵심클래스도 불변
		LocalDate ld = LocalDate.now();
		System.out.println(ld);  // 2024-01-29
		
		// 날짜, 시간 수정 - with(), plus(), minus(), roll(), add()
		ld = ld.withYear(2020);
		ld = ld.with(ChronoField.YEAR, 2000);
		
		ld = ld.withMonth(5);
		ld = ld.with(ChronoField.MONTH_OF_YEAR,10);
		
		ld = ld.withDayOfMonth(15);
		ld = ld.with(ChronoField.DAY_OF_MONTH,20);
		System.out.println(ld);
		*/
		
		/*
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);  // 2024-01-29T11:18:10.667726
		
		dt = dt.plusMonths(1);
		System.out.println(dt);
		
		dt = dt.minusMonths(3);
		System.out.println(dt);
		// plus(필드, 값);
		// plusXXX();
		*/
		
		LocalTime t = LocalTime.now();
		System.out.println(t);  //11:22:29.752157400
		// 끝을 잘라내다.( 절삭하다 )
		// t = t.truncatedTo(ChronoUnit.HOURS);  // 시간 보다 작은 단위는 모두 0으로 처리. 11:00
		t = t.truncatedTo(ChronoUnit.MINUTES);  // 분 보다 작은 단위는 모두 0으로 처리 . 11:25
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		dt = dt.truncatedTo(ChronoUnit.DAYS); // 시간, 분, 초 , 나노초 절삭 2024-01-29T00:00
		System.out.println(dt);
		
		
		
		
	} // main

} // class





