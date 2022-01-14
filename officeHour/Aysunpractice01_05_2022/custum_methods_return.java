package Aysunpractice01_05_2022;

public class custum_methods_return {


        public static void main(String[] args) {
            sum(5,4);
            System.out.println(sum1(5,4));
        }
        public static void sum(int a, int b){
            System.out.println(a+b);
        }
        public static int sum1(int a, int b){
            return a+b;
        }
}
