package Lesson5;

public class Main {

    public static void main(String[] arg) {
        Worker[] workers = new Worker[5];

        workers[0] = new Worker("Пушкин", "Писатель", "onegin@mail.ru",
                "55555", 80000, 37);
        workers[1] = new Worker("Гагарин", "Космонавт", "gagarin@mail.ru",
                "121212", 100000, 34);
        workers[2] = new Worker("Ургант", "Ведущий", "urgant@mail.ru",
                "111111", 300000, 43);
        workers[3] = new Worker("Пучков", "Блогер", "goblin@mail.ru",
                "020202", 1000000, 59);
        workers[4] = new Worker("Маканаги", "Актер", "interstelar@mail.ru",
                "010101", 500000, 51);

        System.out.println("Информация \n");



        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() >= 40) {
                workers[i].base();
                System.out.println();
            }
        }

    }
}