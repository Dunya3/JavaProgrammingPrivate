package Practice_If_Nef_Trn;

public class FINRA {
    public static void main(String[] args) {

        int number = 15;
        String results = "";

        if (number <= 3) {
            results = "FIN";
        } else if (number <= 5) {
            results = "RA";
        } else if (number >= 3 ) {
            results = "FINRA";
        }else{
            results = "Invalid";
        }

        System.out.println("number ="  +results);








}}
/*
3.Create a class called FINRA,
 Write a function which prints out the number.
 but for number which is a multiple of 3,
 print "FIN" instead of the number and for number which is a multiple of 5,
 print "RA" instead of the number and for number which is a multiple of both 3 and 5,
 print "FINRA" instead of the number.
            ex:
                number = 3
                  output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
 */