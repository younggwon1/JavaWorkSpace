package Chapter4.CH04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
						ClassNotFoundException, NoSuchMethodException, SecurityException {
		Person person = new Person("James");
		System.out.println(person);
		
		System.out.println("-------------------------------------------------");
		
		Class c1 = Class.forName("Chapter4.CH04.Person");
		Person person1 = (Person)c1.newInstance();
		person1.setName("Lee");
		System.out.println(person1);
		
		System.out.println("-------------------------------------------------");
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"김유신"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
	}
}