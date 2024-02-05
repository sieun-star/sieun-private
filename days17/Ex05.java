package days17;

/**
 * @author SIEUN
 *@date2024. 1. 23. - 오전 11:05:05
 *@subject      싱글톤(Singleton)패턴 - 선언하는 방법 시험!
 *                    1. 생성자 private 선언
 *                    2. getInstance 메서드 static으로 만든다.
 *                    3. 자기자신 객체를 저장할 private static BoardDAO boardDAO 선언
 *                    4. getInstance 메서드 안에서 객체가 있는지 없는지 확인 후 객체 생성 
 *                    
 *@content     장점, 단점
 *                   오직 1개의 객체를 생성해서 사용하는 패턴
 */
public class Ex05 {

	public static void main(String[] args) {
		// A 작업자 BoardDAO객체를 사용해서 DB처리(CRUD)
		// The constructor BoardDAO() is not visible
		BoardDAO dao1 = BoardDAO.getInstacne(); //new BoardDAO();
		//                               해시코드
		System.out.print(dao1.hashCode() + " " );
		dao1.insert();
		
 		// B 작업자 BoardDAO객체를 사용해서 DB처리(CRUD)
		BoardDAO dao2 = BoardDAO.getInstacne(); //new BoardDAO();
		System.out.print(dao2.hashCode() + " " );
		dao2.delete();
		
		// C 작업자 BoardDAO객체를 사용해서 DB처리(CRUD)
		BoardDAO dao3 = BoardDAO.getInstacne(); //new BoardDAO();
		System.out.print(dao3.hashCode() + " " );
		dao3.update();
		
		// D 작업자 BoardDAO객체를 사용해서 DB처리(CRUD)
		BoardDAO dao4 = BoardDAO.getInstacne(); //new BoardDAO();
		System.out.print(dao4.hashCode() + " " );
		dao4.select();
		

	} // main

} // class

// [Date Access Object]
// DataBase < - > data CRUD(create, read, update, delete)
// 싱클톤 패턴
class BoardDAO{
	
	// 생성자의 접근지정자 : private 수정
	// 해당 클래스 외에서는 생성자를 호출할 수 없기에 객체 생성은 못한다.
	private BoardDAO() {}
	
	private static BoardDAO boardDAO = null;
	
	// synchronized 동기화 처리된 메서드 ( 동시사용 X )
	public synchronized static BoardDAO getInstacne() {
		if (boardDAO==null) {
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	
	void insert() {
		System.out.println("추가");
	}
	void update() {
		System.out.println("수정");
	}
	void delete() {
		System.out.println("삭제");
	}
	void select() {
		System.out.println("조회");
	}
}