package day24_CustomMethods_Return;

public class MorningTasks {
    public static void main(String[] args){

        initials("cydeo", "school");

        System.out.println("=============================");

        domain("Cydeo.School@amazon.com");

        System.out.println("=============================");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);

            System.out.println("===================================");

            nameOfMonth(12);

            System.out.println("==================================");

            nameOfday(5);
        }

    }

    //1. Create a method that can display the initials of the person initials(String firstname, String lastName)
    public static void initials(String firstname, String lastname){
       String initial = firstname.charAt(0)+"."+lastname.charAt(0);
       initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }
    //2. Create a method that can display the domain of the email
    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }
    //3. Create a method that can display the name of the month based on the given number to the method
     public static void nameOfMonth(int number){

        String name = "";

        if(number >= 1 && number <= 12) {

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" :
                    (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Avg" : (number == 9) ? "Sep" :
                            (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";
        }else {
            name = "Invalid";
        }

         System.out.println("Month name = " + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfday(int number){

    }

}


/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has

15

You do not have permission to send messages in this channel.

 */