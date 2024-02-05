package days14;

/**
 * @author SIEUN
 *@date2024. 1. 18. - 오후 4:46:35
 *@subject
 *@content
 */
public class Ex10_04 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		p1
		    .moveNewPoint(100)
		    .dispXY();
		/*
		Point p = p1.moveNewPoint(100);
		p.dispXY();   => 위와 같은것
		*/
		//p1.movePoint(100).dispXY(); => X  리턴자료형이 클래스가 아니기 때문에...?!
		
	
	} // main

} // class
