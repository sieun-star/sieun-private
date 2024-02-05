package days15;

// 저축관련 필드, 메서드 구현된 클래스
public class Save {

	// 필드
	// 인스턴스 변수
	private String name; // 예금주
	private int money;    // 예금액
	
	// 클래스 변수
	// 공유 변수 
	// 스태틱 변수 - 값을 클래스에 하나만 만들어서 다른 인스턴스와 공유
	private static double rate = 0.04; // 예금이자율
	
	// 생성자
	public Save() { }
	public Save(String name, int money, double rate) { 
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		Save.rate = rate; // static 메서드에서는 this 사용 불가!! 클래스명 사용
	}
	
	
	
	
	// 메서드
	public void dispSave() {
		System.out.printf(" 예금주:%s , 예금액:%d, 이자율:%.2f\n", this.name, this.money, this.rate);
	}
	
	
}
