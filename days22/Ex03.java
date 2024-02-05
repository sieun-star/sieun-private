package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오전 10:46:07
 *@subject
 *@content
 */
public class Ex03 {

	public static void main(String[] args) {
	    // [1] ArraysList -> String[] 변환
		ArrayList list = new ArrayList();
		list.add("유진");
		list.add("원대안");
		list.add("윤형준");
		System.out.println(list);
		
		String [] names =(String[]) list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(names));
		
		// [2] String[] -> ArrayList 변환
		List l = Arrays.asList(names);
		System.out.println(l);
		
		ArrayList list2 = new ArrayList(l);  // Collection <- List 매개변수 다형성
		System.out.println(list2);
		
		

	} // main

} // class
