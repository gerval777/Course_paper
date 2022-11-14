package Coursework;
/**
 * При разработке реализована генрация случайных чисел в зарплатах сотрудников. На мой взгляд результат более динамичен.
 */
public class Main {
    // Запуск и оформление программы (Базовая сложность)
    public static void main(String[] args) {

        System.out.println("            Курсовая работа студента Герасимова Валерия Андреевича");
        System.out.println("                        ------Базовая сложность-------");
        System.out.println();

        Entrylevel.employeeStorage = new Employee[]{
                new Employee("Виноградов Олег Борисович", 1),
                new Employee("Боратуров Дмитрий Олегович", 2),
                new Employee("Богранов Сергей Владимирович", 4),
                new Employee("Колован Василий Андреевий", 5),
                new Employee("Петраков Павел Сергеевич", 5),
                new Employee("Иванов Дмитрий Павлович", 2),
                new Employee("Сидоров Валерий Дмитриевич", 1),
                new Employee("Пендуль Илья Валерьевич", 3),
                new Employee("Калинин Вадим Борисович", 4),
                new Employee("Морчалов Данил Сергеевич", 4)
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
                new Employee("Виноградова Ольга Борисовна", 1),
                new Employee("Боратурова Диана Олеговна", 2),
                new Employee("Богранова Кристина Владимировна", 4),
                new Employee("Колован Василиса Андреевна", 5),
                new Employee("Петракова Ирина Сергеевна", 5),
                new Employee("Иванова Мария Павловна", 2),
                new Employee("Сидорова Валерия Дмитриевна", 1),
                new Employee("Пендуль Инна Валерьевна", 3),
                new Employee("Калинина Жанна Борисовна", 4),
                new Employee("Морчалова Дарья Сергеевна", 4)
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
        Averagelevel.printMinSalAllEmployeesInDep(150_000);
        System.out.println();
        System.out.println("3.b. Вывод всех сотрудников с зарплатой более числа");
        Averagelevel.printMaxSalAllEmployeesInDep(150_000);

        System.out.println();
        System.out.println("                        ------Очень сложно------");
        System.out.println();

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.createEmployee("Шарапова Ольга Борисовна", 1);
        employeeBook.createEmployee("Шишатская Диана Олеговна", 2);
        employeeBook.createEmployee("Шустова Кристина Владимировна", 4);
        employeeBook.createEmployee("Шквалова Василиса Андреевна", 5);
        employeeBook.createEmployee("Шурыгина Ирина Сергеевна", 5);
        employeeBook.createEmployee("Шматко Мария Павловна", 2);
        employeeBook.createEmployee("Штурова Валерия Дмитриевна", 1);
        employeeBook.createEmployee("Шиткова Инна Валерьевна", 3);
        employeeBook.createEmployee("Шовная Жанна Борисовна", 4);
        employeeBook.createEmployee("Шишко Дарья Сергеевна", 4);

        System.out.println("6. Печать списка отделов и ФИО их сотрудников. (Очень сложно)");
        EmployeeBook.printingAllEmployeeDepartments();
    }
}
