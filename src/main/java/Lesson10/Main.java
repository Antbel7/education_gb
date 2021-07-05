package Lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String args[]) {

        String [] placeToVisit= {"Saratov", "Moscow", "Paris", "New York", "Moscow", "New York",
                "Barnaul", "Saratov", "New York", "Paris"};
        System.out.println(Arrays.toString(placeToVisit));

        Set<String> unGorod = new HashSet<>(Arrays.asList(placeToVisit));
        System.out.println(unGorod);

        HashMap <String, Integer> hm = new HashMap<>();

        Integer visit;
        for (int i = 0; i < placeToVisit.length; i++) {
            visit = 0;
            for (int j = 0; j < placeToVisit.length; j++) {
                if (placeToVisit[i].equals(placeToVisit[j])){ visit+=1; }
            }
            hm.put(placeToVisit[i], visit);
        }
        System.out.println(hm);

        Phonedirectory book = new Phonedirectory();
        book.add("Саша Белый", "666 666");
        book.add("Пчела", "767676");
        book.add("Космос", "121212");
        book.add("Саша Белый", "848484");
        System.out.println(book.get("Космос"));
        System.out.println(book.get("Саша Белый"));
    }



}
