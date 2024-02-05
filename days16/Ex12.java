package days16;

/**
 * @author SIEUN
 *@date2024. 1. 22. - 오후 5:16:07
 *@subject
 *@content
 */
public class Ex12 {

	public static void main(String[] args) {
		// [클래스 간의 형변환]
		// 반드시 상속 관계가 있어야 된다.
		// Regular emp = new Temp(); X
		
		/*
		// 자동으로 업캐스팅(Up Casting)
		Regular emp = new SalesMan();
		
		// 강제로 다운캐스팅
		// cast 연산자 사용
		SalesMan sm = (SalesMan)emp;
	    */
		
		Regular emp = new Regular();
		// ClassCastException
		SalesMan sm = (SalesMan)emp;
		sm.getName();
		// 업캐스팅 한 객체만 다운캐스팅 가능!! 
		

	} // main

} // class
