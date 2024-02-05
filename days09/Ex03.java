package days09;

/**
 * @author SIEUN
 *@date2024. 1. 11. - 오전 11:10:45
 *@subject
 *@content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		3. String rrn = "830412-1700001";
		   이렇게 출력되도록 코딩하세요 . 
		   실행결과 : 830412-1******
        */
		String rrn = "830412-1700001";
		String printRRN = rrn.substring(0, 8).concat("******");
		System.out.println(printRRN);
		

	}

}
