package days17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author SIEUN
 *@date2024. 1. 23. - 오후 3:32:49
 *@subject      [다중 catch문]
 *@content
 */
public class Ex13_02 {

	public static void main(String[] args) {
		int a = 0 , b = 0;
		Scanner scanner = new Scanner(System.in);

		// 예외 처리 방법 중 1가지. try~ catch , 상속관계시 자식예외가 위쪽으로 와야함!
		try {
			System.out.print("> a, b  두 정수 입력 ?");
			// InputMismatchException
			a = scanner.nextInt();
			b = scanner.nextInt();

			// ArithmeticException
			double c = a / b ; 
			System.out.printf("%d / %d = %.2f\n", a,b,c);

		}catch (InputMismatchException e) {
			System.out.println("입력 유효성 실패!");
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("=정상 종료=");

	} // main

} // class
