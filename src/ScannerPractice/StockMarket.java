package ScannerPractice;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ask the user how many total shares they have already?");

        int totalShares = input.nextInt();

        System.out.println("Ask the user how much their total value in the stock market is");

        double stockMarket = input.nextDouble();

        System.out.println("Ask the user to enter the name of the company they have the most shares");
        String company = input.nextLine();

        input.nextLine();

        if (totalShares >= 0 && stockMarket >= 0){
            System.out.println("Your total stock market holding is $" +stockMarket + " which is made up of shares" +totalShares+ "Apple INC is your company holdings");
        }else {

        }






      input.close();


    }
}
/*
7. StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */