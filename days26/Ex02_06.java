package days26;

import java.io.File;

/**
 * @author SIEUN
 *@date2024. 2. 5. - 오후 2:27:17
 *@subject   [시험]
 *@content
 */
public class Ex02_06 {

	public static void main(String[] args) {
		// days26
		//    ㄴ [temp] 폴더 삭제
		//         ㄴ  a.txt
		//         ㄴ  b.txt
		//         ㄴ  subTemp
		//                ㄴ c.txt
		//                ㄴ d.txt
		
		String pathname = ".\\src\\days26\\temp";
		File p = new File(pathname);
		
		if (p.exists()) {
			// 이유:  delete() 메서드는 하위 디렉토리가 없어야 삭제할 수 있다.
			// System.out.println(p.delete()); 
			directoryDelete(p);
			// 재귀함수!
		}
		System.out.println(" end ");
		
		
		

	} // main
	private static void directoryDelete( File f ) {
	      // f 삭제되지 않았을 경우 while 반복
	      while (  !f.delete() ) {  // true, false
	         
	          File[] list =   f.listFiles();
	          for (int i = 0; i < list.length; i++) {   
	             if (list[i].delete()) {
	               System.out.printf("%s  삭제 완료!!!\n", list[i] );
	            } else {
	               directoryDelete( list[i] );
	            } // if
	          } //
	         
	      } // while
	   }

} // class
