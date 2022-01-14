package day39_Recap.Cydeo;

public class Student extends Person {
    public Student(String name, int age, char gender, int studentID, String filedOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFiledOfStudy(filedOfStudy);
    }

    private int studentID;
    private String filedOfStudy;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFiledOfStudy() {
        return filedOfStudy;
    }

    public void setFiledOfStudy(String filedOfStudy) {
        this.filedOfStudy=filedOfStudy;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge()+
                ", gender=" + getGender() +
                "studentID=" + studentID +
                ", filedOfStudy='" + filedOfStudy + '\'' +
                '}';
    }
}
/*
 6. Create a subclass of Person named Student

            Extra variables:
    studentId, fieldOfStudy

    Encapsulate all the fields

    Add a constructor to set all the fields

    Encapsulate all the fields

    Methods:
    study()
 */