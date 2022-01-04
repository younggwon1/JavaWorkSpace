package CH04_1;

public class Student {
	
	public int studentID;
	public String studentName;  
	public String address;
			
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	// 학생 이름 반환
	public String getStudentName() {
		return studentName;
	}
	
	// 학생 이름 지정
	public void setStudentName(String name) {
		studentName = name;
	}
}