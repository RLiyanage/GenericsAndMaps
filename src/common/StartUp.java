/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Sanuth
 */
public class StartUp {

    public static void main(String[] args) {
        Movie movie1 = new Movie("MidNight in Paris", "Woody Allen");
        Movie movie2 = new Movie("Love and Death", "Woody Allen");
        Movie movie3 = new Movie("Made in America", "Ron Howard");
        Movie movie4 = new Movie("Journey", "Peter Jackson");

        Map myMap = new HashMap();
        myMap.put("MidNight in Paris", movie1);
        myMap.put("MidNight in Paris", movie2);
        myMap.put("Made in America", movie3);
        myMap.put("Journey", movie4);

        Movie m = (Movie) myMap.get("MidNight in Paris");
        System.out.println("Retrieving movie with director: :MidNight in Paris " + movie1);
        Set keys = myMap.keySet();
        for (Object key : keys) {
            Movie found = (Movie) myMap.get(key);
            System.out.println("Keys: "+ found.toString());
        }
        Collection values = myMap.values();
        for (Object movie : values) {
            System.out.println("Values:" + (Movie) movie);
        }
        // natural order (Comparable) of the entity object
        List<Movie> sortedList = new ArrayList<>(values);
        Collections.sort(sortedList);
        for(Movie mv : sortedList) {
            System.out.println("Sorted List:"+ mv);
        }
    }
}
