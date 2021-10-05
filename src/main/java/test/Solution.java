package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int [] date = new int [4];
        date [0] = Integer.parseInt(r.readLine());
        date [1] = Integer.parseInt(r.readLine());
        date [2] = Integer.parseInt(r.readLine());
        date [3] = Integer.parseInt(r.readLine());

        int max = date[0];

        for(int i = 0; i < date.length; i++){
            if(date[i]>= max)
            {max = date[i];}

        }
        System.out.println (max);
    }


}

