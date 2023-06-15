public class Manager extends Employee {

    public Manager(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public static void raiseSalary(Employee[] employees, int raiseUp) {

        for (Employee emp : employees) {
            if(!(emp instanceof Manager)){
                System.out.println(emp);
                emp.setSalary(emp.getSalary() + raiseUp);
            }
        }
    }
}
