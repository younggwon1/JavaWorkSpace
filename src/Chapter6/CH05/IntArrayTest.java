package Chapter6.CH05;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		// 각각의 연산을 하기 위해서는 각 연산의 stream을 생성해야한다.
		int sumVal = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
	}

}