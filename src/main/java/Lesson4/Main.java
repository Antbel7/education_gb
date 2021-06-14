package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static char [][] map;
    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main (String[] args) {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
                if (isWin(DOT_X)){
                    System.out.println("You won!!!");
                    break; }
                if (isMapFull()){
                    System.out.println("Draw");
                    break; }
            itTurn();
            printMap();
                if (isWin(DOT_O)){
                    System.out.println("Skynet won!!!");
                    break;}
                 if (isMapFull()){
                    System.out.println("Draw");
                    break; }
        }
        System.out.println("End of game!!!");
    }


    private static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }

    }
    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }   System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        } System.out.println();



    }
    private static void humanTurn(){
        int x,y;
        do {
            System.out.println("Введите координаты в формате Х Y");
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        } while (!isCellValid(x,y));
        map[y][x]=DOT_X;


    }
    private static boolean isCellValid(int x, int y) {
     return (x>=0 && y<SIZE)
            &&(y>=0&&y<SIZE)
            && map[y][x]==DOT_EMPTY;
    }
    private static boolean isWin(char symb) {
        int indCell = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j]==symb){
                    indCell++;
                }else break;
                if (indCell==SIZE){
                    return true;
                }
            }
        }
        indCell=0;
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] == symb) {
                    indCell++;
                } else break;
                if (indCell == SIZE) {
                    return true;
                }

            }

        }
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;

    }
    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }

            }

        }  return true;
    }
    private static void itTurn() {
        int x,y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.printf("Skynet нанес удар в точку %d %d \n", x+1, y+1);
        map[y][x]=DOT_O;
    }
}
