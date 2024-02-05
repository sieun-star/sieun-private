package days24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

/**
 * @author SIEUN
 *@date2024. 2. 1. - 오전 11:23:33
 *@subject
 *@content
 */
public class Ex02 {

	public static void main(String[] args) {
		// Arrays 클래스 : 배열 사용하기 쉽도록 기능(메서드)이 구현된 클래스
		// [ Collections 클래스 ]
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		// <? super T>    매개변수 다형성
		addAll(list, 1,2,3,4,5);
		System.out.println(list);  // [1, 2, 3, 4, 5]
		
		// rotate(2)  2칸씩 오른쪽으로 이동
		// rotate(-2) 2칸씩 왼쪽으로 이동
		/*
		int distance = 2;
		rotate(list, distance);
		System.out.println(list);
		*/
		
		// swap 자리바꿈
		/*
		swap(list, 0, 3);
		System.out.println(list);
		*/
		
		// shuffle() 임의의 자리 변경 
		shuffle(list);
		/*
		shuffle(list);
		shuffle(list);
		shuffle(list);
		*/
		System.out.println(list);
		
		// 오름차순 정렬
		sort(list);
		System.out.println(list);
		
		// 내림차순 정렬
		// [1] sort(list, (o1,o2)-> o2-o1);
		/* [2]
		sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}});
		*/
		sort(list, reverseOrder());
		System.out.println(list);
		
		// 하나의 값으로 초기화
		fill(list, 0);
		System.out.println(list);
		

	} // main

} // class






