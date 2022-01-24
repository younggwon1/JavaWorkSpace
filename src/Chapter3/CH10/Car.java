package Chapter3.CH10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)을 정의하는 메서드
	// 해당 시나리오는 순서가 변하면 안됀다.
	// 따라서 하위클래스에서 재정의를 못하도록 final로 선언한다.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}