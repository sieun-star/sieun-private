package days17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author SIEUN
 *@date2024. 1. 23. - 오후 5:19:01
 *@subject     [파일 읽어서 출력 + try~catch~finally문]
 *@content
 */
public class Ex16 {

	public static void main(String[] args) {
		String fileName = "C:\\Setup.log";
		// [FileReader]/FileWriter

		FileReader reader = null;
		try {
			reader =	 new FileReader(fileName);
			
			int one = reader.read();
			System.out.printf("%c", (char)one);
			System.out.printf("%c", (char)one);
			System.out.printf("%c", (char)one);
			System.out.printf("%c", (char)one);
			


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (reader==null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		


	} // main

} // class
