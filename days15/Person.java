package days15;

public class Person {

	// ( field ) 멤버변수
	private String name;
	private int age;
	private boolean gender;
	
	// constructor 
	public Person() {}
	public Person(String name) {
		this.name = name; // 50개 필드 초기화
	}
	public Person(String name, int age) {
		//this();
		this(name); // 첫번째 라인, 생성자안에서 또 다른 생성자를 호출
		//this.name = name;
		// The assignment to variable age has no effect
		this.age = age;
	}
	
	// getter, setter   private 멤버에 접근하기 위한 메서드, 값을 설정할때 유효한 값을 설정하기 위해서
	public void setAge(int age) {
		if (age>=0 && age<=125) {
			this.age = age;
		}else {
			System.out.println("나이의 범위가 벗어났다.");
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public void dispPerson() {
		System.out.printf("> 이름:%s, 나이:%d\n", this.name, this.age);
	}
	
	
}
