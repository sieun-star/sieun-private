package days22;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오후 12:27:16
 *@subject
 *@content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 큐(Queue) 구조
		// 디큐(Deque) 구조 == 더블 큐 구조
		// offer()                       poll(),peek()
		// FOFO 구조
		//                     LinkedList -> List, Deque -> Queue -> Collection
		Queue q = new LinkedList();
		q.offer("권맑음");
		q.offer("이동찬");
		q.offer("김영진");
		
		// Deque 추가 (양방향으로 인풋아웃풋 가능)
		// q.offerFirst(q);
		// q.offerLast(q);
		// q.pollFirst();
		// q.pollLast();
		
		// FIFO 구조 ( 들어간 순서대로 나온다)
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
		

	} // main

} // class
