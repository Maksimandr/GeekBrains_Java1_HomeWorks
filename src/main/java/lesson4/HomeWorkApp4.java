package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Вариант программы для поля 5х5 и количества фишек 4, но должно работать при любом размере поля и любом количестве фишек для победы
 */

public class HomeWorkApp4 {

    //Предположение - Человек ходит - Х, программа - О.

    //Поле
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    //Константы- символы
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();


    /**
     * Создать игровое поле и заполнить его пустыми точками.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    public static void printMap() {
        //нумерация столбцов
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            //нумерация строк
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Считать координаты хода. Установить Х на поле
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты хода в формате: X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    /**
     * Ход компьютера
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.printf("Искусственный интеллект ходит: %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }


    /**
     * Проверка выигрыша
     *
     * @param dot
     * @return
     */
    public static boolean checkWin(char dot) {
        int dotsInLine = 0;
        int dotsInColumn = 0;
        int dotsInDiagonal = 0;
        int dotsInReversDiagonal = 0;
        int numberOfAdditionalDiagonals = SIZE - DOTS_TO_WIN; // количество дополнительных диагоналей слева и справа от главных, в которых возможен выигрыш
        int[][] dotsInAddDiag = new int[2][numberOfAdditionalDiagonals];
        int[][] dotsInReversAddDiag = new int[2][numberOfAdditionalDiagonals];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // считаем фишки в строках
                if (map[i][j] == dot) {
                    dotsInLine++;
                } else { // проверка что фишки идут подряд
                    dotsInLine = 0;
                }
                // считаем фишки в столбцах
                if (map[j][i] == dot) {
                    dotsInColumn++;
                } else { // проверка что фишки идут подряд
                    dotsInColumn = 0;
                }
                // проверяем на выигрыш в строках и столбцах
                if (dotsInLine == DOTS_TO_WIN || dotsInColumn == DOTS_TO_WIN) {
                    return true;
                }
            }
            dotsInLine = 0;
            dotsInColumn = 0;
        }
        for (int i = 0; i < SIZE; i++) {
            // считаем фишки по основной диагонали
            if (map[i][i] == dot) {
                dotsInDiagonal++;
            } else { // проверка что фишки идут подряд
                dotsInDiagonal = 0;
            }
            // считаем фишки по обратной диагонали
            if (map[i][SIZE - (i + 1)] == dot) {
                dotsInReversDiagonal++;
            } else { // проверка что фишки идут подряд
                dotsInReversDiagonal = 0;
            }
            if (dotsInDiagonal == DOTS_TO_WIN || dotsInReversDiagonal == DOTS_TO_WIN) {
                return true;
            }
        }

        // считаем фишки в дополнительных диагоналях
        for (int k = 0; k < numberOfAdditionalDiagonals; k++) {
            //дополнительные диагонали выше основной
            for (int i = 0; i < SIZE - numberOfAdditionalDiagonals - k; i++) {
                if (map[i][i + (k + 1)] == dot) {
                    dotsInAddDiag[0][k]++;
                } else {
                    dotsInAddDiag[0][k] = 0;
                }
                //дополнительные диагонали выше обратной
                if (map[i][SIZE - (k + 1) - (i + 1) - k] == dot) {
                    dotsInReversAddDiag[0][k]++;
                } else {
                    dotsInReversAddDiag[0][k] = 0;
                }
                if (dotsInAddDiag[0][k] == DOTS_TO_WIN || dotsInReversAddDiag[0][k] == DOTS_TO_WIN) {
                    return true;
                }
            }
            for (int i = k + 1; i < SIZE; i++) {
                //дополнительные диагонали ниже основной
                if (map[i][i - (k + 1)] == dot) {
                    dotsInAddDiag[1][k]++;
                } else {
                    dotsInAddDiag[1][k] = 0;
                }
                //дополнительные диагонали ниже обратной
                if (map[i][SIZE - (i + 1) + (k + 1)] == dot) {
                    dotsInReversAddDiag[1][k]++;
                } else {
                    dotsInReversAddDiag[1][k] = 0;
                }
            }
            if (dotsInAddDiag[1][k] == DOTS_TO_WIN || dotsInReversAddDiag[1][k] == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверяет, что поле заполнено.
     *
     * @return
     */
    public static boolean isFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void play() {
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Выиграл человек.");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Кожанный мешок, я победил!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        play();
    }
}
