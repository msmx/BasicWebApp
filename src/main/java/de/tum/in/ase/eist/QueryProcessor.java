package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class QueryProcessor {
    //testtest
    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Maxi";
        } else if (query.contains("plus") || query.contains("+")){
            String[] temp = query.split(" ");
            List<Integer> numbers = new ArrayList<>();
            for(String t: temp){
                t.replace(",", "");
                try {
                    int i = Integer.parseInt(t);
                    numbers.add(i);
                } catch (NumberFormatException nfe) {

                }
            }
            int back = 0;
            for(int d:numbers){
                back=back+d;
            }
            return String.valueOf(back);
        } else if (query.contains("largest")){
            String[] temp = query.split(" ");
            List<Integer> numbers = new ArrayList<>();
            for(String t: temp){
                t.replace(",", "");
                try {
                    int i = Integer.parseInt(t);
                    numbers.add(i);
                } catch (NumberFormatException nfe) {

                }
            }
            return String.valueOf(Collections.max(numbers));
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
