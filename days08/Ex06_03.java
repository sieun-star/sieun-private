package days08;

/**
 * @author SIEUN
 *@date2024. 1. 10. - 오후 4:17:35
 *@subject
 *@content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		      String rrn = "830412-1700001";
		      String [] rrnArr = rrn.split("-");
		      System.out.println(rrnArr[0]);
		      System.out.println(rrnArr[1]);
		      System.out.println(rrnArr[1].charAt(0));
		      
		      String printRRN = rrnArr[0]+"-"+rrnArr[1].charAt(0)+"******";
		      System.out.println(printRRN);
		      
		      // 주민등록번호를 출력
		      // 830412-1******


	} // main

} // class
