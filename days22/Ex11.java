package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days14.Student;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오후 3:06:45
 *@subject      [시험]
 *@content
 */
public class Ex11 {

	public static void main(String[] args) throws IOException {
		// 1반 30명 학생의 성적처리
	    // Student 클래스 배열 선언
		// Student [] students = new Student [30]          days14.Ex08.java
		// Student [][] students = new Student [3][30]    days15.Ex01.java
		
		// 1) Student 클래스 사용
		// 2) 입력받는 순서 유지 - List : ArrayList 컬렉션 클래스
		ArrayList list = new ArrayList();
		
		int kor, eng, mat, tot, rank;
		String name;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		

		do {
			System.out.printf(" > %d번 이름, 국어, 영어, 수학 입력 ?", list.size()+1);
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
	        tot = kor + eng + mat;
	        avg =(double)tot/3;
	        rank = 1;
	        
	        Student s = new Student();
	        
	        s.name = name;
	        s.kor = kor;
	        s.eng = eng;
	        s.mat = mat;
	        s.tot = tot;
	        s.avg = avg;
	        s.rank = rank;
	        
	        list.add(s);
	        
	        System.out.print("> 학생 입력 계속?");
	        con = (char)System.in.read();
	        System.in.skip(System.in.available());
	        
		} while (Character.toUpperCase(con)=='Y');

		procRank(list);
		
		dispStudentInfo(list);
		
		

	} // main

	private static void procRank(ArrayList list) {
		Iterator ir= list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			s.rank = 1;
			Iterator ir2= list.iterator();
			while (ir2.hasNext()) {
				Student s2 = (Student) ir2.next();
				if(s.tot <s2.tot) s.rank++;				
			}
			
		}
		
	}

	private static void dispStudentInfo(ArrayList list) {
		System.out.printf("총%d 명 \n", list.size());
		Iterator ir= list.iterator();
		int cnt = 1;
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.printf("%d 번",cnt++ );
			s.dispInfo();
		}
		
	}

} // class







