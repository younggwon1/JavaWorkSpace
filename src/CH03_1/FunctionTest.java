package CH03_1;

public class FunctionTest {
	
	// 반환 값 o , 매개변수 o
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// 반환 값이 없을 경우 반환 타입을 void로 선언, 매개변수 o
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 반환 값 타입은 int, 매개변수는 x
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		sayHello("안녕하세요");
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
	}
}
