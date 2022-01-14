package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a1 =10;
        int b1 = 15;
        int temporary = a1;

        a1=b1;
        b1=temporary;

        System.out.println("a = " + a1); // 15

        System.out.println("b = " + b1);//10


        int a3 = 15;
                int b3 = 10;

                boolean result = a3 > b3 ;
        System.out.println("result = " + result);

        int a2 = 15;
        int b2 = 10;

        int result2 = 10 + 15;
        System.out.println("10 + 5 = ");

       boolean equal = 10 == 15;
        System.out.println("equal = " + equal);

        System.out.println("---------------------------------");

        // Muhtar notes test result:

        int a = 10;
        int b = 15;
//-----------------------------------
        int c = b; // c= 15;

        b = a; //b= 10
        a = c;
//--------------------------------------
        System.out.println("a = " + a); // 15
        System.out.println("b = " + b); // 10











    }
}
/*1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */