package Practice_If_Nef_Trn;

public class GradeNIf {
    public static void main(String[] args) {

        char grade = 'B';
        String results = "";

        if(grade >= 'A' && grade <= 'F'){

        if (grade == 'A'){
            results = "Excellent";
        }else if (grade == 'B'){
            results = "Great job";
        }else if (grade == 'C'){
            results = "Good";
        }else if (grade == 'D'){
            results = "Passed";
        }else{
            results = "Failed";
        }
        System.out.println(results);

}}}
/*
3. Create a class called Grade, a char variable named grade is given.
 write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */