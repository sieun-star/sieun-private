package days05;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오후 4:38:39
 *@subject  if, switch, for, while, do~while
 *@content break, foreach
 *               [continue문]
 */              
public class Ex09 {

	public static void main(String[] args) {
		
		//1~10=55 출력하는 코딩
		/*
		int sum =0;
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
            System.out.printf("=%d\n", sum);
		*/
		/*
		// [1]홀수 합 출력
		int sum =0;
		for (int i = 1; i <=10; i++) {
			if (i%2!=0) {
				System.out.printf("%d+", i);
				sum += i;
			} // if
			
		}// for
            System.out.printf("=%d\n", sum);
            
            */
		
		// [2]
		/*
		int sum =0;
		for (int i = 1; i <=10; i++) {
			if (i%2!=0) continue;
			System.out.printf("%d+", i);
			sum += i;
		}
            System.out.printf("=%d\n", sum);
		
		*/
		
		// [3]
            
		int sum =0;
		for (int i = 1; i <=10; i+=2) {
			
			System.out.printf("%d+", i);
			sum += i;
		}
            System.out.printf("=%d\n", sum);
            
            
            
            
	} //main

} //class
