package Lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonedirectory {

    private HashMap<String, Set<String>> guide = new HashMap<>();

    public void add (String name, String number){
        Set<String> lokalnumbers;
        if (guide.containsKey(name)) {
            lokalnumbers = guide.get(name);
            lokalnumbers.add(number);
            guide.put(name, lokalnumbers);
        } else lokalnumbers = new HashSet<>();
               lokalnumbers.add(number);
               guide.put(name, lokalnumbers);
    }
    public Set<String> get(String name) {

        return guide.get(name);
    }
}
