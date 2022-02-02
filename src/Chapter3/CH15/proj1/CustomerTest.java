package Chapter3.CH15.proj1;

public class CustomerTest {

	public static void main(String[] args) {

		// Customer 인스턴스 생성
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayHello();
		customer.order();
		
		// 업 캐스팅
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		// 업 캐스팅
		Sell seller = customer;
		seller.sell();
		seller.order();
	}
}