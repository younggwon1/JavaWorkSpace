package CH18_1;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		// 일반 메서드로 호출하기 위해서는 new Company();를 하고 getInstance() 메서드를 호출해야한다.
		// 하지만 인스턴스를 생성하지않고 바로 getInstance() 메서드를 사용할 것이므로, static 메서드로 제공이되어야한다.
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
	}
}