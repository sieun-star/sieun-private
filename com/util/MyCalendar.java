package com.util;

/**
 * @author SIEUN
 *@date2024. 1. 10. - 오전 11:33:06
 *@subject
 *@content
 */
public class MyCalendar {
   
	//평년 false 반환
	//윤년 true 반환
	public static boolean isLeapYear(int year) {
		boolean result = false; 
        if (year%4==0 && year%100!=0 || year%400==0) {
			result = true;
		}
		return result;
	}
	
	
	/*
	public static String isLeapYear(int year) {
		String result = "평년";

		if (year%4==0 && year%100!=0 || year%400==0) {
			result = "윤년";
		}
		return result;
	}
	*/
} 