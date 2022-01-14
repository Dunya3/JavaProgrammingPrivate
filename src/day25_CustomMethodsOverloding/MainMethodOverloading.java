package day25_CustomMethodsOverloding;

public class MainMethodOverloading {


        public static void main(String[] args) {
            System.out.println("String");
        }

        public static void main(int[] args) {
            System.out.println("int");
        }

        public static void main(double[] args) {
            System.out.println("double");
        }

        public static void main(char[] args) {
            System.out.println("char");
        }
}
/*
1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}
	    2. create a return method called addDouble that can add a double after the last index of a double array
	    3. create a return method called addString that can add a String after the last index of a String array
	    4. create a return method called addChar that can add a char after last index of a char array
 Method Overloading: multiple different methods sharing the same method name
 			same method name, different parameters

 			return type, access modifiers and specifiers can be same or can be different

 			Advantage:
 				1. easy to memorize
 				2. easy to read
 				3. reusable
 				4. flexible

 */