public class Employee {
    private String name;
    private String lastName;
    private int age;
    private static int salary;

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        salary = 500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        Employee.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "name = '" + name + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", salary = " + salary;
    }
}
