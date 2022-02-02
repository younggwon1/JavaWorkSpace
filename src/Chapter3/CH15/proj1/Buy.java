package Chapter3.CH15.proj1;

public interface Buy {

	void buy();
	
	default void order() {
		System.out.println("구매 주문");
	}
}