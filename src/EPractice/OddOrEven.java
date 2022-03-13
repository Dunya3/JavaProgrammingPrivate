package EPractice;

public class OddOrEven {

    public static void main(String[] args) {

        oddOrEven(6);
        oddOrEven(5);

    }

    public static void oddOrEven(int num){
          if (num % 2 == 0 ){
              System.out.println("IS EVEN " + num);
          }else{
              System.out.println("IS Odd"  +num);
          }

      }



}



/*
Write a method which can identifies given number is even or odd
EX:
identify(5) ->"Odd"
identify(6) ->"Even"

 */