package Adampractice_12_08_2021;

public class SwitchEx {
    public static void main(String[] args) {

        String animal = "CAT";
        String result = "";

        switch (animal) {
            case "DOG": //ako mozemo da napravimo sa manje koda je bolje zato sto kompanije gledaju da bude sto laksi kod
            case "CAT":                 // zato sto stavili cat i dog zajedno da smanjimo prostor a dobijamo isto kao da si razdvijeni
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
            System.out.println(result);





    }
}
/* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */