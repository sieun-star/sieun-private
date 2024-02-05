package days19;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;

import days15.Point;

/**
 * @author SIEUN
 *@date2024. 1. 25. - 오후 2:16:45
 *@subject
 *@content
 */
public class Ex08 {

	public static void main(String[] args) {
		// Arrays 클래스 : toString(), sort(), binarySearch()
		// Objcets 클래스 : 모든 메서드가 static이다. 
		//                      Objects.메서드()
		//                      객체의 비교 또는 널 체크에 유용
		
		/*Point p1 = null;
		//
		//
		//
		// => p1 객체 생성 유무 체크
		// if (p1==null) {
        if (Objects.isNull(p1)) {   // p1이 널 이니?  p1이 null 일때 true
		    //	
		}
		// if (p1!= null) {
		// if (Objects.nonNull(p1)) {  // p1이 널이 아니니? p1이 null이 아닐때 true
	    if (!Objects.isNull(p1)) { 
			//	
		}
		
	    
	    // p1이 널이면 예외 발생
	    /*
	    if (p1==null) {
			new IOException("예외 메세지");
		}
	    Point pCopy = p1;
	    */
		/*
	    Point pCopy =Objects.requireNonNull(p1, "예외 메시지");
	    
	    // if (p1!=null && p1.equals(pCopy)) {
	    if (Objects.equals(p1, pCopy)) {
		}
	    */
	    System.out.println("-".repeat(30));
	    
	    Random rnd = new Random();
	    System.out.println(rnd.nextInt());   // -21억 ~ 21억     
	    System.out.println(rnd.nextInt(10));   // 0<=  <10
	    System.out.println(rnd.nextBoolean());   // true/false
	    
	    
	    
	    
	    
	    
	    
	    
	    
	} // main

} // class
