package day39_Recap.Animal;

public class Dolphin extends FriendlyAnimal {
    public Dolphin(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "is eating");
        super.eat();
    }

    public void swim(){
        System.out.println(getName()+ "is swimming");
    }


}
/*
Create the following subclasses of FriendlyAnimal and Override the eat method
	3. Dolphin:
					Extra methods:
						swim()
 */