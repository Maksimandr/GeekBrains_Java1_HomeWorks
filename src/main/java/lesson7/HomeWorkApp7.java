package lesson7;

import java.util.Random;

public class HomeWorkApp7 {

    public static final Random random = new Random();

    public static void main(String[] args) {

        int limit = 10; // количество котов

        Cat[] cat = new Cat[limit];
        Plate plate = new Plate(100);
        //создаем массив котов
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat("Степан №" + i, "Бандитского", random.nextInt(25), random.nextInt(50));
        }

        //кормим котов по очереди
        for (int i = 0; i < cat.length; i++) {
            System.out.println("В тарелке сейчас еды: " + plate);
            System.out.println("Кушает кот: " + cat[i]);
            cat[i].eat(plate);
            //если кот голодный значит ему не хватило еды, добавим её в тарелку и снова покормим
            if (!cat[i].isSatiety()) {
                System.out.println("В тарелке слишком мало еды! Добавим еды.");
                //добавляем еды заведомо больше чем максимальный аппетит котов
                plate.addFood(50 + random.nextInt(100));
                System.out.println("В тарелке сейчас еды: " + plate);
                cat[i].eat(plate);
            }
            System.out.println("Кот покушал: " + cat[i]);
            System.out.println("В тарелке осталось еды: " + plate);
            System.out.println();
        }
    }
}
