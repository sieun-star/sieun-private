package days07;

/**
 * @author SIEUN
 *@date2024. 1. 9. - 오후 3:31:04
 *@subject  (시험)
 *@content
 */
public class Ex08 {

	public static void main(String[] args) {
	     // 계차 수열
		 // 항의 갯수가 20개 까지의 합
		 // 1+2+4+7+11+16+22+29+37+46+56+67+...???=??
		 //   1  2  3   4    5    6  계차(defference)  
		
		int term =1;
		int sum = 0;
		int defference = 0;
		
		for (int i = 1; i <= 20; i++) {
			term+= defference;
			System.out.printf("%d+", term);
			defference++;
			sum+=term;
		}System.out.printf("=%d", sum);
		
		
		
		/*
		int term =1;
		int term2;
		int sum = 0;
		
		for (int i = 1; i <= 20; i++) {
			term2 = term +i;
			sum += term;
			System.out.printf("%d+", term);
			term=term2;
		}System.out.printf("=%d", sum);
		*/
		
		
		
		
		

	} // main

} // class
