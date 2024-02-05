package days02;

/**
 * @author SIEUN
 *@date2024. 1. 2. - 오후 4:03:40
 *@subject
 *@content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// 10진수 10 -> 2진수    00001010 (1바이트)
		//                  8진수    00 001 010  -> 012
		//                  16진수  0000 1010    -> 0a
		
		short s = 65;
		char c = 'A';
		
		
		// char 유니코드 2바이트
		// 2진수 변환
		// 'A' -> 문자코드표 -> [][][][][][][][][][][][][][][][]
		//             65
		// ASCII 
		char ch = 'A'; //~'Z'   'a'~'z'
		System.out.printf("%c-%d\n",ch, (int)ch);
		System.out.printf("%c-%d\n",'Z', (int)'Z');
		System.out.printf("%c-%d\n",'a', (int)'a');
		System.out.printf("%c-%d\n",'z', (int)'z');
		
		// '가'~'힣'
		System.out.printf("%c-%d\n",'가', (int)'가');
		System.out.printf("%c-%d\n",'힣', (int)'힣');
		
		// [u]nicode
		char x = '\u0061';
		System.out.printf("x : %c\n", x); // 소문자 'a'
		
		// 0xFFFF    0x12FC
		
		
		
		
		
	}//main

}//class
