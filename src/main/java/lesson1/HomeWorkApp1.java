package lesson1;

public class HomeWorkApp1 {

    public static void main(String[] args) {
        printThreeWords();
        System.out.println("---------------------");// для удобства восприятия результатов вывода
        checkSumSign();
        System.out.println("---------------------");// для удобства восприятия результатов вывода
        printColor();
        System.out.println("---------------------");// для удобства восприятия результатов вывода
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 50 - (int)(Math.random() * 100);// диапазон +-50
        int b = 50 - (int)(Math.random() * 100);// диапазон +-50
//        System.out.println(a + " + " + b + " = " + (a + b));// для контроля правильной работы кода
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = (int)(Math.random() * 500) - 250;// диапазон +-250
//        System.out.println("value = " + value);// для контроля правильной работы кода
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 50 - (int)(Math.random() * 100);// диапазон +-50
        int b = 50 - (int)(Math.random() * 100);// диапазон +-50
//        System.out.println("a = " + a + " ; b = " + b);// для контроля правильной работы кода
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
