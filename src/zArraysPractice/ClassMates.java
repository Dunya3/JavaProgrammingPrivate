package zArraysPractice;
import java.util.Arrays;
public class ClassMates {
    public static void main(String[] args) {


            String[] classMates = {"Sandra Eric", "Marina Smiljanic", "Andrea Botica", "Ivana Sabljic", "Marija Stamenkovic", "Simona Petrovic",
                    "Kristina Simic", "Dejan Pilovic", "Mihajlo Stamenkovic", "Viktor Petrovic"};

            for (int i = 0; i < classMates.length; i++) {
                String initial = "";
                initial =classMates[i]+" : "+classMates[i].charAt(0) + "." + classMates[i].substring(classMates[i].indexOf(" "), classMates[i].indexOf(" ") + 2)+".  ";
                System.out.println(initial);
            }
            System.out.println();
            System.out.println(Arrays.toString(classMates));

        System.out.println("-------------------------------------------------");

        // muhtarov primer kako treba


        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for(String each : names ){
            String initial = each.charAt(0)+"."+ each.charAt(  each.indexOf(" ") +1   );
            System.out.println(initial);


        }
}}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */