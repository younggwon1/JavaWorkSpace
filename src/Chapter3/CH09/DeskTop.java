package Chapter3.CH09;

public class DeskTop extends Computer{

	// 상위 클래스인 Computer의 추상 메서드를 하위 클래스에서 @Override하여 구현한다.
	@Override
	void display() {
		System.out.println("DeskTop display");
	}

	// 상위 클래스인 Computer의 추상 메서드를 하위 클래스에서 @Override하여 구현한다.
	@Override
	void typing() {
		System.out.println("DeskTop typing");
	}

	// 일반적인 재정의
	@Override
	public void turnOff() {
		System.out.println("Desktop turnoff");
	}
}