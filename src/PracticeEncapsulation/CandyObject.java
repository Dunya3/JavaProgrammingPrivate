package PracticeEncapsulation;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class CandyObject {
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();

      candies.add(new Candy("Milka", 89, -5.5, false));
      candies.add(new Candy("Snikers", 49, 2.3,true));
      candies.add(new Candy("Bounty", 500, 2.80, false));
      candies.add(new Candy("Twix", 309, 3.43, false));

        for (Candy candy : candies){
            System.out.println(candy.getBrand() + " : "+ candy.getPrice());
        }




    }
}
