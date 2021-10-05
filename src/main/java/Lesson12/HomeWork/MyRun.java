package Lesson12.HomeWork;

public class MyRun extends Thread {
    public MyRun(float[] array) {
        this.array = array;
    }

    private float[] array;

    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            //System.out.println(array[i]+"c");
        }
    }
}