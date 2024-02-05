package days11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 15. - 오전 8:42:20
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		1. 년도와 월을 입력하여 달력출력하는 코딩을 하세요 .
		
		*/
		int year = 2020;
		int month = 5;
		
		int dayOfWeek = getDayOfWeek(year,month,1);
		int lastDay = getLastDay(year,month);
	
		
		
	} // main

	private static int getLastDay(int year, int month) {
		// Date, Calendar  클래스 - 날짜, 시간
		LocalDate d =LocalDate.of(year, month, 1); // 2020-05-01
		LocalDate ld = d.withDayOfMonth(d.lengthOfMonth()); // 2020-05-31
		int lastDay = ld.getDayOfMonth(); // 31
		System.out.println(lastDay);
		
		return lastDay;
	}

	private static int getDayOfWeek(int year, int month, int i) {
		LocalDate d =LocalDate.of(year, month, 1);
		DayOfWeek w= d.getDayOfWeek(); // 영어 요일 Friday
	
		return w.getValue(); // 숫자로 표시
	}

	// 총날짜수를 반환하는 함수
	private static int getTotalDays ( int year, int month, int day) {
		LocalDate startDate = LocalDate.parse("0001-01-01");
		LocalDate endDate = LocalDate.of(year, month, day);
		return (int)(startDate.until(endDate, ChronoUnit.DAYS))+1;
	}

	
	
	
} // calss