package days14;

/**
 * @author SIEUN
 *@date2024. 1. 18. - 오전 11:23:35
 *@subject      시험
 *@content
 */
public class Ex04 {

	private static class Member{
		//멤버
	}
	
	public int age = 20;
	
	public static void main(String[] args) {
		/*
		 * [접근지정자 설명]
		 * 1. 클래스 앞의 접근지정자
		 *   1) public : 패키지 내부, 외부 어디서든지 상속과 참조 가능
		 *       (패키지 내부)
		 *       days14.Ex04.java
		 *       days14.Tv.java
		 *       (패키지 외부)
		 *       days13.Ex01.java
		 *       import days14.Tv; (import 구문 사용)
		 *       
		 *       days14.Tv.java
		 */
		  Tv tv1 = new Tv();  // 참조 가능
		  Student s1 = new Student();
		  
		/*   2) package(X,default) - 패키지 내부만 상속과 참조 가능
		 *       (패키지 내부)
		 *       days14.Ex04.java
		 *       days14.Student.java
		 *       (패키지 외부) - 사용불가
		 *       days13.Ex01.java
		 *       days14.Student.java
		 *       
		 *       독립적인 클래스를 선언할 때는 사용할 수 없는 접근지정자이다
		 *       <-> 중첩 클래스 (클래스 안에 클래스 선언) 
		 *       ** 내부 클래스 4가지 ** ( 나중에~)
		 *   3) private        비활성화 : 같은파일 내에서만 상속, 참조 가능하다.
		 *   
		 *   4) protected     비활성화 : 2)package 기능 + 패키지 외부에서는 상속만 가능하다.
		 *   
		 * 1-2. 클래스 앞의 기타제어자
		 *   1) abstract - 추상 클래스 
		 *   2) final      - 최종 클래스 (상속)
		 *       상수
		 *       final double PI =3.14;
		 *   3) static   비활성화 - 중첩클래스 선언시만 사용가능하다
		 *   
		 * 2. 멤버 앞의 접근지정자
		 *   1) public
		 *   2) package
		 *   3) private
		 *   4) protected
		 * 
		 */
		
		
		

	} // main

} // class
