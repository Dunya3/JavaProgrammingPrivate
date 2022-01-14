package zArraysPractice;
import java.util.Arrays;
public class ReverseClassmates {
    public static void main(String[] args) {

      String [] students= {"Sandra", "Mixa", "Ali", "Fady"};

       String[] rev = new String[4];

        for (int i = 0; i < students.length; i++) {

            String reverse = "";

            for (int j = students[i].length() -1; j >= 0; j--) {
                reverse += students[i].charAt(j);

            }
            rev[i]=reverse;
        }
        System.out.println(Arrays.toString(rev));

        System.out.println("-------------------------------------------");


        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        //prvi loop-other loop ovaj loop prikazuje koji string treba da se reverse
        for (String each: names){ // each: Elminur Ablimit", "Ali Kilic", "Hulya Keles"....

            String reversed = "";
            //nested loop-iner loop    reverse znaci od zadnjeg indexa krece zato stavljamo -1 i i--
            for (int i = each.length()-1; i>= 0 ; i--) { // ovaj loop reversuje samo jedan string ako nam treba za drgi string treba nam nested loop
                reversed += each.charAt(i); // dodavanjem ovoga ovako mozemo da dobijemo svako ime iz stringa
            }

            System.out.println(reversed);
        }





        }

    }

/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */