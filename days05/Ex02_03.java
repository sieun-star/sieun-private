package days05;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오전 11:26:59
 *@subject
 *@content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		
		
		// 함수(메서드) return문
		// 제어문        break문
		
		int kor = 98;
		
		switch (kor / 10) {
		// jdk14 부터  case10, 9 :
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			
		case 7:
			System.out.println("미");
			
		case 6:
			System.out.println("양");
		
		default:
			System.out.println("가");
		
		}

	} // main

} // class
