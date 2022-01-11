package CH18_1;

public class Company {

	// 클래스 내부에 유일한 private 인스턴스를 생성한다.
	// 동일한 회사가 여러 개일 수는 없다.
	// 따라서 인스턴스가 단 한 개만 생성되어야 하는 경우 싱글톤 디자인 패턴을 사용한다.
	private static Company instance = new Company();
	
	// 생성자는 private으로 선언한다.
	private Company() {}
	
	// 유일한 객체를 외부에서 사용할 수 있도록 구현
	public static Company getInstance() {
		
		if( instance == null) {
			instance = new Company();
		}
		return instance;
		
	}
}
