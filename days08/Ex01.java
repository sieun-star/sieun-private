package days08;

import com.util.Draw2D;

/**
 * @author SIEUN
 *@date2024. 1. 10. - 오전 10:12:19
 *@subject  7일차 복습 문제
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// 선긋기
		// com.util.Draw2D.drawLine();
		
		Draw2D.drawLine();
		

	} // main
	//1) 0~100 사이의  점수를 키보드로 부터 입력받아서 유효성 검사를 한 점수를 반환하는 함수 선언
    /*
	public static int getScore() {
		Scanner scanner = new Scanner(System.in);
		String strScore = scanner.next();
		// 정규표현식 유효성 검사 체크
		int score = Integer.parseInt(strScore);
		return score;
	}
	*/
	//2) 점수를 매개변수로 받아서 수우미양가 문자를 반환하는 함수 선언
	/*
	public static char getGrade(int score) {
		
		// if , switch
	    char grade = '수';
		return grade;
	}
	*/
	
	//3) 정수를 가변 매개변수(인자)로 받아서 합을 반환하는 함수 선언
    /*
	public static int sum(int...args) {
		// int [] args -> 람다스트림 변환
		//                    IntStrem of(배열)
		return IntStream.of(args).sum();
	}
	*/
	
	 //4) 한 문자를 매개변수로 받아서 대문자로 바꿔서 반환하는 함수 선언
	/*
	public static char toUpperCase(char one) {
		if (Character.isLowerCase(one)) {
		return Character.toUpperCase(one);	// return (char)(one - 32);
		}
		return one;
	}
	*/
	
	
	
	
	
	
	
	
	
} // class
