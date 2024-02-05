package days15;

/**
 * @author SIEUN
 *@date2024. 1. 19. - 오후 2:52:21
 *@subject
 *@content
 */
public class Ex07 {

	public static void main(String[] args) {
	    // [ static 키워드 ]
		// 필드 앞에
		// 메서드 앞에
		// 클래스 앞에
		// ㅇㅖ )
		// 우리 반 학생 -> 1층 기업은행 -> 보통 예금
		// 1. 저축 클래스 선언 : Save 클래스 선언
		
		// static 변수    클래스명.클래스변수
		// The field Save.rate is not visible -접근지정자
		// Save.rate = 0.08;
		
		// 클래스 배열을 사용 => 편리
		/*
		Save [] sArr = new Save[5];
		sArr[0] = new Save("강명건", 1000, 0.04);
		sArr[1] = new Save("구본혁", 10000, 0.04);
		sArr[2] = new Save("권맑음", 500, 0.04);
		sArr[3] = new Save("김영진", 15000, 0.04);
		sArr[4] = new Save("김진성", 100000, 0.04);
		*/
		
		// 클래스 배열 초기화
		Save [] sArr = {
				new Save("강명건", 1000, 0.04),
				new Save("구본혁", 10000, 0.04),
				new Save("권맑음", 500, 0.04),
				new Save("김영진", 15000, 0.04),
				new Save("김진성", 100000, 0.04)
		};
		
		// Save.setRate(0.07);
		sArr[1].setRate(0.09); // 공유 변수를 사용해서 모든 rate 가 0.09로 바뀜
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		}
		
		
		
		// 클래스명.클래스(스태틱).메서드()
		// Save.setRate(0.08);
		
		

	} // main

} // class
