package day31_Constructors;

public class Person {
    //istans variables
    public String name;
    public char gender;
    public int age;

    public Person(String name, char gender, int age){ // ovo je constractor
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
