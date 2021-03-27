package lesson2;

import java.util.Scanner;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание №1.");
        System.out.println("Введите два числа:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("Сумма чисел попадает в диапазон от 10 до 20: " + checkSum(firstNumber, secondNumber));
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №2.");
        System.out.println("Введите положительное или отрицательное число:");
        int number = scanner.nextInt();
        printNumberSign(number);
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №3.");
        System.out.println("Результат проверки: " + checkNumberSign(number));
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №4.");
        System.out.println("Введите строку:");
        String s = scanner.next();
        System.out.println("Введите количество повторов:");
        int count = scanner.nextInt();
        printString(s, count);
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №5.");
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println("Год високосный: " + leapYear(year));

        scanner.close();

    }

    /**
     * Метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     * от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return результат проверки на попадание суммы в диапазон
     */
    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /**
     * Метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     *
     * @param a проверяемое число
     */
    public static void printNumberSign(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /**
     * Метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     * если число отрицательное, и вернуть false если положительное.
     *
     * @param a проверяемое число
     * @return результат проверки
     */
    public static boolean checkNumberSign(int a) {
        return a < 0;
    }

    /**
     * метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     * указанную строку, указанное количество раз.
     *
     * @param s печатаемая строка
     * @param n количество повторов
     */
    public static void printString(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    /**
     * метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный
     * - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     *
     * @param y передаваемый год
     * @return результат проверки
     */
    public static boolean leapYear(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

}
