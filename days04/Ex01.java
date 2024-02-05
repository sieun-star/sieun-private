package days04;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오전 9:45:15
 *@subject    문자열 비교
 *@content    == X
 *                  이름입력받아서 비교 예제
 */
public class Ex01 {

	public static void main(String[] args) {
		// 숫자(정수, 실수) == 
		// 문자              ==
		// 불린              ==
		// (암기) 문자열 같냐?      ??
		/*
		String name1 = "홍길동";
		Scanner scanner = new Scanner(System.in);
		System.out.print(">이름 입력?");
		// Duplicate local variable name name 지역변수 중복
		String name2 = scanner.next(); // nextXXX() 한문자 입력받는 nextChar() 는 없다!
		
		//문자열 비교 : == 연산자 사용
	    //System.out.println( name1 == name2 ); //fasle
		
		//문자열 비교 : string.equals() 메서드 사용 [암기]
		System.out.println( name1.equals(name2));
		*/
	    /*
		String msg1 = "kenik", msg2 = "KenIk";
		System.out.println(msg1.equals(msg2)); //false
		//대소문자를 구분하지 않고 문자열이 같냐? String.equalsIgnoreCase()
		System.out.println(msg1.equalsIgnoreCase(msg2)); // true
		*/
		
		
		/*
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println( name1 == name2); // true
		*/
		
		
		
		/*8번
		 *[입력형식]  
          > 실수 입력 ? 123.2312312
           [출력형식]
          > 결과 : 123.23	
		 */
		 //double x;
		 //Resource leak: 'scanner' is never closed
		 //리소스(자원) 누출 : scanner 닫혀 있지 않다.
		 //Scanner scanner = new Scanner(System.in);
		 //System.out.print("> 실수 입력 ?");
		 //x = scanner.nextDouble();
		 //System.out.printf("> 결과 : %.2f\n", x);
		 
		 //scanner.close();

		/*7번
		 * 두 정수 x,y 를  Scanner로 입력받아서 
            두 정수 중에 큰 값을 max  라는 변수에 저장해서 출력하세요.
	        ( 삼항 연산자 ?: 사용 )
		 */
		
		 // int x, y;
		  //Scanner scanner = new Scanner(System.in);
		  //System.out.print("> x_y 입력?");
		  //x = scanner.nextInt();
		  //y = scanner.nextInt();
		  //int max = x > y?  x : y ;
		  //System.out.printf("> x=%d, y=%d, max=%d\n", x, y, max);
		
		




	} //main

}  //class
