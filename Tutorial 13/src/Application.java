
class Person {
	
	// Instance variables (data or "state")
	String name;
	int age;
	boolean alive;
	
	// Classes can contain
	
	// 1. Data
	// 2. Subroutines (methods)
}

public class Application {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.alive = true;
		
		Person person2 = new Person();
		person2.name = "Sarah Jane Smith";
		person2.age = 65;
		person2.alive = false;
		
		System.out.println(person1.name);
		
	}

}
