package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Tim", "Pomski", 'M', 1,"Small","Black");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();
        //dog.scratch();

        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo( "Sima","British", 'F',3,"Small","silver" );

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        //cat.bark();
        //cat.hunt();
        cat.scratch();

        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("Mile", "Bengal",'M',4,"Large", "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        //tiger.hunt();

        System.out.println(tiger);
    }
}
