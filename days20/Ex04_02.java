package days20;

import java.util.Calendar;
import java.util.Date;

/**
 * @author SIEUN
 *@date2024. 1. 26. - 오전 11:43:17
 *@subject
 *@content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// Calendar - getTime(), setTime() 메서드
		
		// 1. Calendar -> Date 변환
		Calendar c= Calendar.getInstance();
		// Date d = ???;
		Date d =c.getTime();
		
	    // 2. Date -> Calendar 변환 
		Date n = new Date();
		c.setTime(n);
		
		

	} // main

} // class
