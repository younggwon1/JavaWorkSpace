package Chapter3.CH03;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio;
	
	/*public VIPCustomer() {
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		// 컴파일러가 자동적으로 호출이 됐다고하면, 현 코드에서는 자동적으로 호출될 수 있는 상황이 아니므로
		// 명시적으로 super() 키워드를 통해 호출해야한다.
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	public int getAgentID() {
		return agentID;
	}
}