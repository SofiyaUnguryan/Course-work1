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

}
