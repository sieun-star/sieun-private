package days26;

import java.io.File;

/**
 * @author SIEUN
 *@date2024. 2. 5. - 오전 3:18:06
 *@subject
 *@content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// C:\E\Class\Workspace\JavaClass\javaPro 폴더
		String currentDirectory = System.getProperty("user.dir");
		// System.out.println(currentDirectory);
		
		File p = new File(currentDirectory);
		// f.isDirectory();  // true
		// f.isFile();       // false
		
		/*
		String [] list = p.list();
		for (int i = 0; i < list.length; i++) {
			// System.out.printf(list[i]);
			File c = new File(p, list[i]);
			System.out.printf("%s\t%s\t%d\n", c.isFile() ? "파일" : "[폴더]", c.getName(), c.length());
			
		}
		*/
		
		System.out.println("-".repeat(50));
		File [] list = p.listFiles();
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%s\t%s\t%d\n", list[i].isFile() ? "파일" : "[폴더]", list[i].getName(), list[i].length());
		}
				
		
		
		

	} // main

} // class
