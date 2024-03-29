package days26;

import java.io.File;

/**
 * @author SIEUN
 *@date2024. 2. 5. - 오후 2:14:41
 *@subject
 *@content
 */
public class Ex02_05 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days26";
		// days26  폴더 안에 upload 폴더 생성.
		File upload = new File(pathname, "upload");
		
		// System.out.println(upload.exists());  // false
		if (!upload.exists()) {
			System.out.println(upload.mkdir());  // mk = make
			// madirs();  : [days26]\다른 서버 디렉토리\test\\upload
			
			// creatTempFile("work", ".tmp")
			// 임시파일
			// C:\\window\\Temp          파일 생성
		}else {
			// 폴더가 존재하면 삭제 해 보자.
			System.out.println(upload.delete());
			// deleteOnExit(); 응용 프로그램이 종료될 때 파일 삭제(임시 파일 삭제)
		}
		 
		

	} // main

} //class
