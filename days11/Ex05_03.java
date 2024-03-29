package days11;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 15. - 오전 11:42:17
 *@subject
 *@content
 */
public class Ex05_03 {

	public static void main(String[] args) throws IOException {
	    // 한 반에 최대 23명 학생의 성적 처리를 배열을 사용해서 해보자!
		// 성적 처리 ( 국, 영 , 수 , 총점, 평균, 등수)
		// 1. 입력 - 이름, 국, 영, 수
		// 2. 처리 - 총점, 평균, 등수
		// 3. 파일 입출력, DB 입출력 -> X
		int kor, eng, mat, tot, rank;
		String name;
		double avg;
		final int STUDENT_COUNT =23;
		
		String [] names = new String [STUDENT_COUNT];
		int [] kors = new int [STUDENT_COUNT];
		int [] engs = new int [STUDENT_COUNT];
		int [] mats = new int [STUDENT_COUNT];
		int [] tots = new int [STUDENT_COUNT];
		double [] avgs = new double [STUDENT_COUNT];
		int [] ranks = new int [STUDENT_COUNT];
		
		Scanner scanner = new Scanner(System.in);
		int count = 0; // 실제 입력받은 학생수
		char con = 'y';
		
		do {
			System.out.printf(" > %d번 이름, 국어, 영어, 수학 입력 ?", count+1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

	        tot = kor + eng + mat;
	        avg =(double)tot/3;
	        rank = 1;
	        
	        names[count] = name;
	        kors[count]=kor;
	        engs[count]=eng;
	        mats[count]=mat;
	        tots[count]=tot;
	        avgs[count]=avg;
	        ranks[count]=rank;
	        
	        count++;
	        
	        System.out.print("> 학생 입력 계속?");
	        con = (char)System.in.read();
	        System.in.skip(System.in.available());
	        
		} while (Character.toUpperCase(con)=='Y');
		
		// 등수처리
		procRank(tots, ranks, count);
		
		// 학생 정보 출력
        dispStudentInfo(names, kors, engs, mats, tots, avgs, ranks, count);
 
		
		
		
		
		

	} // main

	private static void procRank(int[] tots, int[] ranks, int count) {
			// 1 나머지 총점 비교
			// 2 나머지 총점 비교
			// 7 나머지 총점 비교
			for (int i = 0; i < count; i++) {
				ranks[i] = 1;
				for (int j = 0; j < count; j++) {
					if (tots[i] < tots[j]) ranks[i]++;
				}
			}
				
			
		
		
		
	}

	private static void dispStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
			int[] ranks, int count) {
		System.out.printf("총%d 명 \n", count);
		for (int i = 0; i < count; i++) {
			System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t %d등\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i],avgs[i], ranks[i]);
		}
		
	}

	// 랜덤하게 점수를 발생시키는 함수
	public static int getScore() {
		return (int)(Math.random()*101);
	}
	public static String getName() {
		String [] lastNames = {"김","이","박","최","권","홍"}; 
		Random rnd = new Random();
		int index =rnd.nextInt(lastNames.length); // 0<= int <6
		String lastName = lastNames[index];
		
		char[] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char)(rnd.nextInt('힣' - '가'+1)+'가');
		}
		String name = lastName + firstNames[0] + firstNames[1];
		return name;
	}
	
} // class
