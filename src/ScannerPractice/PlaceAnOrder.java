package ScannerPractice;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name");

        String name = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        System.out.println("Enter the first name");
        String firstname = input.next();

        System.out.println(firstname + " your order for " + quantity + name + "has been place" +
        "Your total is" + (quantity * price));

        input.close();
    }
}

