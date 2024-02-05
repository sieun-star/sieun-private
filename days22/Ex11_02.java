package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days11.Ex05_03;
import days14.Student;

/**
 * @author SIEUN
 *@date2024. 1. 30. - 오후 3:38:08
 *@subject     [시험]
 *@content
 */
public class Ex11_02 {

	public static void main(String[] args) throws IOException {
		// 1반 30명 * 3반
		// X Student [][] students = new Student [3][30]    days15.Ex01.java 참고
		// -> 컬렉션 클래스 사용 수정
		ArrayList class1List = new ArrayList(); // sistList.get(0 ban-1)
		ArrayList class2List = new ArrayList(); // sistList.get(0)
		ArrayList class3List = new ArrayList(); // sistList.get(0)
		
		ArrayList sistList = new ArrayList();
		sistList.add(class1List);  // ArrayList 요소
		sistList.add(class2List);
		sistList.add(class3List);
		
		// 입력
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		Scanner scanner = new Scanner(System.in);
		char con = 'y';

		int ban;
		

		do {
			System.out.printf(" > 반 입력?");
			ban = scanner.nextInt();
			// 입력할 반 ArrayList
			ArrayList classList = (ArrayList) sistList.get(ban-1);
			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ?", ban,classList.size()+1);
			
		    name = Ex05_03.getName();
		    kor = Ex05_03.getScore();
		    eng = Ex05_03.getScore();
		    mat = Ex05_03.getScore();
		    tot = kor+eng+mat;
		    avg =(double)tot/3;
		    rank = wrank= 1;
		    
		    Student s = new Student(kor, eng, mat, tot, rank, wrank, name, avg);
		    
		   classList.add(s);
		    
			
			System.out.printf("> 입력 계속 ?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		
		
		// 출력
		dispStudentInfor(sistList);


	} // main

	private static void dispStudentInfor(ArrayList sistList) {
		//                              IntStream 객체 [3,2,1]
		// int totalStudent = sistList.stream().mapToInt(ArrayList::size).sum();;
	
		// System.out.printf("\t\t학생 정보 출력 ( %d명 )\n", totalStudent );
		
		int totalStudent = 0;
		
		Iterator ir = sistList.iterator();
		int ban = 1;
		while (ir.hasNext()) {
			ArrayList classList = (ArrayList) ir.next();
			totalStudent +=classList.size();
			System.out.println("=".repeat(40));
			System.out.printf("[%d반 학생 : %d명 ]\n", ban++ , classList.size());
			
			Iterator ir2 = classList.iterator();
			while (ir2.hasNext()) {
				Student s = (Student) ir2.next();
				s.dispInfo();
			}
		}
		System.out.printf("\t\t학생 정보 출력 ( %d명 )\n", totalStudent );
	}



} // class
