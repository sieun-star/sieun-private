package days09;

import java.util.Calendar;
import java.util.Date;

/**
 * @author SIEUN
 *@date2024. 1. 11. - 오후 12:09:49
 *@subject   (만 나이 시험)
 *@content
 */
public class Ex07_02 {

	public static void main(String[] args) {

		// [주민등록번호] 
		// 住民登錄番號 / Resident registration number, RRN
		// 1. 생년월일 
		// 2. 성별
		// 3. 내국인/외국인
		// 4. 출신지역
		// 5. 나이
		// 6. 검증

		String rrn = "990123-1700001";


		// 주민등록번호 -> 나이
		/*
		 *                     2022.12.31    23.1.1    23.12.31    24.1.1
		 * 
		 * 1) 한국식 나이          1살            2살           2살           3살
		 *       ㄴ 한국식 나이 = 연 나이 + 1  
		 * 2) 연 나이              0살            1살            1살           2살
		 *       ㄴ 연 나이 = (2024)-출생년도(2022) = 2
		 * 3) 만 나이               0살            0살           1살           1살 
		 * 
		 */
		String birthday = getBirth(rrn);
		System.out.println(birthday);


		int yearAge = getYearAge(rrn);
		int koreaAge = getKoreaAge(rrn);
		int americanAge = getAmericanAge(rrn);
		System.out.printf("%s - 연나이:%d살, 한국식나이 :%d살, 만나이 :%d살\n",rrn, yearAge, koreaAge, americanAge);


	} // main

	// 한국식 나이 = 연 나이 + 1
	private static int getKoreaAge(String rrn) {
		return getYearAge(rrn)+1;
	}

	// 연 나이 = 올해년도 + 출생년도
	private static int getYearAge(String rrn) {
		int birthYear;  // 출생년도
		int thisYear;   // 올해년도

		/* [1] Date 날짜, 시간 클래스 사용하여 올해년도 가져오기
        Date d = new Date();
        thisYear = d.getYear() + 1900;
		 */

		// [2] Calendar 날짜, 시간 클래스 사용하여 올해년도 가져오기
		Calendar c = Calendar.getInstance();
		thisYear= c.get(Calendar.YEAR);

		// System.out.println(thisYear);

		// 출생년도
		birthYear = Integer.parseInt(rrn.substring(0, 2));
		int gender = getGender(rrn);

		switch (gender) {
		case 9:case 0:
			birthYear += 1800;
			break;
		case 1:case 2:case 5:case 6:
			birthYear += 1900;
			break;
		case 3:case 4:case 7:case 8:
			birthYear += 2000;
			break;
		}
		return thisYear - birthYear;
	}


	// 만 나이
	private static int getAmericanAge(String rrn) {
		// 출생일 : 2023.10.09
		// 오늘일 : 2024.  1.11
		// 만나이 : 0
		//          =올해년도(2024)-출생년도(2023)
		//          =1 - 1 (생일이 지나지 않으면 1살을 뺀다)
		//          =0
		
		int americanAge = getYearAge(rrn);
		
		
		Calendar c = Calendar.getInstance();
		int thisMM =c.get(Calendar.MONTH)+1;
		int thisDD = c.get(Calendar.DATE);
		int birthMM = Integer.parseInt(rrn.substring(2, 4));
		int birthDD= Integer.parseInt(rrn.substring(4, 6));

		if (!(thisMM>=birthMM && thisDD>=birthDD)) {
			americanAge--;
		}
		return americanAge;

	}




	private static int getGender(String rrn) {
		return rrn.charAt(7) - 48;  // int 1 값	
	}

	private static String getBirth(String rrn) {

		int year = Integer.parseInt(rrn.substring(0, 2));
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));

		int gender = getGender(rrn);

		switch (gender) {
		case 9:case 0:
			year += 1800;
			break;
		case 1:case 2:case 5:case 6:
			year += 1900;
			break;
		case 3:case 4:case 7:case 8:
			year += 2000;
			break;
		}


		String birthday = String.format("%d년 %d월 %d일", year, month, day);


		return birthday;
	}

} // class
