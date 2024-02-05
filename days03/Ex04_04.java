package days03;

/**
 * @author SIEUN
 *@date2024. 1. 3. - 오후 12:48:17
 *@subject  [논리연산자]
 *@content   boolean 참/거짓 
 */
public class Ex04_04 {

	public static void main(String[] args) {
		
	  /*
	   * 1. 일반 논리 연산자
	   *   1)&& 일반 논리 AND 연산자(논리곱)
	   *     피연산자 && 피연산자
	   *        true  && true       true
	   *        true  && false      false
	   *        false && true       false
	   *        false && false      false
	   *        
	   *        앞에 항이 false가 나오면 뒤에 항은 처리하지 않는다.
	   *        두 피연산자가 참일 때만 참이 된다.
	   *        true  1
	   *        false 0
	   */
		System.out.println( 3 >= 5);    //  false
		System.out.println( 10 >= 5);  //  true
		//                            false&&   true
		System.out.println( 3 >= 5 && 10 >= 5);  //  false
		//                              true&&  true
		System.out.println( 3 <= 5 && 10 >= 5);  //  true
		System.out.println( 3 <= 5 && 10 < 5);  //  false
		System.out.println( 3 >= 5 && 10 < 5);  //  false
		
		
		
	  /*   2)||   일반 논리 OR 연산자(논리합)
	   *      항 || 항
	   *      true || true             true
	   *      true || false            true
	   *      false|| true             true
	   *      fasle||false             false
	   *      
	   *      앞에 항이 true 일 경우 뒤에 항은 처리하지 않는다.(앞에 항이 true 이면 true이기 때문에)
	   *      둘다 거짓인 경우에만 거짓이다.
	   */
	   System.out.println( 3>4 || 4>1);    // true
	   System.out.println( 3<=4 || 4>1);  // true
	   System.out.println( 3<=4 || 4<1);  // true
	   System.out.println( 3>=4 || 4<1);  // false
	   
	
		
	  /*   3)!    부정(NOT) 연산자 
	   *      !참 => 거짓
	   *      !거짓=>참   
	   */
	   System.out.println(true);
	   System.out.println(!true); //false
	   
	   System.out.println(false);
	   System.out.println(!false); //true
	   
	   System.out.println( 3>=4 );
	   
	   // The operator ! is undefined for the argument type(s) int (! 부정연산자는 int에 사용불가)
	   // 우선순위 >= ! (cast) 붙여줌
	   System.out.println( !(3>=4) ); //true
	   
	   // 다르다 연산자  ==   !=
	   // syso ( 3 =! 2) The operator ! is undefined for the argument type(s) int
	   
	   
	   
	   /* 2. 비트 논리 연산자
	   * 	1) & 비트 논리 AND 연산자
	   *    2) | 비트 논리 OR 연산자
	   *    3) ^ XOR 연산자
	   *    4) ~ 틸드 연산자(비트부정연산자)
	   */
		
	} //main

} //class
