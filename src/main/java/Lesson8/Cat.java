package Lesson8;

import Lesson8.Interface.CanJump;
import Lesson8.Interface.CanRun;

public class Cat implements CanRun, CanJump {
    private String name;
    private int maxLength;
    private int maxHeight;

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }
    @Override
    public void jump(int height) {
        if (height<=maxHeight){
            System.out.println("Cat " + name + " сможет прыгнуть выше " + height + " метров");
        }  else System.out.println("Cat " + name + " не сможет прыгнуть " + height + " метров");
    }


    @Override
    public void run(int length) {
        if(length<=maxLength){
            System.out.println("Cat " + name + " сможет пробежать " + length + " метров");
        }  else System.out.println("Cat " + name + " не сможет пробежать " + length + " метров");
    }
}
