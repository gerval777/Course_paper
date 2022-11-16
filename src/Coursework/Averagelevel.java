package Coursework;

public class Averagelevel {

    // Создание массива из 10 сотрудников
    static Employee[] employeeStorage2 = new Employee[10];

    // 1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public static void salaryIndexing(int percentageIndexation) {
        for (Employee employee : employeeStorage2) {
            int indexedSalary = employee.getEmployeeSalary();
            employee.setEmployeeSalary((int) (indexedSalary * (percentageIndexation / 100f + 1)));
        }
    }

    // 2.a. Поиск по отделу сотрудника с минимальной зарплатой.
    public static Employee minWageEmployeeInDep(int department) {
        int minSalaryEmp = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employeeStorage2) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getDepartment() < minSalaryEmp) {
                minSalaryEmp = employee.getEmployeeSalary();
                result = employee;
            }
        }
        return result;
    }

    // 2.b. Поиск по отделу сотрудника с максимальной зарплатой.
    public static Employee maxWageEmployeeInDep(int department) {
        int maxSalaryEmp = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employeeStorage2) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getDepartment() > maxSalaryEmp) {
                maxSalaryEmp = employee.getEmployeeSalary();
                result = employee;
            }
        }
        return result;
    }

    // 2.c. Поиск суммы затрат на зарплату по отделу.
    public static int calcTotalSalaryByDep(int department) {
        int salaryCounterInDep = 0;
        for (Employee employee : employeeStorage2) {
            if (employee.getDepartment() == department) {
                salaryCounterInDep += employee.getEmployeeSalary();
            }
        }
        return salaryCounterInDep;
    }

    // d. Поиск Средней зарплаты по отделу
    public static double calcAverageSalaryByDep(int department) {
        int allEmployeesInDep = 0;
        int salaryCounterInDep = 0;
        for (Employee employee : employeeStorage2) {
            if (employee.getDepartment() == department) {
                salaryCounterInDep += employee.getEmployeeSalary();
                allEmployeesInDep++;
            }
        }
        allEmployeesInDep = salaryCounterInDep / allEmployeesInDep;
        return allEmployeesInDep;
    }

    // 2.e. Индексация зарплат всех сотрудников отдела
    public static void salaryIndexingInDep(int percentageIndexation, int department) {
        for (Employee employee : employeeStorage2) {
            if (employee.getDepartment() == department) {
                int indexedSalary = employee.getEmployeeSalary();
                employee.setEmployeeSalary((int) (indexedSalary * (percentageIndexation / 100f + 1)));
            }
        }
    }

    // 2.f. Вывод всех сотрудников отдела на экран (все данные, кроме отдела).
    public static void printAllEmployeesInDep(int department) {
        for (Employee employee : employeeStorage2) {
            if (employee.getDepartment() == department) {
                System.out.println("[id: " + employee.getId() + "] " + employee.getName() + "; зарплата: " + employee.getEmployeeSalary() + " руб.");
            }
        }
    }

// 3.a. Вывод всех сотрудников с зарплатой меньше числа

    public static void printMinSalAllEmployeesInDep(int salaryLevel) {
        for (Employee employee : employeeStorage2) {
            if (employee.getEmployeeSalary() < salaryLevel) {
                System.out.println("[id: " + employee.getId() + "] " + employee.getName() + "; зарплата: " + employee.getEmployeeSalary() + " руб.");
            }
        }
    }

    // 3.b. Вывод всех сотрудников с зарплатой больше числа
    public static void printMaxSalAllEmployeesInDep(int salaryLevel) {
        for (Employee employee : employeeStorage2) {
            if (employee.getEmployeeSalary() > salaryLevel) {
                System.out.println("[id: " + employee.getId() + "] " + employee.getName() + "; зарплата: " + employee.getEmployeeSalary() + " руб.");
            }
        }
    }
}
