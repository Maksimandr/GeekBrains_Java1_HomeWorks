package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossesZeroes {

    //Предположение - Человек ходит - Х, программа - О.

    //Поле
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

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

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // считаем фишки в строках
                if (map[i][j] == dot) {
                    dotsInLine++;
                }
                // считаем фишки в столбцах
                if (map[j][i] == dot) {
                    dotsInColumn++;
                }
                // считаем фишки по диагонали
                if (i == j && map[i][j] == dot) {
                    dotsInDiagonal++;
                }
                // считаем фишки по обратной диагонали
                if (i == ((SIZE - 1) - j) && map[j][i] == dot) {
                    dotsInReversDiagonal++;
                }
                // проверяем на выигрыш в строках, столбцах или диагоналях
                if (dotsInLine == DOTS_TO_WIN || dotsInColumn == DOTS_TO_WIN || dotsInDiagonal == DOTS_TO_WIN || dotsInReversDiagonal == DOTS_TO_WIN) {
                    return true;
                }
            }
            dotsInLine = 0;
            dotsInColumn = 0;
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

