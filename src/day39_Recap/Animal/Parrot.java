package day39_Recap.Animal;

public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void fly(){
        System.out.println(getName()+ "is flying");
    }

    public void sing(){
        System.out.println(getName()+ "is singing");
    }
}
/*
Create the following subclasses of FriendlyAnimal and Override the eat method
			4. Parrot:
					Extra methods:
						fly()
						sing()

 */