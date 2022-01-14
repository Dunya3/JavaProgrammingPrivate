package Aysunpractice_12_01_2021;

public class PatientInfo {
    public static void main(String[] args) {

        String name = "Dunja";
        int age = 30;
        char gender = 'F';
        String dateOfBirth = "10/26/1991";
        boolean isMarried = true;
        String phoneNumber = "234-5444-33";
        boolean havingInsurance = true;
        String insuranceNumber = "223343";
        String employer = "Ralph Lauren";
        double copayWithInsurance = 20.00;
        double copayWithoutInsurance = 250.00;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("insuranceNumber = " + insuranceNumber);
        System.out.println("employer = " + employer);
        System.out.println("copayWithInsurance = " + copayWithInsurance);
        System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);

        System.out.println("====Escape Sequences====");
        System.out.println("\tname: "+name+"\n\tage: "+age+"\n\tgender: "+gender+"\n\tdateOfBirth: "+dateOfBirth+"\n\tisMarried: "+isMarried+"\n\tphoneNumber: "+phoneNumber);


        if(havingInsurance){
            System.out.println("copayWithInsurance  =" +copayWithInsurance);

        }else {
            System.out.println("copayWithoutInsurance = " +copayWithoutInsurance);
        }
    }

}
/*
Create a class named PatientInfo. Declare the following variables:

                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)
 */