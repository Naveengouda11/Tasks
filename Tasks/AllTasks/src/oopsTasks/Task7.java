package oopsTasks;

class Animal {
	void sound() {
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal {
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal {
	void sound() {
		System.out.println("cat meow");
	}
}
class Cow extends Animal {
	void sound() {
		System.out.println("cow noise");
	}
}

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog();
		a1.sound();
		Animal a2 = new Cat();
		a2.sound();
		Animal a3 = new Cow();
		a3.sound();
		

	}

}
