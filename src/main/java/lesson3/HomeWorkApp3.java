package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Задание №1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.");
//        zerosAndOnes();
//        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода
//
//        System.out.println("Задание №2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.");
//        oneHundredArray();
//        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода
//
//        System.out.println("Задание №3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.");
//        doubleArrElements();
//        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода
//
//        System.out.println("Задание №4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n].");
//        diagonalArr();
//        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода
//
//        System.out.println("Задание №5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.");
//        System.out.println("Введите размер массива:");
//        int len = scanner.nextInt();
//        System.out.println("Введите начальное значение для ячеек массива:");
//        int initialValue = scanner.nextInt();
//        System.out.println(Arrays.toString(fillArr(len, initialValue)));
//
//        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода
//
//        System.out.println("Задание №6. Задать одномерный массив и найти в нем минимальный и максимальный элементы.");
//        findMinMaxInArr();
//        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №7. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.");
        System.out.println("Введите размер массива:");
        int arrSize = scanner.nextInt(); // чтобы было удобнее/быстрее можно закоментить предыдущие задания и ввод размерности массива
//        int arrSize = 10;
        int[] arr = new int[arrSize];
        int maxValue = 10; // можно выбирать диапазон значений элементов массива
        arr = rndFillArr(arrSize, maxValue);
        System.out.println(Arrays.toString(arr));
        System.out.println("Наличие баланса - " + checkBalance(arr));
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        scanner.close();
    }

    /**
     * Задается целочисленный массив, состоящий из элементов 0 и 1.
     * С помощью цикла и условия заменяется 0 на 1, 1 на 0.
     */
    public static void zerosAndOnes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        arr = rndFillArr(arrSize, 1); // заполняем массив 0 и 1
        System.out.println(Arrays.toString(arr));
        System.out.println("Заменим 0 на 1 и наоборот.");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Задается пустой целочисленный массив длиной 100. С помощью цикла заполняем его значениями 1 2 3 4 5 6 7 8 … 100.
     */
    public static void oneHundredArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Задается массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]. Проходим по нему циклом, и числа меньшие 6 умножаем на 2.
     */
    public static void doubleArrElements() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Элементы меньше 6 умножим на 2.");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Создается квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла заполняются его диагональные элементы единицами.
     */
    public static void diagonalArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arrSize = scanner.nextInt();
        int[][] arr = new int[arrSize][arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1; // Элемент первой диагонали
            arr[i][arrSize - 1 - i] = 1; // Элемент второй диагонали
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    /**
     * Метод, принимает на вход два аргумента: len и initialValue, и возвращает одномерный массив типа int длиной len,
     * каждая ячейка которого равна initialValue.
     *
     * @param len          размер массива
     * @param initialValue значение ячеек массива
     * @return возвращает инициализированный массив
     */
    public static int[] fillArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    /**
     * Задается одномерный массив и находятся в нем минимальный и максимальный элементы
     */
    public static void findMinMaxInArr() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Введите размер массива:");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        arr = rndFillArr(arrSize, 100); // заполняем массив значениями от 0 до 100
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min + ", Max = " + max);
    }

    /**
     * Метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     *
     * @param arr передаваемый массив
     * @return возвращает признак наличия баланса
     */
    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        int partialSum = 0;
        for (int j : arr) {
            sum += j; // Считаем сумму всех элементов
        }
        System.out.println("Сумма элементов массива = " + sum);
        for (int i = 0; i < arr.length; i++) {
            partialSum += arr[i]; // Считаем частичную сумму до i-го элемента включительно
            if (partialSum == sum - partialSum) { // Сравниваем сумму элементов до i-го элемента включительно и сумму элементов после него
                System.out.println("Балансная сумма элементов массива = " + partialSum + ", ИНДЕКС элемента на котором достигается баланс = " + i);
                return true;
            }
        }
        return false;
    }

    /**
     * Задается одномерный массив указанного размера и заполняется случайными значениями
     *
     * @param arrSize  размер массива
     * @param maxValue максимальное граница диапазона значений элементов массива
     * @return заполненный массив
     */
    public static int[] rndFillArr(int arrSize, int maxValue) {
        Random rnd = new Random();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(maxValue + 1); // Заполняем массив случайным образом от 0 до maxValue
        }
        return arr;
    }
}
