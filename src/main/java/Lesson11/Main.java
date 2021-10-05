package Lesson11;

public class Main {

    public static void main (String[] arg){

//        String [] republic = new String[5];
//        republic [0] = "Казахстан";
//        republic [1] = "Беларусь";
//        republic [2] = "Украина";
//        republic [3] = "Грузия";
//        republic [4] = "Молдавия";
//
//        replacement(republic,1,2);
//
//        System.out.println(republic[2]);


        Box <Orange> boxOra = new Box<>();
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box <Apple> boxApl = new Box<>();
        boxOra.upload(orange,9);
        boxOra.info();
        boxOra.download(4);
        boxOra.info();
        boxApl.upload(apple,6);
        boxApl.info();
        boxOra.getWeight();
        boxApl.getWeight();
        System.out.println(boxOra.getWeight());
        System.out.println(boxApl.getWeight());
        System.out.println(boxApl.compare(boxOra));

    }
//    public static void replacement (String [] test, int i, int j) {
//        String cont = test [i];
//        test [i] = test [j];
//        test [j] = cont;
//
//    }

}