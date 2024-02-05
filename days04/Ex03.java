package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author SIEUN
 *@date2024. 1. 4. - 오전 11:45:28
 *@subject     이름,국,영,수 한 번에 입력 받아서 
 *@content     총,평
 *                  BufferdReader  사용한 예제 ( 내일 복습 시험 )
 *                  
 *                  배열 사용
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		String name;
		byte kor, eng, mat;
		short tot; 
		double avg;


		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       
		
		System.out.print("> 이름,국어,영어,수학 입력?");
		String data = br.readLine(); // "홍길동,89,78,56"
		
		// 콤마를 구분자로 data 문자열을 자라내기 => "홍길동" "89" "78" "56"
		// String String.format(String format, Object...args)
		// boolean String.equals(비교할문자열)
		// String [] String.split(구분자)
		String regex = ",";
		String [] datas = data.split(regex);
		
		name = datas[0].trim(); // "홍길동"
		kor = Byte.parseByte(datas[1].trim()); // "89"
		eng = Byte.parseByte(datas[2].trim()); // "78"
		mat = Byte.parseByte(datas[3].trim()); // "56"
	

		
		tot =(short)(kor + eng + mat); 
		avg =(double)tot /3; 



		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f이다.", name, kor, eng, mat, tot, avg);
        
		
		
		

	} // main
 
} //class
