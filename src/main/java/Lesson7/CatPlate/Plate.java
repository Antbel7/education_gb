package Lesson7.CatPlate;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food-n<0){
            System.out.println("В тарелке не хватает еды!");
        } else
            food -= n;
    }
    public void addFood(int f){
        food+=f;
    }
    public void info() {
        System.out.println("plate: " + getFood());
    }

    public int getFood() {
        return food;
    }
}
