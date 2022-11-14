package Coursework;

public class Entrylevel {

    // Создание массива из 10 сотрудников
    static Employee[] employeeStorage = new Employee[10];

    // a.Вывод всех сорудников на экран
    public static void printAllEmployees() {
        for (Employee employee : employeeStorage) {
            System.out.println(employee);
        }
    }

    // b.Подсчет общей суммы зарплат
    public static int calcTotalSalary() {
        int salaryCounter = 0;
        for (Employee employee : employeeStorage) {
            salaryCounter += employee.getEmployeeSalary();
        }
        return salaryCounter;
    }

    // c.Поиск сотрудника с минимальной зарплатой
    public static Employee searchLowIncomeEmployee() {
        Employee result = employeeStorage[0];
        int salaryMin = employeeStorage[0].getEmployeeSalary();
        for (Employee employee : employeeStorage) {
            if (employee != null && employee.getEmployeeSalary() < salaryMin) {
                salaryMin = employee.getEmployeeSalary();
                result = employee;
            }
        }
        return result;
    }

    // d.Поиск сотрудника с максимальной зарплатой
    public static Employee searchHighlyPaidEmployee() {
        Employee result = employeeStorage[0];
        int salaryMax = employeeStorage[0].getEmployeeSalary();
        for (Employee employee : employeeStorage) {
            if (employee != null && employee.getEmployeeSalary() > salaryMax) {
                salaryMax = employee.getEmployeeSalary();
                result = employee;
            }
        }
        return result;
    }

    // e.Подсчет среднего значения зарплат (использован для этого метод из пункта b).
    public static double calcAverageSalary() {
        double averagesalary = calcTotalSalary() / employeeStorage.length;
        return averagesalary;
    }

    // f. Вывод Ф. И. О. всех сотрудников на экран
    public static void printAllEmployeesFullName() {
        for (Employee employee : employeeStorage) {
            System.out.println(employee.getName());
        }
    }
}
