package lesson6;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp6 {

    public static Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {

        Animal[] animals;
        Cat[] cats;
        Dog[] dogs;
        int limitNumber = 10;
        int numberOfCats;
        int numberOfDogs;
        int numberOfAnimals;
        int distanceOfRun;
        int distanceOfSwim;

        do {
            System.out.println("Введите количество котов, собак и просто животных (не более " + limitNumber + " каждого) в формате X Y Z");
            numberOfCats = scanner.nextInt();
            numberOfDogs = scanner.nextInt();
            numberOfAnimals = scanner.nextInt();
        } while (!isInputValid(numberOfCats, numberOfDogs, numberOfAnimals, limitNumber));

        //Создаем массивы из котов, собак и просто животных
        cats = new Cat[numberOfCats];
        dogs = new Dog[numberOfDogs];
        animals = new Animal[numberOfAnimals + numberOfCats + numberOfDogs];

        for (int i = 0; i < numberOfAnimals; i++) {
            animals[i] = new Animal("Кто-то №" + i);
        }
        for (int i = 0; i < numberOfCats; i++) {
            cats[i] = new Cat("Кот №" + i, "Цвет кота №" + i);
            animals[numberOfAnimals + i] = cats[i];
        }
        for (int i = 0; i < numberOfDogs; i++) {
            dogs[i] = new Dog("Пёс №" + i, "Порода собаки №" + i);
            animals[numberOfAnimals + numberOfCats + i] = dogs[i];
        }

        //Каждому из объектов котов/собак/животных задаем дистанцию бега и плавания
        for (int i = 0; i < Animal.getCreatedAnimals(); i++) {
            distanceOfRun = random.nextInt(750);
            distanceOfSwim = random.nextInt(15);
            animals[i].run(distanceOfRun);
            animals[i].swim(distanceOfSwim);
            System.out.println();
        }
        //Выводим количество созданных котов, собак и животных
        System.out.println("Всего создано котов:" + Cat.getCreatedCats());
        System.out.println("Всего создано собак:" + Dog.getCreatedDogs());
        System.out.println("Всего создано животных:" + Animal.getCreatedAnimals());
    }

    /**
     * Проверяет правильность ввода данных пользователем
     *
     * @param cats    количество котов
     * @param dogs    количество собак
     * @param animals количество просто животных
     * @param limit   максимальное значение количества существ
     * @return лежат ли количества существ в указанных пределах или нет
     */
    private static boolean isInputValid(int cats, int dogs, int animals, int limit) {
        return (cats >= 0 && cats <= limit && dogs >= 0 && dogs <= limit && animals >= 0 && animals <= limit);
    }
}
