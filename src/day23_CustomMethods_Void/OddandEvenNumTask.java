package day23_CustomMethods_Void;

public class OddandEvenNumTask {
    public static void main(String[] args) {
         oddNumbers(1, 100);
         evenNumbers(1,100);
    }
        public static void oddNumbers(int x,int y) {
            for (int i = x; i < y; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }

            }
            System.out.println("==============================");

        }
        public static void evenNumbers(int x, int y){
            for (int i = x; i < y; i++) {
                if(i % 2 == 0){
                    System.out.print(i+" ");
                }

            }
        }
     //1. create a method that can print odd numbers between 1~100 in a same line saperated by space
    //2. create a method that can print even numbers between 1~100 in a same line saperated by space

}
