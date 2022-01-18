package Chapter3.CH04;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
	
	// 반환 값, 메서드 이름, 매개변수의 타입과 개수가 상위클래스의 함수 정의부분과 동일해야한다.!!
	// 동일하지 않을 경우 다른 메서드로 처리한다.
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		// 값을 할인해준다는 것이 상위 클래스의 메서드와 차이점이다.
		return price - (int)(price * salesRatio);
	}



	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다";
	}
}