package CH14_1;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	// 버스 생성자 생성
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 버스 승차에 따른 로직.
	public void take(int money) {  
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
	}
}
