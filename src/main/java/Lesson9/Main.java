package Lesson9;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class Main {

    public static void main(String[] arg) {

        try {
           test();
           System.out.println("test");
       } catch (MyArrayException e){
           System.out.println("ошибка");
           e.printStackTrace();
      } catch (MyArrayDataException e){
            System.out.println("ошибка №2");
            e.printStackTrace();
        }
        System.out.println("test");
    }
    public static void test() throws MyArrayException, MyArrayDataException  {
        int i = 4;
        int j = 4;
        String[][] evro = new String[i][j];

        if (i==4 && j==4) {
//            System.out.println("правильный размер");
        } else {
            throw new MyArrayException("Не верный размер массива");
        }
        evro[0][0]="8";
        evro[1][0]="9";
        evro[2][0]="15";
        evro[3][0]="19";
        evro[0][1]="21";
        evro[1][1]="2";
        evro[2][1]="23";
        evro[3][1]="20";
        evro[0][2]="7";
        evro[1][2]="6";
        evro[2][2]="5";
        evro[3][2]="45";
        evro[0][3]="58";
        evro[1][3]="71";
        evro[2][3]="8";
        evro[3][3]="5";


        int summ =0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                try {
                    summ += Integer.parseInt(evro[i][j]);
                } catch (Exception e){
                throw new MyArrayDataException("В массив закрался символ или текст");
                }

            }
        }   System.out.println(summ);

    }
}
