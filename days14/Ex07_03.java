package days14;

/**
 * @author SIEUN
 *@date2024. 1. 18. - 오후 2:28:23
 *@subject
 *@content
 */
public class Ex07_03 {

	public static void main(String[] args) {
        // 좌표를 다루는 클래스 선언해서 처리(용이)
		Point [] points = new Point[5];
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point();
			points[i].x = 1;
			points[i].y = 2;
			points[i].dispXY();
		}

	} // main


} // class





