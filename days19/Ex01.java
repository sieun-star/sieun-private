package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author SIEUN
 *@date2024. 1. 25. - 오전 8:59:12
 *@subject     [시험]
 *@content
 */
public class Ex01 {

	public static void main(String[] args){
	
	    String fileName = "SS20_Team.txt";
	    String [] teamMember = null;  // 나의 팀원들을 저장할 배열
	    
	    String key = "user.dir";
	    String userDir = System.getProperty(key);
	    // E:\Class\Workspace\JavaClass\javaPro\src\days19
	    // System.out.println(userDir);
	    
	    String path = String.format("%s\\src\\days19\\%s", userDir , fileName);
	    // E:\Class\Workspace\JavaClass\javaPro\src\days19\\src\days19\SS20_Team.txt
	    // System.out.println(path);
	    
	    String myName = "이시은";
	    String teamLine = null;
	    String teamMemberLine = null;
	    String teamLeader = null;
	    String regex = "\\s*,\\s*";
	    
	    try(FileReader fr = new FileReader(path);
	         BufferedReader br = new BufferedReader(fr);) {
			
	    	while ((teamLine=br.readLine())!=null) {
				teamMemberLine = br.readLine();
				// System.out.printf("[%s]: [%s]\n", teamLine, teamMemberLine);
	    		if (teamMemberLine.contains(myName)) {
					System.out.printf("[%s]: [%s]\n", teamLine, teamMemberLine);
					
					teamMember = teamMemberLine.split(regex);
					
					teamLeader = teamMember[0].replace("(팀장)", "");
					
					// 나머지 팀원들 내리참순으로 정렬
					String [] temp  = new String [teamMember.length-1];
					System.arraycopy(teamMember, 1, temp, 0, teamMember.length-1);
					// System.out.println("temp : "+Arrays.toString(temp));
					Arrays.sort(temp, Collections.reverseOrder());
					// System.out.println("temp : "+Arrays.toString(temp));
					System.arraycopy(temp, 0, teamMember, 1, temp.length);
					// System.out.println(Arrays.toString(teamMember));
					
					break;
				} // if
	    		
			} // while
	    	
	    	// 출력
	    	String output = "<ul>\n"
	    			+ "  <li class=\"leader\">";
	    	System.out.printf("[%s]\n", teamLine);
	    	output += String.join("</li>\n  <li>", teamMember);
	    	output+="</li>\n"
	    			+ "</ul>";
	    	System.out.println(output);
	    	
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
		
		
	} // main

 
} // class
