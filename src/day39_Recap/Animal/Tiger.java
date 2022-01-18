package day39_Recap.Animal;

public class Tiger extends WildAnimal {
    public Tiger(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    public void chase(){
        System.out.println(getName()+ "is chasing");
    }
}
