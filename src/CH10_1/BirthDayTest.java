package CH10_1;

/**
 * 
 * 접근 제어 지시자(access modifier)와 정보은닉(infomation hiding)
 *
 */
public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		
		date.setYear(2019);
		date.setMonth(13);
		date.setDay(1);
		
		date.showDate();
		
	}
}
