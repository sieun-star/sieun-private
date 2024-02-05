package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author SIEUN
 *@date2024. 1. 26. - 오전 11:31:31
 *@subject
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 수료일이 무슨 요일?
		// Date endDay = new Date(2024-1900, 6-1, 14, 18,0,0); 
		Calendar c = Calendar.getInstance();
		//새로운 날짜로 설정 : set(field, value)
		c.set(Calendar.YEAR, 2024);
		c.set(Calendar.MONTH, 6-1);
		c.set(Calendar.DATE, 14);
		c.set(Calendar.HOUR_OF_DAY, 18);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		
		/*
		// [암기]-시험 형식화 클래스  Date, Calendar
		// "2015. 5. 1 오전 9:11:12"
		String pattern = "yyyy. MM. E dd a hh:mm:ss.SSS";
		// java.lang.IllegalArgumentException: Illegal pattern character 'A'
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// Calendar -> Date 변화
		Date d = c.getTime();
		// Date -> Calendar 변환 
		String strDF = sdf.format(d);
		System.out.println(strDF);
		*/
		String pattern = "yyyy. MM. E dd a hh:mm:ss.SSS";
		System.out.println(getFormatDate(c, pattern));
		

	} // main

	public static String getFormatDate(Object o, String pattern) {
	
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		if (o instanceof Date) {
			Date d = (Date)o;
			return  sdf.format(d);
		}else if (o instanceof Calendar) {
			Calendar c = (Calendar)o;
			Date d= c.getTime();
			return  sdf.format(d);
		}
		
		return null;
	}
	
	
	/*
	public static String getFormatDate(Date d, String pattern) {
		return null;
	}
	
    public static String getFormatDate(Calendar c, String pattern) {
	return null;
	}
	*/
		
	
} // class
