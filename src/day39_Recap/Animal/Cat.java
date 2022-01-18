package day39_Recap.Animal;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "is eating");
        super.eat();
    }

    public void scratch(){
        System.out.println(getName()+ "is scratching");
    }

    public void meow(){
        System.out.println(getName()+ "is meow");
    }
}
/*
	2. Cat:
					Extra methods:
						scratch()
						meow()
 */