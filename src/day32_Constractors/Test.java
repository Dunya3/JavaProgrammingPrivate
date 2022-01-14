package day32_Constractors;

public class Test {

    public Test(){// A
        System.out.println("A");
    }

    public Test(int a){ //A B
        System.out.println("B");
    }

    public  Test(double a){ //A B C
        System.out.println("C");
    }

    public Test(String str){ //A B C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args){

        new Test("Java");
    }
}
