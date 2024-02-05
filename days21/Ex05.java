package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author SIEUN
 *@date2024. 1. 29. - 오전 11:27:33
 *@subject
 *@content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 날짜, 시간의 비교 isAfter(), isBefore(), isEqual()
		// 홍길동의 생일 1999. 1. 20
		// 올해 홍길동의 생일이 지났는지? 지나지 않았는지? 오늘인지. 체크
		
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1999, 1, 20);
		birth= birth.withYear(today.getYear());
		System.out.println(today.isAfter(birth));  // 생일이 지남
		System.out.println(today.isBefore(birth)); // 생일이 지남
		System.out.println(today.isEqual(birth));  // 생일이 아님
		
		// 0 양수 음수
		System.out.println(today.compareTo(birth));  // 9 -> 생일이 9일 지남
		
		if (today.isAfter(birth)) {
			System.out.println("생일이 지났다");
		}else if (today.isBefore(birth)) {
			System.out.println("생일이 지나지 않았다");
		}else {
			System.out.println("오늘이 생일이다.");
		}
		

	} // main

} // class
