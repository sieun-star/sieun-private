package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author SIEUN
 *@date2024. 1. 31. - 오후 12:22:06
 *@subject
 *@content
 */
public class Ex05_03 {

	public static void main(String[] args) {
	    int [] score = {80, 95, 50, 85, 45, 65, 10, 100};
	    // 1) 80 보다 큰 점수를 얻어와서 출력
	    /*
	    for (int i = 0; i < score.length; i++) {
			if(score[i]>80) System.out.println(score[i]);
		}
		*/
	    // int [] -> TreeSet<Integer>변환
	    /*
	    TreeSet<Integer> ts = new TreeSet<>();
	    for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		}
		*/
	    //             
	    //                                                        int [] ->IntStream -> Stream<Integer> -> List  -> ArrayList
	    ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(score).boxed().collect(Collectors.toList());
	    TreeSet<Integer> ts = new TreeSet<>(list);
	    
	    // 지정된 값보다 작은값의 객체를 반환하는 메서드
	    // ts.headSet(null);
	    
	    // 지정된 값보다 큰값의 객체를 반환하는 메서드
	    System.out.println(ts.tailSet(80));  // [80, 85, 95, 100]
	    // System.out.println(ts.tailSet(80, true));  // [80, 85, 95, 100]
	    System.out.println(ts.tailSet(80, false));  // [85, 95, 100]

	    

	} // main

} // class
