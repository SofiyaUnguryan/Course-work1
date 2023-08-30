public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void fullInformationList() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static int salaryCosts() {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum = salarySum + employee.getSalary();
        }
        return salarySum;
    }

    public static void maxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - это " + maxSalary.getFullName());
    }

    public static void minSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - это " + minSalary.getFullName());
    }

    public static int averageSalary() {
        return salaryCosts() / employees.length;
    }

    public static void listOfFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void main(String[] args) {

        employees[0] = new Employee("Жарова Анна Степановна", 1, 54_390);
        employees[1] = new Employee("Курочка Ряба", 1, 61_270);
        employees[2] = new Employee("Гудков Игорь Никитич", 2, 40_840);
        employees[3] = new Employee("Петров Сергей Павлович", 1, 62_230);
        employees[4] = new Employee("Суворова Нинель", 3, 70_890);
        employees[5] = new Employee("Санта Клаус", 5, 100_000);
        employees[6] = new Employee("Билли Морган", 4, 59_990);
        employees[7] = new Employee("Иванов Иван Иванович", 4, 23_050);
        employees[8] = new Employee("Джейн Доу", 3, 165_430);
        employees[9] = new Employee("Киндер Пингви", 2, 78_420);

        System.out.println();
        System.out.println("Лист всех сотрудников:");
        fullInformationList();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты сотрудникам в месяц равна " + salaryCosts());
        System.out.println();
        minSalary();
        System.out.println();
        maxSalary();
        System.out.println();
        System.out.println("Среднее значение зарплат равняется " + averageSalary());
        System.out.println();
        System.out.println("ФИО всех сотрудников:");
        listOfFullNames();

    }
}