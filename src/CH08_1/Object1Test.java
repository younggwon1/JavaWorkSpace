package CH08_1;

public class Object1Test {

	public static void main(String[] args) {
		
		Object1 object1 = new Object1();
		
		object1.age = 37;
		object1.name = "Tomas";
		object1.tall = 180;
		object1.weight = 80;
		
		System.out.println("object1.showUserInfo() : {} " + object1.showUserInfo());
		
		Object1 object2 = new Object1(195, 90, 25, "Sam");
		System.out.println("object2.showUserInfo() : {} " + object2.showUserInfo());
	
	}
}
