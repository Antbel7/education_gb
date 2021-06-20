package Lesson8;

import Lesson8.Interface.CanJump;
import Lesson8.Interface.CanRun;

public class Main {

    public static void main (String[] arg){

        Object[] objects = new Object[3];
        Robot robot = new Robot("Валии", 100, 15);
        Cat cat = new Cat("Tom",900, 2);
        Human human = new Human("Patric", 1500, 1);
        objects[0]=robot;
        objects[1]=cat;
        objects[2]=human;
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        for (int i = 0; i < 3; i++) {
           if (objects[i] instanceof CanJump){
              CanJump jumpers = (CanJump) objects[i];
              jumpers.jump(wall.getHeight());
           }
           if (objects[i] instanceof CanRun){
                CanRun jumpers = (CanRun) objects[i];
                jumpers.run(treadmill.getLength());
           }
        }
    }
}
