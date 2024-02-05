package days20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author SIEUN
 *@date2024. 1. 26. - 오후 12:19:32
 *@subject     days19.Ex11_03.java Date클래스 사용해서 달력 그리기
 *@content                                   Calendar
 * 사용해서 달력 그리기
 */
public class Ex05 {

	public static void main(String[] args) {


		int year = 2024;
		int month = 1;

		// int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year,month,1);  // 1(월요일)

		Calendar start = new GregorianCalendar(year, month-1, 1);
		//String s = Ex04.getFormatDate(start, "yyyy-MM-dd HH:mm:ss.SSS");
	    //s = s.substring(0, 10);


		start.add(Calendar.DATE, -dayOfWeek);

		Calendar today = Calendar.getInstance();
		//String t = Ex04.getFormatDate(today, "yyyy-MM-dd HH:mm:ss.SSS");      
	    //t = t.substring(0, 10); // yyyy-MM-dd

        today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);
		
		for (int i = 0; i <42; i++) {

			if (start.get(Calendar.MONTH)+1==month) {
				if (today.equals(start)) {
					System.out.print("*");
				}
				System.out.printf("[%02d]\t", start.get(Calendar.DATE));
			} else {
				System.out.printf("%02d\t", start.get(Calendar.DATE));
			}
			start.add(Calendar.DATE, 1);
			if (i%7==6) System.out.println();
		}

	} // main

	private static int getLastDay(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1, 1);
		return c.getActualMaximum(Calendar.DATE);  
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Calendar c = new GregorianCalendar(year, month-1, date);
		return c.get(Calendar.DAY_OF_WEEK)-1;  // 1(일) ~ 7(토)

	}

} // class
