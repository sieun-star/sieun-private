package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author SIEUN
 *@date2024. 2. 5. - 오전 3:43:30
 *@subject
 *@content
 */
public class Ex02_04 {

	public static void main(String[] args) {
		
		String pathname = ".\\src\\days25";
		String keyword = "source";
		
		File parent = new File(pathname);
		File list [] = parent.listFiles((dir,name) -> name.endsWith(".java"));
		
		File child = null;
		int lineNumber = 1;
		String line = null;
		for (int i = 0; i < list.length; i++) {
			child = list[i];
			lineNumber = 1;
			String fileName = child.getName();
			System.out.printf("-----%s-----\n", fileName);
			
			try (FileReader fr = new FileReader(child);
				BufferedReader br = new BufferedReader(fr)	){
				while ((line =br.readLine()) != null) {
					if (line.contains(keyword)) {
						line.replaceAll(keyword, "["+keyword+"]");
						System.out.printf("%d: %s", lineNumber, line);
					}
					lineNumber++;
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		

	} // main

} // class
