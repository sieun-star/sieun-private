package days10;

/**
 * @author SIEUN
 *@date2024. 1. 11. - 오후 5:28:51
 *@subject
 *@content
 */
public class Ex01_02_02 {

	public static void main(String[] args) {
	   //10진수 정수를 입력받아서 16진수로 출력
		
		int n = 125;   // 0x7D
		
		int reminder, share;
		
		// String strHex = "";
		StringBuilder sb = new StringBuilder();
		
		
		String hex = "0123456789ABCDEF";
		while (n!=0) {
			share = n / 16;
			reminder = n%16;
			sb.append(hex.charAt(reminder));
			//sb.insert(0,hex.chaAt(reminder));   -> 0번째 부분에 첨가..?
			
			n = share;
		}
		
		System.out.println(sb.reverse());
		
		
	} // main

} // class
