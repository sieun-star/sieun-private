package days07;

/**
 * @author SIEUN
 *@date2024. 1. 9. - 오후 12:36:37
 *@subject
 *@content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [순서도]
		//       ㄴ  워크플로 혹은 프로세스를 보여주는 다이어그램의 한 종류다.
		// 1-2+3-4+5-6+7-8+9-10=-5
		// 짝수는 sum -
		// 홀수는 sum +
		
		// [3] 스위칭 변수를 사용하는 방법 (기억)
		
		
		int sum = 0;
		boolean sw = false;
		for (int i = 1; i <=10; i++) {
			System.out.printf(sw? "%d+" : "%d-", i);
			sum+= i%2==0? -i : i;
			sw=!sw;
		}
		
		System.out.printf("\b=%d", sum);
		
		
		// [3]
		// 스위칭 변수
		/*
		boolean sw = false;
		for (int i = 1; i <=10; i++) {
			if (sw) {
				sum-=i;
				System.out.printf("%d+", i);
				// sw=!sw;
			}else {
				System.out.printf("%d-", i);
				sum +=i ;
				// sw=!sw;  // false -> true
			}
			 sw=!sw;
		}
		System.out.printf("\b=%d", sum);
		*/
	
			
			
			
			
			/*[2]
			System.out.printf(i%2==0? "%d+" : "%d-", i);
			sum+= i%2==0? -i : i;
		System.out.printf("\b=%d", sum);
		    */
	
			
			/* [1]
			if (i%2==0) {
				sum-=i;
				System.out.printf("%d+", i);
			}else {
				sum +=i ;
				System.out.printf("%d-", i);
			}
			
		}
		System.out.printf("\b=%d", sum);
		*/
		
			
		
	} // main

} // class
