package days22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오전 9:06:44
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
	/*
	2. 현재 날짜와 시간 정보를   LocalDateTime 클래스를 사용해서 
	     아래와 같은 형식으로 출력하세요 . 
	  [출력형식]
	  2023/08/11 금요일   07:02:32.259
	
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		String pattern = "yyyy/MM/dd E요일   hh:mm:ss.SSS";
		// 형식화 클래스
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern(pattern);
		String result = fomatter.format(dt);
		System.out.println(result);
	*/
		
		// 2-2. String s = "2023.08.11 (금)" 문자열을 LocalDate 클래스로 변환시키세요.
		/*
		String s =  "2023.08.11 (금)";
		
		String pattern =  "yyy.MM.dd (E)";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(s, formatter);
		System.out.println(d);  // 2023-08-11
		*/
		
		//3-2. ArrayList 컬렉션 클래스를 사용해서
		/*
		ArrayList team1 = new ArrayList();
		team1.add("홍길동");
		team1.add("김길동");
		team1.add(1,"박길동");
		System.out.println(team1);
		
		Iterator ir = team1.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println(team1.size());
		
		team1.get(1); team1.set(1, "다른이름");
		
		int index = team1.indexOf("홍길동");
		team1.remove(index);
		
		team1.removeIf(n ->((String)n).charAt(0)=='이');
        */
		
		// 4. java.time.LocalDateTime 클래스 사용
		//   1) 설문 시작일 : 23.8.10   9:00:00
		//   2) 설문 종료일 : 23.8.15  18:00:00 
		//   지금 현재 설문 가능여부에 대해서 출력하세요.  ( 가능, 불가능 )
		/*
		LocalDateTime s = LocalDateTime.of(2023, 8,10,9,0,0);
		LocalDateTime e = LocalDateTime.of(2023, 8,15,18,0,0);
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now.isBefore(e));
		System.out.println(now.isAfter(s));
		
		if (now.isBefore(s)|| now.isAfter(e)) // 설문불가능
		else {                                       } // 설문가능	
		*/
		
	
		
		
		
		
		
		
	} // main

} // class





