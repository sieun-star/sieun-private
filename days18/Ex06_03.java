package days18;

/**
 * @author SIEUN
 *@date2024. 1. 24. - 오후 4:31:34
 *@subject     왜 꼭 문자열을 변경(수정)일어날때는
 *@content     String클래스보다 StringBuffer, StringBuilder를 사용해야 하는지?
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// testString();     // > String 처리 시간 : 5353805900ns
		testStringBuilder(); //> StringBuilder 처리 시간 : 6991700ns
		

	} // main

	private static void testStringBuilder() {
		long start = System.nanoTime();
		StringBuilder sb = new StringBuilder("a");
	    for (int i = 0; i < 200000; i++) {
			sb.append("a");
		} // for
		long end = System.nanoTime();
		System.out.printf("> StringBuilder 처리 시간 : %dns\n", (end-start));
	}

	private static void testString() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s += "a";
		} // for
		long end = System.nanoTime();
		System.out.printf("> String 처리 시간 : %dns\n", (end-start));
	}

} // class
