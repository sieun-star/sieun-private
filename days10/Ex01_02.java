package days10;



/**
 * @author SIEUN
 *@date2024. 1. 11. - 오후 5:28:51
 *@subject
 *@content
 */
public class Ex01_02 {

	public static void main(String[] args) {
	   //10진수 정수를 입력받아서 16진수로 출력
		
		int n = 125;   // 0x7D
		
		int reminder, share;
		
		String strHex = "";
		
		// 0123456789ABCDEF
		while (n!=0) {
			share = n / 16;
			reminder = n%16;
			switch (reminder) {
			case 10:reminder = 'A';break;
			case 11:reminder = 'B';break;
			case 12:reminder = 'C';break;
			case 13:reminder = 'D';break;
			case 14:reminder = 'E';break;
			case 15:reminder = 'F';break;
			default : reminder = reminder + 48; break;
			}
			
			strHex +="["+(char)reminder+"]";
			n = share;
		}
		
		System.out.println(strHex);
		
		
	} // main

} // class
