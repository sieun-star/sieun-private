package days02;

/**
 * @author SIEUN
 *@date2024. 1. 2. - 오전 10:27:13
 *@subject 두 기억공간의 값을 바꾸기(암기,,, 시험)
 *@content
 */
public class Ex02_03 {

	
	public static void main(String[] args) {
	    /*
		int x = 10; 
		int y = 20;
		*/

		// 콤마(,) 연산자
		int x =10, y =20;
		
		System.out.printf("교환 전 > x=%d, y=%d\n", x, y);
		
		//[작업]
		//프로그램 상에서 두 기억공간의 값을 교환하려면 반드시 동일한 자료형의 임시기억공간이 필요하다.
   {	
		int temp = x;
		x = y;
		y = temp;
   } // 이 안에서만 사용하고 다음 코딩에서 사용하지 않기 위해 괄호 써준다
		
		
		System.out.printf("교환 후 > x=%d, y=%d\n", x, y);
		
		
		
		
		
		
		/*
		int a = 100;
		int b = 100;
		int c = 100;
		*/
		//int a =100, b =100, c =100;
		/*
		int a, b,c;
		//          <- (처리되는 방향)
		a = b = c = 100;
		*/
		
		
		
	} //main

} //class
