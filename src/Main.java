import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Name1", "LastName1", 32, 500);
        Employee e2 = new Employee("Name2", "LastName2", 30, 100);
        Employee e3 = new Employee("Name3", "LastName3", 35, 800);
        Employee m1 = new Manager("Name4", "LastName4", 55, 500);
        Employee[] employeesArray = {e1, e2, e3, m1};
        for (Employee emp : employeesArray) {
            System.out.println(emp);
        }

        Manager.raiseSalary(employeesArray, 300);
        System.out.println();

        for (Employee emp : employeesArray) {
            System.out.println(emp);
        }
        System.out.println("Original array: " + Arrays.toString(employeesArray));
        Arrays.sort(employeesArray);
        System.out.println("Sorted by salary array: " + Arrays.toString(employeesArray));
        Comparator<Employee> ageComparator = new AgeComparator();
        Arrays.sort(employeesArray, ageComparator);
        System.out.println("Sorted by age array: " + Arrays.toString(employeesArray));

    }
}
