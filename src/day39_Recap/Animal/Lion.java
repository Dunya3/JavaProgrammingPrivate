package day39_Recap.Animal;

public class Lion extends WildAnimal{
    public Lion(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        super.hunt();
    }
    public void napping(){
        System.out.println(getName()+ "is napping");
    }
}
/*
5. Create the following subclasses of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile
 */