package Lesson12.ClassWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        List <Thread> threadExamples = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            threadExamples.add(new MyThreadExample(i));
  //      }

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new MyRunnableExample(i, counter));
            threadExamples.add(t);
        }

        for (Thread threadExample : threadExamples) {
            threadExample.start();
        }
        for (Thread threadExample : threadExamples) {
            threadExample.join();
        }

        System.out.println(counter.getCount());
    }
}
