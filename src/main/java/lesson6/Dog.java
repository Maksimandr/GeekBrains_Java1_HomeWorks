package lesson6;

public class Dog extends Animal {

    private static int createdDogs;
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        createdDogs++;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static int getCreatedDogs() {
        return createdDogs;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(distance + " м. Серьёзно? Пёс столько не пробежит.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println(distance + " м. Серьёзно? Пёс столько не проплывёт.");
        }
    }
}
