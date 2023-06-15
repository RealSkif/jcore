public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Name1", "LastName1", 32);
        Employee e2 = new Employee("Name2", "LastName2", 30);
        Employee e3 = new Employee("Name3", "LastName3", 35);
        Employee m1 = new Manager("Name4", "LastName4", 55);
        Employee[] employeesArray = {e1, e2, e3, m1};
        for (Employee emp : employeesArray) {
            System.out.println(emp);
        }

        Manager.raiseSalary(employeesArray, 300);
        System.out.println();

        for (Employee emp : employeesArray) {
            System.out.println(emp);
        }
    }
}
