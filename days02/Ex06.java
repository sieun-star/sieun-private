package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author SIEUN
 *@date2024. 1. 2. - 오후 12:30:56
 *@subject   
 *@content    키보드(표준입력장치)로 부터 이름을 입력 받아서 출력
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); //암기
		
		System.out.print(">이름 입력 ?");
		String name = "이시은";
		
		//Unhandled exception type IOException
		name = br.readLine(); //암기
		
		System.out.printf("> 이름 : %s\n", name);
		

	
		
		

	} // main

} // class
