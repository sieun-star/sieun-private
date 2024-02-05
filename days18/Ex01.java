package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author SIEUN
 *@date2024. 1. 24. - 오전 9:00:25
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args){
		// [FileReader]/FileWirter 클래스 사용
		FileReader reader = null;
		
		String fileName ="C:\\Setup.log";
		int one = -1;
		try {
			reader = new FileReader(fileName );
			
			// EOF 파일의 끝을 만나면 -1를 
			while ((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	} // main

} // class





















