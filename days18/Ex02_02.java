package days18;

/**
 * @author SIEUN
 *@date2024. 1. 24. - 오전 10:51:36
 *@subject      Object 메서드
 *@content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		// 현실에서는 주민번호가 동일하면 같은 사람이다.
		Person p1 = new Person("234", "김길동");
		Person p2 = new Person("111", "홍길동");

		//[Thread method]
		// Object.notify(), Object.notifyAll();
		// Object.wait()
		
		
		// The method clone() from the type Object [is not visible]
		// Objcet.clone()
		//[5.Object.clone()]
		try {
			// Person p1Clone = (Person) p1.clone();
			Person p1Clone = p1.clone(); // 다운캐스팅 할 필요가 없다.
			System.out.println(p1Clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		/*
		//[4.Object.toString()]
		// "객체의 풀네임@hashcod()의 16진수값"
		System.out.println(p1.toString());  //days18.Person@73a28541
		System.out.println(p2); //days18.Person@6f75e721
		
		System.out.println(Integer.toHexString(561247961));
		*/
		
		/*[3.Object.hashCode()]
		System.out.println(p1.hashCode()); // 561247961
		System.out.println(p2.hashCode()); // 813656972
		*/
		
		/* [2.Object.getClass()]
		// 제네릭<>
		// Class<? extends Person>  cls = p1.getClass();
		Class cls = p1.getClass();
		String fullName =cls.getName();
		System.out.println( fullName ); //days18.Person
		String packageName = cls.getPackageName();
		System.out.println(packageName); // days18
		String className = cls.getSimpleName();
		System.out.println(className); // Person
		*/
		
		
	} // main

} // class


class Person implements Cloneable{
	
	String rrn;
	String name;
	
	
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}


	// 정보를 출력하는 메서드 dispPerson()  X
    // toString() 메서드를 오버라이딩해서 그 객체의 정보를 출력하는 용도로 사용
	@Override
	public String toString() {
		// return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("> RRN:%s, Name:%s", rrn,name);
	}


	// Person pclone = p1.clone()
	// 얕은 복제 ***
	// 깊은 복제
	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person pclone = null;
		// Type mismatch: cannot convert from Object to Person
		pclone = (Person) super.clone(); // 다운캐스팅
		return pclone;
	}
	*/
	
	// JDK1.5 공변반환타입 추가
	// Object 클래스의 clone() 메서드를 오버라이딩했기 때문에 리턴타입은 Object라야 되지만
	// 재정의 하는 자식클래스의 타입으로 변경이 가능하도록 문법을 추가
	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person pclone = null;
		// Type mismatch: cannot convert from Object to Person
		pclone = (Person) super.clone(); // 다운캐스팅
		return pclone;
	}
	/*
	@Override
	protected Person clone() {
		Person pclone = null;
		// Type mismatch: cannot convert from Object to Person
		try{
		pclone = (Person) super.clone(); // 다운캐스팅
		}catch(CloneNotSupportedException e){
		}
		return pclone;
	}
	*/
	
	
	
}











