package Lesson1;

public class Main {
    public static void main(String[] args) {

        byte position = 5;
        short distance = 327;
        int total = 300000;
        long budget = 2500000;
        float temperature = 37.1f;
        double point = 389.485;
        char letter = 252;
        boolean answer = false;
        String hello = "Привет";

        System.out.println(hello);
        System.out.println(temperature);
        System.out.println(letter);

        System.out.println(task(5.25f,5.36f,8.35f,1.25f));
        System.out.println(definition(14,5));
        property(0);
        System.out.println(characteristic(5));
        Hello("Антон");
        Year(1972);

    }

    public static float task (float a, float b, float c, float d) {

        return a*(b+c/d);
    }

    public static boolean definition (int g, int f) {
        int summ = g + f;
        boolean reply;
        if (summ >= 10 && summ <= 20) {
            reply = true;
        } else reply = false;

        return reply;
    }

    public static void property (int vaule) {
        if (vaule >=0){
            System.out.println("Было получено положительное число");
        } else
            System.out.println("Было получено отрицательно число");

    }

    public static boolean characteristic(int sense) {
        boolean feedback;
        if (sense>=0){
            feedback = false;
        } else
            feedback = true;
        return feedback;
    }

    public static void Hello (String name) {
    System.out.println("Привет, "+name+"!");
    }

    public static void Year (int year) {
        int parameter1, parameter2, parameter3;
        parameter1 = year%4;
        parameter2 = year%100;
        parameter3 = year%400;

        if((parameter1 == 0 && parameter2 != 0) || parameter3 == 0){
            System.out.println("Год високосный");
        }   else
            System.out.println("Год не високосный");
    }
}
