package CH23_1;

import java.util.ArrayList;

import CH21_1.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		// ArrayList 선언하기 
		ArrayList<Book> library = new ArrayList<Book>();
		
		// 객체 생성(new Book())해서 add한다.
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		for(int i =0; i<library.size(); i++) {
			library.get(i).showBookInfo();
		}
	}
}