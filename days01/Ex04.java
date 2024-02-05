package days01;

/**
 * @author SIEUN
 *@date2023. 12. 29. - 오후 4:04:44
 *@subject
 *@content 이름, 나이를 저장할 변수를 선언하고
 *               출력하는 코딩.
 */
public class Ex04 {

	
	public static void main(String[] args) {
	  //1. 이름을 저장할 변수 선언
		String name="박우현"; 
	  //2. 나이를 저장할 변수 선언  "28" , 28
		int age = 32;
		
	  // 복사 : Ctrl + Alt + 방향키
	  //3. 이름/나이 출력
	  //3-2 출력형식 : 이름은 "박우현"이고, 나이는 32살이다.	
	  // String literal is not properly closed by a double-quote(특수문자 앞에 \)
		System.out.println("이름은\"" + name + "\"이고, 나이는 " + age + "살이다.");
		System.out.println(age);

	} // main

} // class
