package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 16. - 오전 11:20:11
 *@subject     한반에 23명 있는 3반의 학생들의 이름, 국어, 영어, 수학, 총점, 반등수, 전교등수 처리 코딩
 *@content
 */
public class Ex03_02 {

	public static void main(String[] args) throws IOException {
	
		final int STUDENT_COUNT = 23;
		final int CLASS_COUNT = 3;
		
		String [][] names = new String [CLASS_COUNT][STUDENT_COUNT];
		double [][] avgs = new double[CLASS_COUNT][STUDENT_COUNT];
		int [][][] infos = new int [CLASS_COUNT][STUDENT_COUNT][6];     // 전교등수 까지 6개
		
		int [] counts = new int [CLASS_COUNT];
		char con = 'y';
		
	    String name;
	    int kor , eng, mat, tot, rank, wrank;
	    double avg;
	    Scanner scanner = new Scanner(System.in);
	    int ban;
		
	    do {
	    	System.out.print(" > 반 입력 ?");
	    	ban = scanner.nextInt();
	    	System.out.print("> %d반 이름, 국어, 영어, 수학 입력 ?");
	    	name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank =1;
			wrank = 1;
			
			
			 
			
			




			System.out.print(" > 계속 입력 ?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

	    
		
	} // main

	private static int getScore() {
		return (int)(Math.random()*101);
	}

	private static String getName() {
		String lastNames [] = {"강", "장", "김", "이", "고", "홍"};
		Random rnd = new Random();
		int index = rnd.nextInt(lastNames.length);
		String lastName = lastNames[index];

		char [] firstNames = new char [2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}
		String name = lastName + firstNames[0]+firstNames[1];
		return name;
	}
} // class
