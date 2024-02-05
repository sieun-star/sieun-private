package days23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Iterator;

/**
 * @author SIEUN
 *@date2024. 1. 31. - 오전 8:31:36
 *@subject      [로또번호 내림차순]
 *@content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 로또게임

		int n = 5;  // 게임횟수
		// Syntax error, insert "Dimensions" to complete ReferenceType  기본형X
		LinkedHashSet<Integer> lotto = null;
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<>(n);

		int ln = 0;
		// 입력 - 문제점 파악/해결
		for (int i = 0; i < n; i++) {
			lotto = new LinkedHashSet<>(6);
			while (lotto.size()<6) {
				ln = (int)(Math.random()*45+1);
				lotto.add(ln);
			} // while
			lottos.add(lotto);
		} // for


		// 출력
		int cnt = 1;
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator();
		// Collections.sort(List<> list);
		ArrayList<Integer> list = null;
		while (ir.hasNext()) {
			System.out.printf("%d게임 : ", cnt++);
			lotto = ir.next(); // LinkedHashSet

			list = new ArrayList<Integer>(lotto);
			Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬
			// Collections.sort(list); // 오름차순 정렬

			Iterator<Integer> ir2 = list.iterator();
			while (ir2.hasNext()) {
				ln =  ir2.next();  // Integer -> int 오토언박싱
				System.out.printf("[%02d]", ln);
			} // while
			System.out.println();
		}// while


	} // main


} // class





