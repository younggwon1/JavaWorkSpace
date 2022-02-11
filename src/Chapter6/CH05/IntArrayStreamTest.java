package Chapter6.CH05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// stream 생성
		// stream의 메서드 사용( EX) forEach )
		// 실행할 명령은 람다식으로 작성
		Arrays.stream(arr).forEach(n->System.out.print(n + "\t"));
		System.out.println();
		
		// 또 다른 연산을 하기 위해서는 새로운 stream을 생성해야한다.
		int sum  = Arrays.stream(arr).sum();
		System.out.println("sum: " + sum);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int sum2 = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println(sum2);
	}

}