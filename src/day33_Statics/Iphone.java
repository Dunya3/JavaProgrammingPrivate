package day33_Statics;

public class Iphone {
    //static je zato sto je ime brenda isto za sve modele
    public static String brand = "Apple";

    //instans je zato sto je svaki model ima drugacije ime
    public String model;

    //cena je instance zato sto mozemo da dajemo drugaciju cenu za svaki posebno
    public double price;

    // ovde koristimo static zato sto je ios operator za sve modele
    public static String OS = "IOS";

    //za boju koristimo instance zato sto je npr. svaki drugacije boje
    public String color;

    // isto je instance zato sto je size razlicito u zavisnosti od modela
    public String size;

    // ovo je static zato sto su svi proizvedeni u kini
    public static  String madeIn = "China";

    // static zato sto svi imaju bateriju
    public static boolean hasBattery = true;

    // satic zato sto svi imaju touch
    public static boolean isTouchScreen = true;

    // static zato sto svi imaju facetime
    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(OS);
    }


    // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price); // static methods does not accept instances
    //  }


    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }
}
