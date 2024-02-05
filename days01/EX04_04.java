package days01;

public class EX04_04 {

	public static void main(String[] args) {
	
		String name = "홍길동";
		int age = 27-5;
		
		//출력형식 = 이름은 "이시은"이고, 나이는 27살이다.
		//System.out.printf("출력형식", 매개변수값...);
		//String %s
		//int %d
		System.out
		.printf("이름은 \"%s\"이고, 나이는 %d살이다.",name, age)
		.println("종료");

	}

}
