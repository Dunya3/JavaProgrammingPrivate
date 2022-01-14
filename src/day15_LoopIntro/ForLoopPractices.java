package day15_LoopIntro;

public class ForLoopPractices {
    public static void main(String[] args) {
       // 15 16 17 18 .....45

        for (int i = 15; i <= 45; i++){ // i:15 16 17 18 .....45
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("--------------------------------------");

     // 100 99 98 97 ... 50
        for(int i = 100; i > 49; i--){ // i: 100, 99, 98... 50  (>=, <=, >, <)
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("-------------------------------");
      // print all the even numbers between 1 ~ 55

       for(int i =1; i <= 55; i++){
           if(i % 2 == 0){
               System.out.print(i+" ");
           }
       }
        System.out.println("-------------------------------");
       // other way of doing this task
        System.out.println();
/// print all the even numbers between 1 ~ 55: 2, 4, 6, 8... 54

        for(int i = 2; i <= 54; i+= 2){ //i: 2, 4, 6, 8, 10...54
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");



      }



}
