package day09_IfStatements;

public class GradeLevel {

    public static void main(String[] args) {


      byte gradeLevel = 5;

        boolean elementarySchool = gradeLevel >= 1 && gradeLevel <= 5;
        if (elementarySchool) {
            System.out.println("Elementary School");

        }
        boolean middleSchool = gradeLevel >= 6 && gradeLevel <= 8;
        if (middleSchool) {
            System.out.println("Middle School");

        }
        boolean HighSchool = gradeLevel >= 9 && gradeLevel <= 12;
        if (HighSchool) {
            System.out.println("High School");

            boolean college = gradeLevel >= 13 && gradeLevel <= 16;
            if (college) {
                System.out.println("College");
            }

            boolean gradSchool = gradeLevel >= 17 && gradeLevel <= 18;
            if(gradSchool){
                System.out.println("Grad School");
            }


        }
    }}

















/*
2. Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18

 */