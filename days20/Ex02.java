package days20;

import java.util.Date;

/**
 * @author SIEUN
 *@date2024. 1. 26. - 오전 10:28:51
 *@subject
 *@content
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		설문조사 기간이 
		시작일  2024.1.20  00:00:00
		종료일  2024.1.26  00:00:00
		일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.
		 */
		/*
		Date t = new Date();
		// 2024. 1. 26. 오전 10:30:18
		System.out.println(t.toLocaleString());
		 */

		/*
		 *  //    오늘날짜 >= 시작일  &&  오늘날짜 <= 종료일    설문가능
         if(today.getTime() >= startedDay.getTime() && today.getTime() <= endedDay.getTime())
		 * 
		// 오늘날짜 > 시작일 && 오늘날짜 < 종료일       설문가능
		Date startedDay = new Date(2024-1900, 1-1, 20);
		Date endedDay  = new Date(2024-1900, 1-1, 26);
		Date today = new Date();

		if (today.after(startedDay)&&today.before(endedDay) ) {
			System.out.println("오늘은 설문이 가능한 날입니다.");
		} else {
			System.out.println("오늘은 설문이 불가능한 날입니다.");
		}
		 */

		Date a  = new Date(2024-1900, 1-1, 26);
		Date b = new Date(2024-1900, 1-1, 26);

		System.out.println(a.after(b));        // 큰것만 표시 >
		System.out.println(b.after(a));        // 작은것만 표시 <
		System.out.println(a.equals(b));   
		System.out.println(a.compareTo(b));   



	} // main

} // class
