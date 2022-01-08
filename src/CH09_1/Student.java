package CH09_1;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		this.studentID = id;
		this.studentName = name;
		
		// Subject를 그냥 사용할 수 없다.
		// 실질적으로 Subject를 생성하여 사용해야한다.
		korea = new Subject();
		math = new Subject();
	}
	
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentSocre() {
		int total = korea.score + math.score;
		System.out.println(studentName +  " 학생의 총점은 " + total + "점 입니다." );
		
	}
}
