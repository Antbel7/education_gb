package Lesson12.ClassWork;

public class MyRunnableExample implements Runnable {
    private final int count;
    private final Counter counter;

    public MyRunnableExample (int count, Counter counter){
        this.count = count;
        this.counter = counter;
    }

    @Override
    public void run () {
        int temCount = counter.getCount();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter.setCount(temCount+1);
        System.out.println("Привет мир из отдельного раннбл потока № " + count);
    }
}
