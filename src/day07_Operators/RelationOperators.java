package day07_Operators;

public class RelationOperators {
    public static void main(String[] args) {
    // >, >=, < , <=

        boolean results = 200 > 40; // true
        System.out.println("results = " + results);

        boolean results2 = 300 >= 150 ; // true

        System.out.println("results2 = " + results2);

        boolean results3 = 100 >= 100; //true

        System.out.println("results3 = " + results3);

        boolean results4 = 300 >= 500;//false

        System.out.println("results4 = " + results4);

        // credit score of 720 
        int creditScore = 745;
        
        boolean isEligibleFloLoan = creditScore >= 720;// if the credit score is 720 or greater,
                                                      // then it's eligible for the loan

        boolean  results5 = 100 < 200; //true
        System.out.println("results5 = " + results5);
        
        boolean results6 = 200 < 180; // false
        System.out.println("results6 = " + results6);
        
        int score = 59;
        boolean hasFailed = score <= 59;// false
                          // 75 <= 59
        System.out.println("hasFailed = " + hasFailed);
        
        boolean result7 = 45 <= 60;

        System.out.println("-------------------------------------");
       
        int x = 100;
        int y = 200;
        
        boolean equal =  x==y;//false 
        //              100 == 200 
        
        System.out.println("equal = " + equal);
         boolean result8 = "Muhtar" == "Good Guy"; //false

        System.out.println("result8 = " + result8);
        
        boolean result9 = 'A' == 'a';// false 

        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);

        // " Heloo World . " heloo world " ==> false

        System.out.println("-------------------------------------------");

       boolean result11 = 100 != 200.5; // true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false
        System.out.println("result13 = " + result13);




    }
}
