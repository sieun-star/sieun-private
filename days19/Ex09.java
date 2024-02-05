package days19;

import java.io.FileReader;
import java.util.Arrays;

/**
 * @author SIEUN
 *@date2024. 1. 25. - 오후 2:30:12
 *@subject
 *@content
 */
public class Ex09 {

	public static void main(String[] args) {
		// days18.Ex01.java 자바파일 안에 있는
		// 알파벳을 대소문자 구분하지 않고 배열에 저장 후 ### 막대그래프 그리기.
		// counts[0] = A(65) 문자의 갯수 저장
		// counts[1] = B(66) 문자의 갯수 저장
		// counts[2] = C(67) 문자의 갯수 저장
		// :
		// counts[25] = Z(90) 문자의 갯수 저장
		// A ~ Z  26문자
		int [] counts = new int['Z'-'A'+1];

		String fileName = "\\src\\days18\\Ex01.java";
		String key = "user.dir";
		String userDir = System.getProperty(key);
		String path = String.format("%s%s", userDir , fileName);

		try(FileReader fr = new FileReader(path);) {

			int code;
			char one;
			// read(): EOD             -1 반환
			while ((code = fr.read()) != -1) {
				one = (char)code;
				// System.out.println(one);
				one = Character.toUpperCase(one);
				if (Character.isUpperCase(one)) {
					// System.out.println(one);
					counts[one-'A']++;
				}
			} // while
			
			System.out.println(Arrays.toString(counts));
			
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("'%c' : %s(%d)\n",	'A'+i ,"#".repeat(counts[i]), counts[i] );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}



	} // main

} // class
