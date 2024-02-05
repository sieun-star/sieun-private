package days26;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author SIEUN
 *@date2024. 2. 5. - 오전 3:27:45
 *@subject
 *@content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days26";
		// dasy26 폴더 앞에 있는 자바파일(.java)만 출력
		// days26 폴더 안에 있는 자바파일(.dat)만 출력
		
		File f = new File(pathname);
		
		File [] list = f.listFiles( (d,n) -> n.endsWith(".java"));
		for (File c : list) {
			System.out.println(c.getName());
		}
		
		/*
		f.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File d, String n) {
				return n.endsWith(".java");
			}
		});
		*/
		
		
		/* [1]
		File [] list = f.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				String fileName = list[i].getName();
				int pos = fileName.indexOf(".");
				String ext = fileName.substring(pos);
				if (ext.equals(".java")) {
					System.out.println(fileName);
				}
			}
		}
		*/

	} // main

} // class
