package lesson7;

public class Plate {

    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }
}
