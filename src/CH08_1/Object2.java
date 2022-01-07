package CH08_1;

/**
 * 
 * 
  	주문 접수 번호 : 202011020003
	주문 핸드폰 번호 : 01023450001
	주문 집 주소 : 서울시 강남구 역삼동 111-333
	주문 날짜 : 20201102
	주문 시간 : 130258
	주문 가격 : 35000
	메뉴 번호 : 0003
 *
 */
public class Object2 {

	int phoneNum, orderPrice, menuNum;
	String orderId, address, orderDate, orderTime;
	
	public String showUserInfo() {
		return "주문 접수 번호 : " + orderId 
				+ "주문 핸드폰 번호 : " + phoneNum 
				+ "주문 집 주소 : " + address 
				+ "주문 날짜 : " + orderDate 
				+ "주문 시간 : " + orderTime
				+ "주문 가격 : " + orderPrice
				+ "메뉴 번호 : " + menuNum;
	}
}
