package Lesson12.HomeWork;

import java.util.Date;

public class Main {
    static final int size = 10000;
    static final int half = size/2;
    static float [] arr = new float[size];


    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        long b = System.currentTimeMillis();
        method1(arr);

        System.out.println(System.currentTimeMillis()-b);

        long a = System.currentTimeMillis();

        float [] arr1 = new float[half];
        float [] arr2 = new float[half];
        System.arraycopy(arr,0,arr1,0,half-1);
        System.arraycopy(arr,half,arr2,0,half-1);
        MyRun tr1 = new MyRun(arr1);
        MyRun tr2 = new MyRun(arr2);
        tr1.start();
        tr2.start();
        System.arraycopy(arr1,0,arr,0,half-1);
        System.arraycopy(arr2,0,arr,half,half);

        System.out.println(System.currentTimeMillis() - a);

    }
    public static void method1 (float [] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (float)(ar[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        //System.out.println(ar[i]+"b");
            }
    }
}
