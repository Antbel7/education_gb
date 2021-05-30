package Lesson3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b =1;
        while (b == 1) {
            fort();
            System.out.println("Хотите сыграть еще? Если да - нажмите 1, если нет - нажмите 2");
            b = sc.nextInt();
        } System.out.println("До новых встреч!!!");

    }

    public static void fort() {

        Random rand = new Random();
        int x = rand.nextInt(10);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число от 0 до 9");
            int a = sc.nextInt();

            if (a == x) {
                System.out.println("Вы выграли АВТОМОБИЛЬ!!!");
                break;
            } else if (i <= 1) {
                System.out.println("Вы не угадали, у Вас есть еще попытка");
            } else System.out.println("Увы и ах!!! Попыток больше нет");

        }
    }
}




