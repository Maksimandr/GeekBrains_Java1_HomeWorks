package lesson6;

public class Cat extends Animal {

    private static int createdCats;
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
        createdCats++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCreatedCats() {
        return createdCats;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(distance + " м. Серьёзно? Кот столько не пробежит.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(distance + " м. Серьёзно? Коты не умеют плавать.");
    }
}
