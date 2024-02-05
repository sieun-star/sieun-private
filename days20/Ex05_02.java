package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author SIEUN
 *@date2024. 1. 26. - 오후 12:35:38
 *@subject
 *@content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar(2024, 1-1, 1);
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd"));
		c.getActualMaximum(Calendar.DATE);
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		
		/*
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DATE, -1);
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd"));
		*/
		/*
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd")); 
		c.add(Calendar.DATE, 1);
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd")); 
		c.add(Calendar.DATE, -1);
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd")); 
		c.add(Calendar.MONTH, 1);
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd")); 
        */
	} // main

} // class
