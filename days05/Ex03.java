package days05;

import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 5. - 오전 11:33:18
 *@subject    컴퓨터 - 사용자(USER)
 *@content     [가위(1), 바위(2), 보(3) 게임] - 시험
 *                  컴퓨터는 게임을 할 때마다 임의의 수(1~3) 발생
 *                  사용자는 1~3 입력.
 */
public class Ex03 {

	public static void main(String[] args) {

		int user;
		int com = (int)(Math.round(0)*3+1);
		String [] rps = {"", "가위", "바위", "보"};
	
		try(Scanner scanner = new Scanner(System.in)) {
			user= scanner.nextInt();
			System.out.print(">가위(1), 바위(2), 보(2) 입력");
			System.out.printf("%d(%s)\n", com, rps[com]);

			System.out.printf("컴퓨터 : %s, 사용자 : %s\n", rps[com], rps[user]);

			switch (user-com) {
			case -2:case 1:
				System.out.println("사용자승리");
				break;
			case -1:case 2:
				System.out.println("컴퓨터승리");
				break;
			default:
				System.out.println("무승부");
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}




	} // main

} // class
