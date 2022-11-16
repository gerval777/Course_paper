package Coursework;

public class EmployeeBook {
    private static final Employee[] employeeStorage3 = new Employee[10];


    // a.Вывод всех сорудников на экран (Базовая сложность)

    public void printAllEmployees() {
        for (Employee employee : employeeStorage3) {
            System.out.println(employee);
        }
    }

    // b.Подсчет общей суммы зарплат (Базовая сложность)
    public int calcTotalSalary() {
        int salaryCounter = 0;
        for (Employee employee : employeeStorage3) {
            salaryCounter += employee.getEmployeeSalary();
        }
        return salaryCounter;
    }

    // c.Поиск сотрудника с минимальной зарплатой (Базовая сложность)
    public Employee searchLowIncomeEmployee() {
        Employee result = employeeStorage3[0];
        int salaryMin = employeeStorage3[0].getEmployeeSalary();
        for (Employee employee : employeeStorage3) {
            if (employee != null && employee.getEmployeeSalary() < salaryMin) {
                salaryMin = employee.getEmployeeSalary();
                result = employee;
            }
        }
        return result;
    }

    // d.Поиск сотрудника с максимальной зарплатой (Базовая сложность)
    public Employee searchHighlyPaidEmployee() {
        Employee result = employeeStorage3[0];
        int salaryMax = employeeStorage3[0].getEmployeeSalary();
        for (Employee employee : employeeStorage3) {
            if (employee != null && employee.getEmployeeSalary() > salaryMax) {
                salaryMax = employee.getEmployeeSalary();
                result = employee;
            }
        }
        return result;
    }

    // e.Подсчет среднего значения зарплат (использован для этого метод из пункта b). (Базовая сложность)
    public double calcAverageSalary() {
        double averagesalary = calcTotalSalary() / employeeStorage3.length;
        return averagesalary;
    }

    // f. Вывод Ф. И. О. всех сотрудников на экран (Базовая сложность)
    public void printAllEmployeesFullName() {
        for (Employee employee : employeeStorage3) {
            System.out.println(employee.getName());
        }
    }

    // 1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %). (Повышенная сложность)
    public void salaryIndexing(int percentageIndexation) {
        for (Employee employee : employeeStorage3) {
            int indexedSalary = employee.getEmployeeSalary();
            employee.setEmployeeSalary((int) (indexedSalary * (percentageIndexation / 100f + 1)));
        }
    }

    // 2.a. Поиск по отделу сотрудника с минимальной зарплатой. (Повышенная сложность)
    public Employee minWageEmployeeInDep(int department) {
        int minSalaryEmp = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employeeStorage3) {
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

    // 2.b. Поиск по отделу сотрудника с максимальной зарплатой. (Повышенная сложность)
    public Employee maxWageEmployeeInDep(int department) {
        int maxSalaryEmp = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employeeStorage3) {
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

    // 2.c. Поиск суммы затрат на зарплату по отделу. (Повышенная сложность)
    public int calcTotalSalaryByDep(int department) {
        int salaryCounterInDep = 0;
        for (Employee employee : employeeStorage3) {
            if (employee.getDepartment() == department) {
                salaryCounterInDep += employee.getEmployeeSalary();
            }
        }
        return salaryCounterInDep;
    }

    // d. Поиск Средней зарплаты по отделу. (Повышенная сложность)
    public double calcAverageSalaryByDep(int department) {
        int allEmployeesInDep = 0;
        int salaryCounterInDep = 0;
        for (Employee employee : employeeStorage3) {
            if (employee.getDepartment() == department) {
                salaryCounterInDep += employee.getEmployeeSalary();
                allEmployeesInDep++;
            }
        }
        return salaryCounterInDep / allEmployeesInDep;
    }

    // 2.e. Индексация зарплат всех сотрудников отдела.(Повышенная сложность)
    public void salaryIndexingInDep(int percentageIndexation, int department) {
        for (Employee employee : employeeStorage3) {
            if (employee.getDepartment() == department) {
                int indexedSalary = employee.getEmployeeSalary();
                employee.setEmployeeSalary((int) (indexedSalary * (percentageIndexation / 100f + 1)));
            }
        }
    }

    // 2.f. Вывод всех сотрудников отдела на экран (все данные, кроме отдела).(Повышенная сложность)
    public void printAllEmployeesInDep(int department) {
        for (Employee employee : employeeStorage3) {
            if (employee.getDepartment() == department) {
                System.out.println("[id: " + employee.getId() + "] " + employee.getName() + "; зарплата: " + employee.getEmployeeSalary() + " руб.");
            }
        }
    }

// 3.a. Вывод всех сотрудников с зарплатой меньше числа. (Повышенная сложность)

    public void printMinSalAllEmployeesInDep(int salaryLevel) {
        for (Employee employee : employeeStorage3) {
            if (employee.getEmployeeSalary() < salaryLevel) {
                System.out.println("[id: " + employee.getId() + "] " + employee.getName() + "; зарплата: " + employee.getEmployeeSalary() + " руб.");
            }
        }
    }

    // 3.b. Вывод всех сотрудников с зарплатой больше числа. (Повышенная сложность)
    public void printMaxSalAllEmployeesInDep(int salaryLevel) {
        for (Employee employee : employeeStorage3) {
            if (employee.getEmployeeSalary() > salaryLevel) {
                System.out.println("[id: " + employee.getId() + "] " + employee.getName() + "; зарплата: " + employee.getEmployeeSalary() + " руб.");
            }
        }
    }

    // 4.a. Добавить нового сотрудника. (Очень сложно)
    public void createEmployee(String name, int department, int employeeSalary) {
        int index = searchingEmptyIndex();
        if (index == -1) {
            System.out.println(" Невозможно! Штат отдела полный");
            return;
        }
        employeeStorage3[index] = new Employee(name, department, employeeSalary);
    }

    private int searchingEmptyIndex() {
        for (int i = 0; i < employeeStorage3.length; i++) {
            if (employeeStorage3[i] == null) {
                return i;
            }
        }
        return -1;
    }
    // 4.b. Удалить сотрудника. Поиск по ФИО или id. (Очень сложно)

    public void deletingEmployee(String name) {
        for (int i = 0; i < employeeStorage3.length; i++) {
            if (employeeStorage3[i].getName().equals(name)) {
                employeeStorage3[i] = null;
            }
        }
    }

    public void deletingEmployee(int id) {
        for (int i = 0; i < employeeStorage3.length; i++) {
            if (employeeStorage3[i].getId() == id) {
                employeeStorage3[i] = null;
            }
        }
    }

    //5.a. Изменить зарплату.(получить сотрудника по Ф. И. О., модернизировать его запись) (Очень сложно)

    public void changingEmployeeSalaries(String name, int salary) {
        for (Employee employee : employeeStorage3) {
            if (employee.getName().equals(name)) {
                employee.setEmployeeSalary(salary);
            }
        }
    }

    //5.b. Изменить отдел.(получить сотрудника по Ф. И. О., модернизировать его запись) (Очень сложно)

    public void changingDepartmentEmployees(String name, int department) {
        for (Employee employee : employeeStorage3) {
            if (employee.getName().equals(name)) {
                employee.setDepartment(department);
            }
        }
    }

    //6. Печать списка отделов и ФИО их сотрудников. (Очень сложно)

    public static void printingAllEmployeeDepartments() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел №: " + i + ":");
            for (Employee employee : employeeStorage3) {
                if (employee.getDepartment() == i) {
                    System.out.println("[id: " + employee.getId() + "]: " + employee.getName());
                }
            }
        }
    }
}