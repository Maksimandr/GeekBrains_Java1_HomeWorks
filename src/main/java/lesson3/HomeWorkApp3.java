package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr;

        System.out.println("Задание №1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. \nС помощью цикла и условия заменить 0 на 1, 1 на 0.");
        zerosAndOnes();
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.");
        oneHundredArray();
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.");
        doubleElementsInArray();
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) \nзаполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из \nдиагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n].");
        diagonalArray();
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int \nдлиной len, каждая ячейка которого равна initialValue.");
        System.out.println("Введите размер массива:");
        int len = scanner.nextInt();
        System.out.println("Введите начальное значение для ячеек массива:");
        int initialValue = scanner.nextInt();
        System.out.println(Arrays.toString(fillArray(len, initialValue)));

        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №6. Задать одномерный массив и найти в нем минимальный и максимальный элементы.");
        findMinMaxInArray();
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №7. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, \nесли в массиве есть место, в котором сумма левой и правой части массива равны.");
        arr = createArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Наличие баланса - " + checkBalance(arr));// Проверяем наличие баланса
        System.out.println("----------------------------------------------------");// для удобства восприятия результатов вывода

        System.out.println("Задание №8. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), \nпри этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться \nвспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].");
        arr = createArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Введите n - значение сдвига элементов (n<0 - сдвиг влево, n>0 - сдвиг вправо):");
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(shiftArray(arr, n)));

        scanner.close();
    }

    /**
     * Задается целочисленный массив, состоящий из элементов 0 и 1.
     * С помощью цикла и условия заменяется 0 на 1, 1 на 0.
     */
    public static void zerosAndOnes() {
        System.out.println("Введите размер массива:");
        int arrSize = scanner.nextInt();
        int[] arr;
        arr = randomFillArray(arrSize, 1); // заполняем массив 0 и 1
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
    public static void doubleElementsInArray() {
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
    public static void diagonalArray() {
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
    public static int[] fillArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    /**
     * Задается одномерный массив и находятся в нем минимальный и максимальный элементы
     */
    public static void findMinMaxInArray() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Введите размер массива:");
        int arrSize = scanner.nextInt();
        int[] arr;
        arr = randomFillArray(arrSize, 100); // заполняем массив значениями от 0 до 100
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
                System.out.println("Балансная сумма элементов массива = " + partialSum + ", номер элемента на котором достигается баланс = " + (i + 1));
                System.out.print("[");
                for (int j = 0; j < arr.length - 1; j++) {
                    System.out.print(arr[j] + ", ");
                    if (j == i) {
                        System.out.print("||| ");
                    }
                }
                System.out.println(arr[arr.length - 1] + "]");
                return true;
            } else if (partialSum > sum / 2) { // Баланс уже невозможен
                break;
            }
        }
        return false;
    }

    /**
     * Метод смещает все элементы массива на n позиций. Элементы смещаются циклично.
     * n<0 - сдвиг влево, n>0 - сдвиг вправо.
     *
     * @param arr исходный массив
     * @param n   величина сдвига
     * @return массив со смещенными элементами
     */
    private static int[] shiftArray(int[] arr, int n) {
        int tempElement;
        if (arr.length <= 1) {// если массив пустой или с одним элементом, то сдвиг не имеет смысла
            return arr;
        }
        if (n >= 0) { // выбран сдвиг впарво
            for (int i = 0; i < n % arr.length; i++) {// сдвиг повторяется n раз
                tempElement = arr[arr.length - 1];//запоминаем последний элемент массива
                for (int j = arr.length - 2; j >= 0; j--) {//сдвигаем все элемнты от предпоследнего до первого вправо
                    arr[j + 1] = arr[j];
                }
                arr[0] = tempElement;// последний элемент помещаем на место первого
            }
        } else { // выбран сдвиг влево
            for (int i = 0; i < -n % arr.length; i++) {// сдвиг повторяется n раз
                tempElement = arr[0];//запоминаем первый элемент массива
                for (int j = 1; j < arr.length; j++) {//сдвигаем все элемнты от второго до последнего влево
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 1] = tempElement;// первый элемент помещаем на место последнего
            }
        }
        return arr;
    }

    /**
     * Метод возвращает массив и позволяет заполнить его случайными значениями или вручную
     *
     * @return заполненный массив
     */
    public static int[] createArray() {
        System.out.println("Введите размер массива:");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int arrFillMethod;
        do {
            System.out.println("Выберите способ заполнения массива:");
            System.out.println("1. Случайными значениями.");
            System.out.println("2. Вручную.");
            arrFillMethod = scanner.nextInt();
        } while (arrFillMethod < 1 || arrFillMethod > 2);//Запрашиваем ввод пока не введено правильное значение
        if (arrFillMethod == 1) {
            System.out.println("Введите верхнюю границу диапазона значений элементов массива:");
            int maxValue = scanner.nextInt();
            arr = randomFillArray(arrSize, maxValue);// Заполняем массив случайными значениями
        } else {
            for (int i = 0; i < arrSize; i++) {
                System.out.printf("Введите %d элемент массива = ", i + 1);
                arr[i] = scanner.nextInt();// Заполняем массив вручную
            }
        }
        return arr;
    }

    /**
     * Возвращает одномерный массив указанного размера и заполняется случайными значениями
     *
     * @param arrSize  размер массива
     * @param maxValue максимальное граница диапазона значений элементов массива
     * @return заполненный массив
     */
    public static int[] randomFillArray(int arrSize, int maxValue) {
        Random rnd = new Random();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(maxValue + 1); // Заполняем массив случайным образом от 0 до maxValue
        }
        return arr;
    }
}
