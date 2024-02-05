package days17;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import days16.Employee;
import days16.Temp;

/**
 * @author SIEUN
 *@date2024. 1. 23. - 오전 10:45:57
 *@subject
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {
		// up casting
		// Employee emp = new Temp();
		
		List list = new ArrayList();
		
		// List 가 ArrayList와 Vector 의 부모 
		test(list);
		test(new ArrayList());
		test(new Vector());

	} // main

	public static void test(List list) { // 매개변수 다형성
		
	}
	
} // class



