package days14;

/**
 * @author SIEUN
 *@date2024. 1. 18. - 오후 12:33:49
 *@subject
 *@content
 */
public class Ex05_04 {

	public static void main(String[] args) {
		// 클래스(객체) 복제 = clone
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		// 인스턴스                                     객체 
		// [10][20]-------------------------> [0x100]p1
		
		// 복제(clone)
		// [10][20]-------------------------> [0x200]p2
		Point p2 = new Point();
		p2.x = p1.x;
		p2.y = p1.y;
		

	} // main

} // class
