package Chapter3.CH15.proj3;

import java.util.ArrayList;

public class Shelf {

	 protected ArrayList<String> shelf;
	 
	 // 생성자가 호출될 때 멤버 변수 초기화
	 public Shelf() {
		 shelf = new ArrayList<String>();
	 }
	 
	 public ArrayList<String> getShelf(){
		 return shelf;
	 }
	 
	 public int getCount() {
		 return shelf.size();
	 }
	 
}