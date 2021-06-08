package Lesson6.AnimalHome;

import java.util.Random;
import java.util.Scanner;

public class Dog extends AnimalHome {


    @Override
    public void run (){
        Random potential = new Random();
        int maxdistance = 900 + potential.nextInt(400);
        System.out.println("Введите расстояние для пробежки собаки");
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        if (distance >= maxdistance) {
            System.out.println("Собака не сможет пробежать и " + maxdistance + " метров");
        } else {
            System.out.println("Собака сможет пробежать и " + maxdistance + " метров");
        }
    }
    @Override
    public void jump (){
        Random potential = new Random();
        double maxJump = 2*(0.4+ potential.nextDouble());
        System.out.println("Введите высоту для прыжка собаки ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        if (height >= maxJump) {
            System.out.println("Собака слишком толстый, чтобы прыгнуть и " + maxJump + " метров");
        } else {
            System.out.println("Столько собака сможет прыгнуть");
        }
    }
    @Override
    public void swim () {System.out.println("Собаки хорошо плавают!!!");}
}
