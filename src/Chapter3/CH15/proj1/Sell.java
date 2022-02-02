package Chapter3.CH15.proj1;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}
}