package Interface;

public class Dinga implements Person {
	public void eat() {
		System.out.println("Eating Food");
	}

	public static void main(String[] args) {
		System.out.println(Person.id);
		Dinga d = new Dinga();
		d.eat();
		d.equals(d);
	}
}
