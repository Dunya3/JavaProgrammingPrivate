package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight: 160 pound
        // byte weight = 160; // byte weight = 160 is out of byte' range
        // byte num = -129; //-129 is out of byte' range

        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
       // short salary = 100000; // 100000 is out of short' range
        int  salary = 100_000; // int is the preferred data type for integer numbers

       long asset = 3_333_333_333_333L;

       // tax: 0.26
       float tax = 0.26F;

       double PI = 3.14;

      //#
        char ch1 =  '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 15000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';
        System.out.println(yesNo);

      //  char ch5 = 'AB'; char: can't take more than one characters

        boolean isEmployees = true;// boolean isMarried = maybe; only accept true or false
        boolean isMerried = false;

        boolean result = 100 > 300;

        System.out.println("isEmployees = " + isEmployees);
        System.out.println("isMerried = " + isMerried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);

        int num1 = 100;
        int num2 = 500;
        System.out.println();
        double salaryAfterTax = 2.5;
        //int salaryAfterTax = 2.5 only one name for variable,must be unique








    }
}
