package CH08_1;

/**
 * 
 * 키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
 *
 */
public class Object1 {
	
	int tall, weight, age;
	String name;
	
	// 기본 생성자
	public Object1() {
		
	}
	
	public Object1 (int tall, int weight, int age, String name) {
		this.tall = tall;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	




	public String showUserInfo() {
		return "키가 " + tall +  "이고 몸무게가 " + weight + "킬로인 남성이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.";
	}
}
