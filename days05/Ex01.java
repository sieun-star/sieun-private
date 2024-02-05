package days05;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오전 9:41:43
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
  
		int [] kors = new int[3];
		
		//배열은 초기화 하지 않아도 그 자료형의 초기값으로 초기화 되어져 있다.
		// int : 0
		// double : 0.0
		// char : '\0'
		// boolean : false
		// String : null
		/*
		System.out.printf("kors[%d]=%d\n" ,0, kors[0]);
		System.out.printf("kors[%d]=%d\n" ,1, kors[1]);
		System.out.printf("kors[%d]=%d\n" ,2, kors[2]);
		*/
		// 초기화(입력)
		kors[0] =90;
		kors[1] =38;
		kors[2] =88;
		
		// 출력
		for (int i = 0; i <kors.length; i++) {
			System.out.printf("kors[%d]=%d\n" ,i, kors[i]);
		}
		
		
  } // main
} //class
