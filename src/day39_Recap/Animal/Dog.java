package day39_Recap.Animal;

public class Dog  extends FriendlyAnimal{
    public Dog(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    public void bark(){
        System.out.println(getName()+ "is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "is eating");
        super.eat();
    }
}
/*
4. Create the following subclasses of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

				2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */