package Practice_If_Nef_Trn;

public class Passenger {
    public static void main(String[] args) {

        int passengers = 100;
        String results = "";


        int totalPassenger = 100;
        String result = "";

        if (totalPassenger == 50 || totalPassenger == 75 || totalPassenger == 100){

            if (totalPassenger == 50){
                result = "20 crew, 30 passengers";
            }else if (totalPassenger == 75){
                result = "25 crew, 50 passengers";
            }else{
                result = "30 crew, 70 passengers";
            }


        }else{
            result = "Number of people on the ship is not valid";
        }

        System.out.println(result);









    }
}
/*
Create a class called CrewAndPassenger,
 Given a number of people on the ship (int number),
 determine how many need to be crew members and how many can be passengers.
 Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


 */