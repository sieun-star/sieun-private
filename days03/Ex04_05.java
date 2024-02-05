package days03;

/**
 * @author SIEUN
 *@date2024. 1. 3. - 오후 2:39:26
 *@subject   비트논리연산자
 *@content  &   ^   |   ~
 */
public class Ex04_05 {

	public static void main(String[] args) {
		/*
		0000 0011
		System.out.println( 3 );
		System.out.println(Integer.toBinaryString(3));  
		String binStr = Integer.toBinaryString(3);
		System.out.printf("%08d\n",Integer.parseInt( binStr));  // "11" -> 형변환
	
		
		
		int no = 15;
		System.out.printf("%08d\n", no);
        */		
		
		//                   00000011
		System.out.println( 3 );
		//                   00000001
		System.out.println( 1 );
		
		// & 비트 논리 AND  연산자
		// 상응되는 비트값을 비교
		// 00000011
		// 00000001
		//&
		
		// 1 & 1     1
		// 1 & 0     0
		// 0 & 1     0
		// 0 & 0     0
		System.out.println(3 & 1);  // 1
		
		// 1 | 1     1
	    // 1 | 0     1
		// 0 | 1     1
		// 0 | 0     0
		System.out.println(3 | 1); // 3
		
		// ^ XOR 연산자
		//    eXclusive OR 연산자
		//    베타적인 
		// 1 ^ 1     0
	    // 1 ^ 0     1
		// 0 ^ 1     1
		// 0 ^ 0     0
		System.out.println(3 ^ 1); // 2
		
		// !   !true => false
		//     !false=> true
		
		//  ~ 틸드연산자
		// 1=>0
		// 0=>1
		System.out.println(~3); // 00000011  => 11111100
		// 11111100   2의 보수법
		//           -1
		// 11111011
		// 00000100
		//           -4
		
		
		
		

	} //main

} //class
