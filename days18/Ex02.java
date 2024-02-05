package days18;

// import java.lang.*; 컴파일러가 java.lang import문 자동으로 추가!
/**
 * @author SIEUN
 *@date2024. 1. 24. - 오전 10:26:29
 *@subject      java.lang 패키지 - 자바의 가장 기본이 되는 클래스
 *@content      유용한 클래스 ( java.utill 패키지)
 *                   Object.equals => overriding
 */
public class Ex02 {

	public static void main(String[] args) {
	    // [java.lang.Object 클래스]
		// 1. 모든 클래스의 최상위 부모클래스
		Item item1 = new Item(10);
		Item item2 = new Item(10);
		//                          객체   ==   객체     참조주소값비교 
 		System.out.println(item1 == item2);  // false
 		//  Object.equals()  참조주소값 비교
 		System.out.println(item1.equals(item2));  // false 오버라이딩 후 true
		
 		item2 = item1; // 객체(클래스)복사
		System.out.println(item1 == item2); // true
		System.out.println(item1.equals(item2)); // true
	
	} // main

} // class

class Item extends Object{
	// 필드
	int value;
	
	// 생성자 1
	Item (int value){
		
	    this.value = value;
	}

	// 다른 객체들을 비교할 대 value 값만 같으면 같다라고 처리.. 
	// item1.equals(item2)
	@Override
	public boolean equals(Object obj) {
		// this.value == item1.value
		if (obj instanceof Item) {
			// down casting
			Item item2 =(Item)obj;
			if (this.value==item2.value) return true;
		}
		
		return false;
	}
	
	
	
	
	
}






