package day39_Recap.Animal;

public class FriendlyAnimal extends Animal {

    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;



    public FriendlyAnimal(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        if (wild == true){
            System.out.println("is Wild");
        }
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        if (friendly == true){
            System.out.println("is Friendly");
        }
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void play() {
        System.out.println(getName() + "is playing");
    }

    public void pet() {
        System.out.println(getName() + "is pet");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */