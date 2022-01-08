package CH14_1;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	// constructor(생성자) 생성
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 버스를 탄다.
	// 어떤 버스를 타는지 매개변수로 받는다.
	// 학생의 돈이 소비가된다.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// 학생이 지하철을 탄다.
	// 어떤 지하철을 타는지 매개변수로 받는다.
	// 학생의 돈이 소비가된다.
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
		
	public void showInfo() {
		System.out.println(studentName +"님의 남은 돈은 " + money + "원 입니다");
	}
}
