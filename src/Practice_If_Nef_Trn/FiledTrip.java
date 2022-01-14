package Practice_If_Nef_Trn;

public class FiledTrip {

    public static void main(String[] args) {


        int gradeNumber = 5; // gradeNumber 1 ~ 6
        String tripInfo;

        if (gradeNumber == 1 ){
         tripInfo = "\nGrade 1 location - Apple orchard \n number of groups - 3  \nteacher in charge - Ms. Smith";
        }else if (gradeNumber == 2) {
            tripInfo = "\nGrade 2 location - Zoo \n number of groups - 7\n teacher in charge - Mr. Lee";
        }else if (gradeNumber == 3){
            tripInfo =  "\nGrade - 3 location - Aquarium \nnumber of groups - 5 \nteacher in charge - Ms. Wilson";
        }else if (gradeNumber == 4){
            tripInfo =  "\nGrade - 4 location - Movie theater \n number of groups - 2\n teacher in charge - Ms. Reyes";

        }else if (gradeNumber == 5){
            tripInfo = "\nGrade - 5 location - Museum \nnumber of groups - 5 \nteacher in charge - Ms. Lela";
        }else {
            tripInfo = "\nGrade - 6 location - Six Flags \nnumber of groups - 8 \nteacher in charge - Mr. Watt";
        }
             System.out.println(tripInfo);













    }

}
/*
8.Create a class called FieldTrip.
 Your school goes on a Field trip each year.
 The place you go will be based on your grade.
 Given a variable gradeNumber (1-6) figure out the details of your field trip.
 Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */