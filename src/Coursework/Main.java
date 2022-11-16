package Coursework;

public class Main {
    // Запуск и оформление программы (Базовая сложность)
    public static void main(String[] args) {

        System.out.println("            Курсовая работа студента Герасимова Валерия Андреевича");
        System.out.println("                        ------Базовая сложность-------");
        System.out.println();

        Entrylevel.employeeStorage = new Employee[]{
                new Employee("Виноградов Олег Борисович", 1, 36_000),
                new Employee("Боратуров Дмитрий Олегович", 2, 45_800),
                new Employee("Богранов Сергей Владимирович", 4, 76_000),
                new Employee("Колован Василий Андреевий", 5, 45_300),
                new Employee("Петраков Павел Сергеевич", 5, 67_200),
                new Employee("Иванов Дмитрий Павлович", 2, 58_890),
                new Employee("Сидоров Валерий Дмитриевич", 1, 73_600),
                new Employee("Пендуль Илья Валерьевич", 3, 58_300),
                new Employee("Калинин Вадим Борисович", 4, 59_590),
                new Employee("Морчалов Данил Сергеевич", 4, 62_670)
        };

        System.out.println("a. Cписок всех сотрудников со всеми имеющимися по ним данными:");
        Entrylevel.printAllEmployees();
        System.out.println();
        System.out.println("b. Сумма затрат на зарплаты: " + Entrylevel.calcTotalSalary() + " рублей");
        System.out.println();
        System.out.println("c. Cотрудник с минимальной зарплатой: " + "\n" + Entrylevel.searchLowIncomeEmployee());
        System.out.println();
        System.out.println("d. Cотрудник с максимальной зарплатой: " + "\n" + Entrylevel.searchHighlyPaidEmployee());
        System.out.println();
        System.out.println("e. Средняя зарплата: " + Entrylevel.calcAverageSalary() + " руб.");
        System.out.println();
        System.out.println("f. Вывод Ф. И. О. всех сотрудников на экран");
        Entrylevel.printAllEmployeesFullName();

        System.out.println();
        System.out.println("                        ------Повышенная сложность-------");
        System.out.println();

        Averagelevel.employeeStorage2 = new Employee[]{
                new Employee("Виноградова Ольга Борисовна", 1,73_270),
                new Employee("Боратурова Диана Олеговна", 2, 48_900),
                new Employee("Богранова Кристина Владимировна", 4,127_800),
                new Employee("Колован Василиса Андреевна", 5, 168_300),
                new Employee("Петракова Ирина Сергеевна", 5, 132_000),
                new Employee("Иванова Мария Павловна", 2,89_400),
                new Employee("Сидорова Валерия Дмитриевна", 1,79_500),
                new Employee("Пендуль Инна Валерьевна", 3, 82_400),
                new Employee("Калинина Жанна Борисовна", 4, 57_500),
                new Employee("Морчалова Дарья Сергеевна", 4, 62_600)
        };

        Averagelevel.salaryIndexing(44);
        System.out.println("2.а. Cотрудник отдела с минимальной зарплатой: " + "\n" + Averagelevel.minWageEmployeeInDep(1));
        System.out.println();
        System.out.println("2.b. Cотрудник отдела с максимальной зарплатой: " + "\n" + Averagelevel.maxWageEmployeeInDep(2));
        System.out.println();
        System.out.println("2.c. Сумма затрат на зарплату по отделу: " + "\n" + Averagelevel.calcTotalSalaryByDep(5) + " руб.");
        System.out.println();
        System.out.println("2.d. Средняя зарплата по отделу: " + "\n" + Averagelevel.calcAverageSalaryByDep(2) + " руб.");
        System.out.println();
        Averagelevel.salaryIndexingInDep(15, 3);
        System.out.println("2.f Вывод всех сотрудников отдела на экран (все данные, кроме отдела).");
        Averagelevel.printAllEmployeesInDep(2);
        System.out.println();
        System.out.println("3.a. Вывод всех сотрудников с зарплатой меньше числа");
        Averagelevel.printMinSalAllEmployeesInDep(90_000);
        System.out.println();
        System.out.println("3.b. Вывод всех сотрудников с зарплатой более числа");
        Averagelevel.printMaxSalAllEmployeesInDep(90_000);

        System.out.println();
        System.out.println("                        ------Очень сложно------");
        System.out.println();

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.createEmployee("Шарапова Ольга Борисовна", 1, 145_800);
        employeeBook.createEmployee("Шишатская Диана Олеговна", 2, 176_900);
        employeeBook.createEmployee("Шустова Кристина Владимировна", 4, 195_600);
        employeeBook.createEmployee("Шквалова Василиса Андреевна", 5, 190_000);
        employeeBook.createEmployee("Шурыгина Ирина Сергеевна", 5, 230_000);
        employeeBook.createEmployee("Шматко Мария Павловна", 2, 196_400);
        employeeBook.createEmployee("Штурова Валерия Дмитриевна", 1, 178_370);
        employeeBook.createEmployee("Шиткова Инна Валерьевна", 3, 188_000);
        employeeBook.createEmployee("Шовная Жанна Борисовна", 4, 220_500);
        employeeBook.createEmployee("Шишко Дарья Сергеевна", 4, 245_720);

        System.out.println("6. Печать списка отделов и ФИО их сотрудников. (Очень сложно)");
        EmployeeBook.printingAllEmployeeDepartments();
    }
}
