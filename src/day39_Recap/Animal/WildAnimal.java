package day39_Recap.Animal;

public class WildAnimal extends Animal{

    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;

    public WildAnimal(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);

    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void setPlayable(boolean playable) {
        if (playable == true){
            System.out.println(getName()+ "is playable");
        }
        isPlayable = playable;
    }

    public void hunt(){
        System.out.println(getName()+ "is hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + getName()+ '\'' +
                ", breed='" + getBreed()+ '\'' +
                ", color='" + getColor()+ '\'' +
                ", size='" + getSize()+ '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge()+
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
 3. Create a subclass of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */