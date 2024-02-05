package days03;

/**
 * @author SIEUN
 *@date2024. 1. 3. - 오후 3:50:32
 *@subject
 *@content
 */
public class Ex06_02 {

	public static void main(String[] args) {
	   // 증감연산자      ++  --
	   // 복합대입연산자  +=  -=
	   
		
		int x = 10;
		/*
		 x++;  후위형 증감연산자
		++x;   //전위형 증감연산자

		System.out.printf("> x=%d\n", x);
		*/
		
		
		int y = x++;  // 후위형
		//int y = ++x;   //전위형
		
		
		System.out.printf("> x=%d, y=%d\n", x, y);
		
		
		int n = 100;
		System.out.println( ++n == 100); // false  101==100
		// System.out.println( n++ == 100); true  (후위형이기 때문에 증가하기 전 값인 100과 비교함으로 true) 100==100
		
		System.out.println(n); //101
		
		

	} // main

} // class
