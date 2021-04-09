package lesson5;

//Класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    /**
     * Конструктор
     * @param name ФИО
     * @param position должность
     * @param email электронная почта
     * @param phoneNumber телефон
     * @param salary зарплата
     * @param age возраст
     */
    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Геттеры и сеттеры
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Для тренировки переопределил метод
     * @return информация об объекте в виде строки
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    /**
     * Метод, который выводит информацию об объекте в консоль.
     */
    public void info() {
        System.out.println(this);
    }



}
