package days14;

/**
 * @author SIEUN
 *@date2024. 1. 18. - 오후 3:53:01
 *@subject
 *@content
 */
public class Ex10 {

	public static void main(String[] args) {
		Ex10 obj = new Ex10();
		
		// 메서드(기본형 매개변수, 참조형 매개변수)
		// [리턴자료형이 참조형(배열)인 경우 ~.~]
		int [] m = new int[3];
		m =obj.increaseArrary(m);
		System.out.println(m.length);
		
	} // main

	private  int[] increaseArrary(int[] m) {
		int [] temp = new int[m.length+3];
		return temp;
	}

} // class
