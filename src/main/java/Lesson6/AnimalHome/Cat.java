package Lesson6.AnimalHome;

import java.util.Random;
import java.util.Scanner;

public class Cat extends AnimalHome {

   //public Lesson7.Cat(String name, String color) {
     // super(name, color);


      @Override
      public void run (){
         Random potential = new Random();
         int maxdistance = 160 + potential.nextInt(81);
         System.out.println("Введите расстояние для пробежки кота");
         Scanner sc = new Scanner(System.in);
         int distance = sc.nextInt();
         if (distance >= maxdistance) {
            System.out.println("Кот слишком толстый, он не сможет пробежать и " + maxdistance + " метров");
         } else {
            System.out.println("Кот сможет пробежать и " + maxdistance + " метров");
         }
      }
   @Override
   public void jump (){
      Random potential = new Random();
      double maxJump = 2*(1+ potential.nextDouble());
      System.out.println("Введите высоту для прыжка кота ");
      Scanner sc = new Scanner(System.in);
      int height = sc.nextInt();
      if (height >= maxJump) {
         System.out.println("Кот слишком толстый, чтобы прыгнуть и " + maxJump + " метров");
      } else {
         System.out.println("Столько кот сможет так прыгнуть");
      }
   }
   @Override
   public void swim () {System.out.println("Кот не умеет плавать!!!");}
}
