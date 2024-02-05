package days02;


/**
 * @author SIEUN
 *@date2024. 1. 2. - 오전 10:07:01
 *@subject
 *@content
 */
public class Ex02_02 {
	
	//String name; X

	public static void main(String[] args) {
		
		//지역변수(local variable)는 반드시 초기화해야 사용할 수 있다.
		//The value of the local variable name is not used
		String name; //o 노란색 밑줄 -> 경고
		
		name = "홍길동";
		
		//[에러]The local variable name may not have been initialized (지역변수가 초기화 되지 않았다)
		System.out.println(name);
		
		
	}

}
