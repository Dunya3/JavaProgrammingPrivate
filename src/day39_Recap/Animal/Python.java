package day39_Recap.Animal;

public class Python extends WildAnimal{
    public Python(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    public void changeSkin(){
        System.out.println(getName()+ "changing skin");
    }
}
