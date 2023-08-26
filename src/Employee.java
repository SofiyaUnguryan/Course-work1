import java.sql.SQLOutput;
import java.util.Objects;

public class Employee {
    private final int id;
    static int counter = 1;
    private final String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.id = counter++;
        this.fullName = fullName;
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Не существует такоего отдела");
        } else {
            this.department = department;
        }
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "ID " + id + ". " + fullName + ", " + "отдел " + department + ", " + "з/п " + salary;
    }

    public static void fullInformationList(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static int salaryCosts(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum = salarySum + employee.getSalary();
        }
        return salarySum;
    }

    public static void maxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - это " + maxSalary.getFullName());
    }

    public static void minSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - это " + minSalary.getFullName());
    }

    public static int averageSalary(Employee[] employees) {
        return salaryCosts(employees) / employees.length;
    }

    public static void listOfFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}
