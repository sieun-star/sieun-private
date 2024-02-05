package days19;

import java.util.Date;

public class Ex12 {

	public static void main(String[] args) {
  
		int year = 2024;
		int month = 1;
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month, 1);

		Date start = new Date(year-1900, month -1, 1);
		start.setDate(start.getDate()-dayOfWeek);
		
		for (int i = 0; i < 42; i++) {
			if (start.getMonth() == month -1) {
				System.out.printf("[%02d]\t",start.getDate());
			}else {
				System.out.printf("%02d\t",start.getDate());
			}start.setDate(start.getDate()+1);
			if (i%7==6) System.out.println();
		}
		
	} // main

	private static int getDayOfWeek(int year, int month, int i) {
		Date d = new Date(year -1900, month, 1);
		int date = d.getDate() -1;
		d.setDate(date);
		
		return d.getDate();
	}

	private static int getLastDay(int year, int month) {
		Date d = new Date(year -1900, month -1, 1);
		return d.getDay();
	}

} // class
