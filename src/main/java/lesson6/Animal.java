package lesson6;

public class Animal {

    private static int createdAnimals;
    private String name;

    public Animal(String name) {
        this.name = name;
        createdAnimals++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCreatedAnimals() {
        return createdAnimals;
    }

    public void run(int distance) {
        validateNegative(distance);
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        validateNegative(distance);
        System.out.println(name + " проплыл " + distance + " м.");
    }

    protected void validateNegative(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Расстояние не может быть отрицательным!");
        }
    }
}
