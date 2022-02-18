package day46_Polymorphsm;


import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Car;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;

public class CarObjects {
    public static void main(String[] args) {

        Car toyota1 = new Toyota("Highlander", 2010, 25000, "White", 255000);
        Car bmw1 = new BMW("X5", 2014, 32000, "Red", 12000);
        Car toyota2 = new Toyota("Corolla", 2011, 20000, "White", 310000);
        Car bmw2 = new BMW("M3", 2015, 33000, "Blue", 14030);
        Car bmw3 = new BMW("M5", 2017, 35000, "Black", 15000);
        Car bmw4 = new BMW("M4", 2018, 40000, "White", 19000);
        Car bmw5 = new BMW("7 Series", 2009, 30000, "Purple", 21000);
        Car bmw6 = new BMW("i3", 2011, 30000, "Black", 9000);
        Car toyota3 = new Toyota("Camry", 2018, 30000, "Red", 185000);
        Car toyota4 = new Toyota("Rav4", 2012, 23000, "Red", 285000);
        Car toyota5 = new Toyota("Avalon", 2019, 35000, "Blue", 175230);
        Car tesla1 = new Tesla("Model 3", 2015, 45000, "White", 235000);
        Car tesla2 = new Tesla("Model Y", 2017, 65000, "Black", 135000);
        Car tesla3 = new Tesla("Model X", 2016, 48000, "White", 235000);
        Car tesla4 = new Tesla("Model X", 2014, 48000, "White", 236000);

        Car[] cars = {tesla1,toyota2,toyota3,toyota4,toyota5,bmw1,bmw2,bmw3,bmw4,bmw5,bmw6,tesla1,tesla2,tesla3,tesla4};

        for (Car each : cars) {
            if(each.brand.equals("Toyota") && each.year>=2010 && each.year<=2011){
                System.out.println(each.model+" is ready to be recalled");
            }
            if(each.brand.equals("BMW") && each.year>=1929 && each.year<=2022){
                System.out.println(each.model+" is ready to be recalled");
            }
            if(each.brand.equals("Tesla") && each.year>=2015 && each.year<=2016){
                System.out.println(each.model+" is ready to be recalled");
            }
        }

        int minMileage = Integer.MAX_VALUE;

        int maxMileage = Integer.MIN_VALUE;

        for (Car each : cars) {
            if(each.miles>maxMileage){
                maxMileage=each.miles;
            }
        }
        System.out.println("maxNumber = " + maxMileage);

        for (Car each : cars) {
            if(each.miles<minMileage){
                minMileage=each.miles;
            }
        }
        System.out.println("minNumber = " + minMileage);



        }



    }

/*
1 Given the following array that contains the car objects:
				Car[] cars = {
		                new Toyota("Highlander", 2010, 25000, "White", 255000),
		                new BMW("X5", 2014, 32000, "Red", 12000),
		                new Toyota("Corolla", 2011, 20000, "White", 310000),
		                new BMW("M3", 2015, 33000, "Blue", 14030),
		                new BMW("M5", 2017, 35000, "Black", 15000),
		                new BMW("M4", 2018, 40000, "White", 19000),
		                new BMW("7 Series", 2009, 30000, "Purple", 21000),
		                new BMW("i3", 2011, 30000, "Black", 9000),
		                new Toyota("Camry", 2018, 30000, "Red", 185000),
		                new Toyota("Rav4", 2012, 23000, "Red", 285000),
		                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
		                new Tesla("Model 3", 2015, 45000, "White", 235000),
		                new Tesla("Model Y", 2017, 65000, "Black", 135000),
		                new Tesla("Model X", 2016, 48000, "White", 235000),
		                new Tesla("Model X", 2014, 48000, "White", 236000),
		        };

		        (import them from day43 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest mileage

			1.3 Write a program that can display the car that has the lowest mileage

 */