package day39_Recap.Animal;

public class Animal {

    private String name, breed, color, size;
    private char gender;
    private int age;

    public Animal(String name, String breed, String color, String size, char gender, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setSize(size);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(0);

        }


            this.name = name;
        }

        public void setBreed (String breed){
            if (breed == null || breed.isBlank() || breed.isEmpty()) {
                System.err.println("Invalid breed");
                System.exit(1);
            }
            this.breed = breed;
        }

        public void setColor (String color){
            if (color == null || color.isBlank() || color.isEmpty()) {
                System.err.println("Invalid color");
                System.exit(1);
            }
            this.color = color;
        }

        public void setSize (String size){
            this.size = size;
        }

        public void setGender ( char gender){
        if (!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender");
            System.exit(1);
        }
            this.gender = gender;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public void eat(){
            System.out.println(getName()+ "is eating");
    }

    public void drink(){
        System.out.println(getName()+ "is drinking");

    }

    public void sleep(){
        System.out.println(getName()+ "is sleeping");

    }

    public void move(){
        System.out.println(getName()+ "is moving");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()


	2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()

	3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()


	4. Create the following sub classes of FriendlyAnimal and Override the eat method
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


	5. Create the following subclasses of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile


	6. Create a class named Zoo:
			Create the objects of each subclasses and

			test all the functions of each objects

            Analyze the relationships between the classes
 */