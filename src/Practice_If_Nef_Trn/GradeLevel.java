package Practice_If_Nef_Trn;

public class GradeLevel {
    public static void main(String[] args) {

        byte level = 8;//1~18
        String GradeLavel = "";

        if (level >= 1 || level <= 18){

        if (level >= 1 && level <= 5 ){
            GradeLavel = "Elementary school";
        }else if (level >= 6 && level <= 8){
            GradeLavel = "Middle school";
        }else if (level >= 9 && level <= 12) {
            GradeLavel = "High school";
        }else  if (level >= 13 && level <= 16){
            GradeLavel = "College";
        }else{
            GradeLavel = "Grad School";
        }

        System.out.println(GradeLavel);





    }
}}
/*
1. Create a class called GradeLevel,
 Given a number(byte) grade level determine and print which school type someone is in.
                   grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */