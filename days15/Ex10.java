package days15;

/**
 * @author SIEUN
 *@date2024. 1. 19. - 오후 4:32:56
 *@subject
 *@content
 */
public class Ex10 {

	public static void main(String[] args) {

		Document doc1 = new Document();
		// "Noname1" 문서가 생성되었습니다.
		Document doc2 = new Document("Sample.txt");
		// "Sample.txt" 문서가 생성되었습니다.
		Document doc3 = new Document();
		// "Noname2" 문서가 생성되었습니다.
		Document doc4 = new Document();
		// "Noname3" 문서가 생성되었습니다.



		System.out.println("end");


	} // main


} // class

// 보통 문서
class Document{

	String fileName = "Noname";
	static int count = 1;
	
	/*
	{
		// 인스턴스 초기화 블럭 -> 객체가 생성될때마다 생성자 보다 먼저 호출됨!
		count++;
	}
    */
	public Document() {
		// Cannot refer to an instance field count while explicitly invoking a constructor  생성자에서 인스턴스 변수 사용 불가
		this(String.format("%s%d.txt", "Noname",count++));
	}

	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("\"%s\" 문서가 생성되었습니다.\n", this.fileName);
	}


}