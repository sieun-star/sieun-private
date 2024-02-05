package days05;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오후 2:42:20
 *@subject     if, switch, for, break
 *@content    [while 조건반복문 ]
 */
public class Ex07 {

	public static void main(String[] args) {
	   /*
		while (condition) {
		          //명령코딩;
	     }
	   */
		/* [1]
	   // 예) 1~0=55
		int i =1, sum =0;
		while (i<=10) {
			sum +=i;
			System.out.printf("%d+", i);
			i++;
		}
		System.out.printf("\b=%d", sum);
        */
		
		// [2]
		/*
		int i = 0, sum = 0;
	      while ( i < 10 ) {  
	         i++;  
	         System.out.printf("%d+", i); 
	         sum += i;
	         
	      } // while
	      System.out.printf("=%d\n", sum);
		*/
		
		// [3]
		
		/*
		int i = 0, sum = 0;
	     // while ( i++ <= 10 ) 
		while ( ++i <= 10 ) {
	         System.out.printf("%d+", i); 
	         sum += i;   
	         
	      } // while
	      System.out.printf("=%d\n", sum);
         */
		
		//[4]
		/*
		int i =10, sum =0;
		while (i>=1) {
			sum +=i;
			System.out.printf("%d+", i);
			i--;
		}
		System.out.printf("=%d", sum);
		*/
		
		// [5]
		
		int i =10, sum =0;
		while (true) {// 무한루프
			if (i<1) break;
			sum +=i;
			System.out.printf("%d+", i);
			i--;
		}
		//Unreachable code
		System.out.printf("=%d", sum);
		
		
		
		
	} // main

} // class
