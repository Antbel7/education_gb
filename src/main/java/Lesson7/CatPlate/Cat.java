package Lesson7.CatPlate;

public class Cat {
    public String getName() {
        return name;
    }

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
     p.decreaseFood(appetite);
    }

    public void Satiety (Plate p){
        if (p.getFood()>=appetite){
            satiety=true;
        }
    }
    public boolean isSatiety() {
        return satiety;
    }

}
