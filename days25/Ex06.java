package days25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author SIEUN
 *@date2024. 2. 2. - 오후 12:33:20
 *@subject
 *@content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 실행파일 복사 -> 바이트(이진) 스트림
		// FileInputStream / FileOutputStream 

		String sourceFile = "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
		String copyFile = "C:\\Users\\user\\Documents\\iexplore_copy.exe";

		// > 복사 처리 시간 : 10211350500(ns)
		fileCopyBinaryStream(sourceFile, copyFile);

	} // main

	
	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {
		long start = System.nanoTime();

		try(FileInputStream fis = new FileInputStream(sourceFile);
			FileOutputStream fos = new FileOutputStream(copyFile)) {
			int code;
			while ((code = fis.read())!=-1) {
				System.out.printf("%08d\n",Integer.parseInt(Integer.toBinaryString(code)) );	
				fos.write(code);
				
			}
			fos.flush();
			System.out.println("파일 복사 완료!!!");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

} // class
