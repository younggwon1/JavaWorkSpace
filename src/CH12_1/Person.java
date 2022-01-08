package CH12_1;

/**
 * 
 * 객체 자신을 가리키는 this
 *
 */
public class Person {

	String name;
	int age;
	
	// 생성자에서 다른 생성자를 호출 하는 this
	public Person() {
		this("이름 없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public void showPerson() {
		
		System.out.println(name +  ", " + age);
		
	}
	
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "James";
		p.age = 37;
		
		Person p2 = p.getPerson();
		p.showPerson();
		p2.showPerson();
		System.out.println(p);
		System.out.println(p2);

	}
}
