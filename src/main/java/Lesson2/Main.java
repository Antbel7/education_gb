package Lesson2;

import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            int [] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < numbers.length ; i++) {
                if (numbers[i] == 0) { numbers[i] = 1;
                } else numbers[i] = 0;
                System.out.print(numbers[i] + " ");
            }
            System.out.println(" ");

            int[] statistic = new int[8];
            for (int i = 0; i < statistic.length; i++) {
                statistic [i] = i*3;
                System.out.print(statistic[i] + " ");
            }
            System.out.println(" ");

            int[] spectrum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < spectrum.length; i++) {
                if (spectrum[i] < 6) {
                    spectrum[i] = spectrum[i] * 2; }
            }
            System.out.println(Arrays.toString(spectrum));

            int[][] summary = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i==j) {
                        summary[i][j] = 1;
                    } else summary[i][j]=0;
                    System.out.print(summary[i][j] +" ");
                }
                System.out.println();
            }
        int[] degrees = {12, -5, 8, 35, 22, 85};
        int minimum = degrees[0];
        int maximum = degrees[0];
            for (int i = 0; i < degrees.length; i++) {
                if (degrees[i]<=minimum) {minimum = degrees[i];}
            }
            for (int i = 0; i < degrees.length; i++) {
                if (degrees[i]>=maximum) {maximum = degrees[i];}
        }
            System.out.println(minimum);
            System.out.println(maximum);
        }
}








