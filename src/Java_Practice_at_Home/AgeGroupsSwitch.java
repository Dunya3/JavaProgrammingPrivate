package Java_Practice_at_Home;

public class AgeGroupsSwitch {
    public static void main(String[] args) {

        int age = 38; //1~85+
        String results = "";

        if (age >= 1 && age <= 85){

        switch (age){
            case 1: case 2:
                results = "infant";
                break;
            case 3: case 4: case 5:
                results = "Toddler";
                break;
            case 6: case 7: case 8: case 9:
                results = "Kid";
                break;
            case 10: case 11: case 12:
                results = "Pre-Teen";
                break;
            case 13: case 14: case 15: case 16: case 17:
                results = "Teenager";
                break;
            case 18: case 19: case 20:
                results = "Young Adult";
                break;
            case 21: case 22: case  23: case 24:
            case 25: case 26: case 27: case 28:
            case 29: case 30: case 31: case 32: case 33:
            case 34: case 35: case 36: case 37: case 38:
            case 39:
                results = "Adult";
                break;
            case 40: case 41: case 42: case 43: case 44:
            case 45: case 46: case 49:
                    results = "Young Middle-Aged Adult";
                    break;
            case 50:case 51: case 52: case 53: case 54:
                results = "Middle-Aged Adult";
                break;
            case 55: case 56: case 57: case 58: case 59: case 60:
            case 61: case 62: case 63: case 64:
                results = "Very Young Senior Citizen";
                break;
            case 65: case 66: case 67: case 68: case 69: case 70: case 71:
            case 72: case 73: case 74:
                results = "Young Senior Citizen";
                break;
            case 75: case 76: case 77: case 78: case 79: case 80: case 81:
            case 82: case 83: case 84:
                results = "Senior Citizen";

            default:
                results = "Old Senior Citizen";

        }
            System.out.println(results);












    }
}}
/*
 6. write a program that can define the age groups of a person
                 age groups are:
                        infant ( 1 - 2 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

                NOTE: MUST USE switch statement


 */