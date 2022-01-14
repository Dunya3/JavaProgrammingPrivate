package day32_Constractors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Tea");

        Employee employee2 = new Employee("Nika", 'F');

        Employee employee3 = new Employee("Jeja", 'F', "SDET");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


    }
}
