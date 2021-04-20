package lesson7;

public class Plate {
    //тарелка

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

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public void info() {
        System.out.println(this);
    }

    public boolean decreaseFood(int appetite) {
        if (foodCount < appetite) {
            return false;
        }
        foodCount -= appetite;
        return true;
    }

    public void addFood(int value) {
        if (value > 0) {
            setFoodCount(getFoodCount() + value);
        } else {
            System.out.println("Нельза забирать еду, котам и так не хватает.");
        }
    }
}
