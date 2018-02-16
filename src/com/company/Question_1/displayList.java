package com.company.Question_1;

import java.util.ArrayList;
import java.util.List;

public class displayList {

    List<String> typesOfShoes = new ArrayList<>();

    public void addToarrayList(){

        typesOfShoes.add("Nike");
        typesOfShoes.add("Michael Jordan");
        typesOfShoes.add("Converse");
        typesOfShoes.add("New Balance");
        typesOfShoes.add("Skechers");
        typesOfShoes.add("Puma");

    }
    public void displayArray(){

        int uno = 1;
        for (String display : typesOfShoes){
            System.out.println(uno++ + ". " + display);
        }
    }
}
