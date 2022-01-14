package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'E'; i++) {

            if(i == 'C'){
               continue;
            }
            System.out.println(i); // A B D E

            System.out.println("-------------------------");

            //print all even numbers 1~10 (skip odd numbers)

             for (int j = 1; j < 11; j++) { // condition for odd
                if(j%2 != 0) // 1, 3, 5, 7, 9
              continue; //Skip
                 System.out.println(j); //2 4 6 8 10
             }
            System.out.println("----------------------------");

            //print all odd numbers(skip even numbers

            for (int k = 1; k < 11; k++) { // condition for even
                if(k%2==0){ //2, 4, 6, 8, 10
                    continue;
                }

                System.out.println(k);


            }







        }
    }
}
