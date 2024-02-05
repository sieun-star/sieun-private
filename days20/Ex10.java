package days20;

/**
 * @author SIEUN
 *@date2024. 1. 26. - 오후 5:25:02
 *@subject
 *@content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
        char one;
        int sum = 0;
        for(int i = 0; i< my_string.length(); i++){
            one = my_string.charAt(i);
            if(Character.isDigit(one)){
                sum+=one-'0';
            }
            answer = sum;
        }
    System.out.println(sum);
		
		

	} // main

} // class
