package CH08_1;

public class Object2Test {

	public static void main(String[] args) {
		
		Object2 object1 = new Object2();
		
		object1.address = "서울시 강남구 역삼동 111-333";
		object1.menuNum = 0003;
		object1.orderDate = "20201102";
		object1.orderId = "202011020003";
		object1.orderPrice = 35000;
		object1.orderTime = "130258";
		object1.phoneNum = 01023450001;

		System.out.println("object1.showUserInfo() : {} " + object1.showUserInfo());
	}

}
