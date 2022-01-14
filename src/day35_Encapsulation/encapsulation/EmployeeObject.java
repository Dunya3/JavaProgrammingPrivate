package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Dunja", 'F', 30, 120000);

        employee1.setAge(32);//ako hocemo da promenimo broj god npr. ili bilo sta drugo

        Employee employee2 = new Employee("Dejan", 'M', 33, 110000);
        employee2.setName("Mixa");
        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println(employee1);
        System.out.println(employee2);



    }
}

