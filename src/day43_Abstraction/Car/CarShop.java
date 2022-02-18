package day43_Abstraction.Car;

public class CarShop {
    public static void main(String[] args) {

    //Car car1 = new Car("Cydeo ", "25", "Blue", 2022,10000);
        // we can not create  object from Abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);


    }
}
