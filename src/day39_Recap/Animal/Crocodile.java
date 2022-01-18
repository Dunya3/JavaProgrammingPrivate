package day39_Recap.Animal;

public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    public void getAngry(){
        System.out.println(getName()+ "getting angry very easy");
    }

}
