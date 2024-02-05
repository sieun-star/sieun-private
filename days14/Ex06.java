package days14;

/**
 * @author SIEUN
 *@date2024. 1. 18. - 오후 2:01:18
 *@subject
 *@content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [객체 (클래스) 배열]
		
		// 클래스(객체) 배열 - 클래스를 자료형으로 선언된 배열
		//         (배열명)
		Point [] points = new Point[3];
		
		for (int i = 0; i < points.length; i++) {
			// NullPointerException
			points[i] = new Point(); // 객체 생성!! (꼭~ 주의해줘)
			points[i].dispXY();
		}
		
		
		
		
		
		
	} // main

} // class
