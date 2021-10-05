package Lesson11;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Box <T extends Fruit> {

    ArrayList <T> list = new ArrayList<>();

    public void upload(T fruit, int sum) {           //Загружаем (sum - колличество фруктов)
        for (int i = 0; i < sum; i++){
            list.add(fruit);
        }
    }
    public void info () {                       // вывод информации о колличестве фруктов
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
          a = i + 1;
        }
            System.out.println("Количество фруктов = " + a);
    }
    public void download (int k){                 // выгружаем (k - колиичество выгружаемых фруктов)
        for (int i = 0; i < k; i++) {
            list.remove(i);
        }
    }
    public float getWeight (){        // определяем вес фруктов в коробке
        if (list.isEmpty()){
          return 0;
        } else return list.size()*list.get(1).getfMass();
    }
    public boolean compare (Box<? extends Fruit> box) {    // сравниваем коробки

        return this.getWeight() == box.getWeight();
    }
}
