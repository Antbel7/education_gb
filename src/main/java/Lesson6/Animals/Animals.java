package Lesson6.Animals;

public class Animals {
    private String name;
    private String color;

    public Animals (String name, String color){
        this.name = name;
        this.color = color;
    }
    public void run (){
        System.out.println(name + "быстро бегает, фиг поймаешь");
    }
    public void jump(){
        System.out.println(name + color + "высоко прыгает");
    }

}
