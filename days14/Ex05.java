package days14;

/**
 * @author SIEUN
 *@date2024. 1. 18. - 오전 11:52:31
 *@subject
 *@content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 1) 객체(클래스)복사 copy
		// 2) 객체(클래스)복제 clone
		
		Tv tv1 = new Tv();
		tv1.color = "red";
		changeColor(tv1);
		System.out.println(tv1.color);
		Tv tv2 = tv1;  // 객체복사(copy)
		

	} // main
                                 //  객체복사  Tv tv1 = tv1
	private static void changeColor(Tv tv1) {
		tv1.color = "blue";
		
	}

} // class
