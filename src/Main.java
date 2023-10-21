public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Жарова Анна Степановна", 1,54_390);
        employees[1] = new Employee("Пекина Любовь Андреевна", 1, 61_270);
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
        Employee.fullInformationList(employees);
        System.out.println();
        System.out.println("Сумма затрат на зарплаты сотрудникам в месяц равна " + Employee.salaryCosts(employees));
        System.out.println();
        Employee.minSalary(employees);
        System.out.println();
        Employee.maxSalary(employees);
        System.out.println();
        System.out.println("Среднее значение зарплат равняется " + Employee.averageSalary(employees));
        System.out.println();
        System.out.println("ФИО всех сотрудников:");
        Employee.listOfFullNames(employees);

    }
}