package Chapter3.CH15.proj3;

public interface Queue {

	// 추상 메서드 구현
	void enQueue(String title);
	
	String deQueue();
	
	int getSize();
}