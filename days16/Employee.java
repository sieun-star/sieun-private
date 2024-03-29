package days16;

// [사원 클래스]
// 모든 사원들이 공통적으로 가져야할 멤버(필드,메서드)를 구현한 클래스
public abstract class Employee extends Object{
// 객체를 생성할 수 없는 불완전한 클래스 abstract
	
	// 필드
	private String name; // 사원명
	private String addr; // 주소
	private String tel; // 연락처
	private String hiredate; // 입사일자
	
	// 생성자
	public Employee() {
		System.out.println("> Emplyee 디폴트 생성자 호출됨.");
	}
	
	public Employee(String name, String addr, String tel, String hiredate) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate= hiredate;
		System.out.println("> Emplyee 4 생성자 호출됨.");
	}

	// Getter, Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	// 사원의 정보를 출력하는 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n", this.name, this.addr, this.tel, this.hiredate);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", addr=" + addr + ", tel=" + tel + ", hiredate=" + hiredate + "]";
	}

	/*
	@Override
	public String toString() {
		return String.format(">사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n", this.name, this.addr, this.tel, this.hiredate);
	}
	*/
	
	// 급여 계산 메서드
	// 가상(virtual) 메서드
	/*
		public int getPay() {
			return 0;
		}
    */
	
	// {} 몸체는 상속받는 클래스에서 재정의해서 사용하면 되기에 {} 몸체 아예 구현하지 않겠다.
	public abstract int getPay() ;
	
	
	
} // class






