package CH10_1;

public class BirthDay {
	// 같은 클래스 내부에서만 접근 가능 (외부 클래스, 상속 관계의 클래스에서도 접근 불가)
	// get()/set() 메서드를 사용하여,
	// private으로 선언된 멤버 변수 (필드)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공
	private int day; 
	private int month;
	private int year;
	
	// boolean의 default 값은 false이다.
	private boolean isValid;
	
	public void setDay(int day) {
		this.day = day; 
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		// 1월 ~ 12월 이외의 달의 값이 들어오면 isValid = false로 설정.
		if ( month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		
		if (isValid) {
			System.out.println( year + "년 " + month + "월 " + day + "일 입니다."  );
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다");
		}
	}
}
