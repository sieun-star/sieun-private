package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author SIEUN
 *@date2024. 1. 3. - 오전 9:42:08
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		// '0' -> 48(10진수)
		// '0' -> 0 변환
		//  '0' -48 = 0
		//  '1' -48 = 1
		//  '2' -48 = 2
		//  '3' -48 = 3

		//System.out.println('1' + ""); // "1"

		String name;
		byte kor, eng, mat;
		short tot; 
		double avg;


		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("1. 이름 입력?");
		name = br.readLine();

		System.out.print("2. 국어 입력?");
		kor =Byte.parseByte(br.readLine());

		System.out.print("3. 영어 입력?");
		eng =Byte.parseByte(br.readLine());

		System.out.print("4. 수학 입력?");
		mat =Byte.parseByte(br.readLine());


		//강제형변환 1번째 경우
		tot =(short)(kor + eng + mat); // int 보다 작은 자료형은 연산할 때 CPU 가 int 자료형으로 처리해서 연산
		avg =(double)tot /3; // 3.0   3.  3d



		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f이다.", name, kor, eng, mat, tot, avg);











	} //main

} //class
