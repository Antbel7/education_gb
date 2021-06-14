package Lesson7;

import Lesson7.CatPlate.Cat;
import Lesson7.CatPlate.Plate;

public class Main {
    public static void main(String[] args) {
       // Cat cat = new Cat("Boris", 102);
        Cat [] cats = {new Cat("Доби",2),
                        new Cat("Поттер", 50),
                        new Cat("Рон", 150),
                        new Cat("Волан-де-Морт", 35)};
        System.out.println();
        Plate plate = new Plate(101);
        plate.info();
        for (Cat cat: cats) {
            cat.Satiety(plate);
            if (cat.isSatiety()){
                System.out.println("Кот " + cat.getName() + " сытый!!!");
            } else System.out.println("Кот " + cat.getName() + " голодный!!!");
            cat.eat(plate);
        }
        plate.info();
    }

}
