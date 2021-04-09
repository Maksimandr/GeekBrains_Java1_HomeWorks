package lesson5;

public class HomeWorkApp5 {

    public static void main(String[] args) {

        //Создаем массив из 5 сотрудников.
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "i_ivanov@company.com", "89876543215", 30000, 48);
        employeesArray[1] = new Employee("Petrov Aleksandr", "Specialist", "a_petrov@company.com", "89876543214", 40000, 34);
        employeesArray[2] = new Employee("Boshirov Ruslan", "Expert", "r_boshirov@company.com", "89876543213", 50000, 41);
        employeesArray[3] = new Employee("Semyonova Natasha", "Secretary", "n_semyonova@company.com", "89876543212", 60000, 25);
        employeesArray[4] = new Employee("Doe John", "Director", "j_doe@company.com", "89876543211", 70000, 42);

        // 1. С помощью цикла выводим информацию только о сотрудниках старше 40 лет.
        for (Employee employee: employeesArray) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }

        System.out.println();



    }
}
