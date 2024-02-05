package days14;

public class Student {
	
    // Alt + Shift + S
	public Student() { }
	
	public Student(int kor, int eng, int mat, int tot, int rank, int wrank, String name, double avg) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.wrank = wrank;
		this.name = name;
		this.avg = avg;
	}

	// field
	// [인스턴스 변수]
	public int kor, eng, mat, tot, rank,wrank;
	public String name;
	public double avg;
	
	// Alt + Shift + A 
	// method
	public void dispInfo() {
		System.out.printf("\t%s\t%d\t%d\t%d\t%d\t%.2f\t %d등\t%d등\n",
		          name,
		          kor,
		          eng,
		          mat,
		          tot,
		          avg,
		          rank,
		          wrank);
	}
	
	
}
