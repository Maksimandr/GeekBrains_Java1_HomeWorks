package lesson7;

public class Cat {
    //кот

    private String name;
    private String color;
    private int age;
    private int appetite;
    private boolean satiety;

    public Cat() {
        this("Степан", "Бандитского", 3, 25);
        System.out.println("Создаём кота Шрёдингера");
    }

    public Cat(String name, String color, int age, int appetite) {
        validateAge(age);
        this.name = name;
        this.color = color;
        this.age = age;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        if (age > 25) {
            throw new IllegalArgumentException("Коты столько не живут");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public void info() {
        System.out.println(this);
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetite);
    }
}
