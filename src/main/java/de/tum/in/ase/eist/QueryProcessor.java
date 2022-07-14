package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

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
        } else if (query.contains("plus")){
            String[] temp = query.split(" ");
            int i= Integer.parseInt(temp[2]) + Integer.parseInt(temp[4]);
            return String.valueOf(i);
        } else if (query.contains("which of the following numbers is the largest")){
            String[] temp = query.split(" ");
            temp[8].replace(",", "");
            if(Integer.parseInt(temp[8])>Integer.parseInt(temp[9]))return temp[8];
            else return temp[9];
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
