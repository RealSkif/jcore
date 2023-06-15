public class Manager extends Employee {

    public Manager(String name, String lastName, int age, int salary) {
        super(name, lastName, age, salary);
    }

    public static void raiseSalary(Employee[] employees, int raiseUp) {

        for (Employee emp : employees) {
            if(!(emp instanceof Manager)){

                emp.setSalary(emp.getSalary() + raiseUp);
            }
        }
    }
}
