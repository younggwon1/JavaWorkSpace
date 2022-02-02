package Chapter3.CH15.proj1;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");		
	}

	// default 메서드가 중복이 됐으므로 재정의를 해야하는 부분.
	// 밑의 2개처럼 재정의를 해도 되고, 직접 재정의를 해도된다.
	@Override
	public void order() {
		System.out.println("customer order");
	}

	// Buy 인터페이스의 default 메서드를 사용하겠다.
//	@Override
//	public void order() {
//		// TODO Auto-generated method stub
//		Buy.super.order();
//	}

	// Sell 인터페이스의 default 메서드를 사용하겠다.
//	@Override
//	public void order() {
//		// TODO Auto-generated method stub
//		Sell.super.order();
//	}
	
	
	public void sayHello() {
		System.out.println("Hello");
	}


}