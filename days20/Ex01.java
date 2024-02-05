package days20;

import java.util.Date;

/**
 * @author SIEUN
 *@date2024. 1. 26. - 오전 8:59:59
 *@subject     [시험]
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 4. 개강일(2023.12.29. 9:00:00)로 부터 오늘까지 지난 일수 계산을 하세요.
		// 총날짜수 메서드
		
		// [시험1] 
		   // 수료일(D-Day) 까지 남은 시간 출력 메서드 
		  
		
		/*
		// [2]
		Date o = new Date(2023-1900,12-1,29,9,0,0);
		// 1970년 1.1 00:00:00.000 
		// 1703808000000ms
		System.out.println(o.getTime());
		
		Date t = new Date();
		// 1706231638132ms
		System.out.println(t.getTime());
		
		long diff = t.getTime() - o.getTime();
		// 2423682251 지나간 밀리초
		*/	
		
		/*
		System.out.println(diff + "ms");
		System.out.println(diff/1000 + "s");
		System.out.println(diff/(1000*60) + "m");
		System.out.println(diff/(1000*60*60) + "h");
		System.out.println(diff/(1000*60*60*24) + "d");
	    */
		/* [1]
		// 738855
		System.out.println(days10.Ex02.getTotalDays(2023, 12, 29));
		// 738886
		System.out.println(days10.Ex02.getTotalDays(2024, 1, 26));
		
		System.out.println(738886 - 738855);
		*/
	}// main
	
	
	 private static void d_day() {
	      Date endDay = new Date(2024-1900, 6-1, 14, 18,0,0); 
	      Date today = new Date();
	      long diff =  endDay.getTime() - today.getTime(); 
	      long 몫 = diff / (1000*60*60*24);
	      System.out.print( 몫 +"d ");
	      diff %= (1000*60*60*24); 
	      
	      몫 = diff /  (1000*60*60);
	      System.out.print( 몫 +"h:");
	      diff %= (1000*60*60); 
	      
	      몫 = diff /  (1000*60);
	      System.out.print( 몫 +"m:");
	      diff %= (1000*60); 
	      
	      몫 = diff /  (1000);
	      System.out.print( 몫 +"s.");
	      diff %= (1000); 
	      
	      System.out.println( diff +"ms");
	      
	      try {
	         System.out.println("\n\n\n\n");
	         Thread.sleep(10);
	         d_day();
	         
	      } catch (InterruptedException e) { 
	         e.printStackTrace();
	      }
	   }
	
	
} // class
