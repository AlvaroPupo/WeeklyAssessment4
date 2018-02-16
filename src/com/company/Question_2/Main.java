package com.company.Question_2;

public class Main {

    public static void main(String[] args) {
        /*
        1. Create a new class in this package that will hold a model for a house (at least 2 Variables, getters, setters and constructor)
        2. Create an instance of the house in the main method here.
         */
        House one = new House(2,"Louisville", true);
        House two = new House(3,"Clarksville",false);
        House three = new House(1, "Jeffesontown",true);

        System.out.println("this is house one: it has " + one.getBedrooms() + " bedrooms, it is located on " + one.getPlace() + "\nDriveway: " + one.isDriveway() + "\n");
        System.out.println("this is house two: it has " + two.getBedrooms() + " bedrooms, it is located on " + two.getPlace() + "\nDriveway: " + two.isDriveway() + "\n");
        System.out.println("this is house three: it has " + three.getBedrooms() + " bedrooms, it is located on " + three.getPlace() + "\nDriveway: " + three.isDriveway() + "\n");

    }

    }



