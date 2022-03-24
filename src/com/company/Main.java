package com.company;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

    static void Task1() {
        String[] array = {"Blue", "Red", "Green", "Yellow", "Brown", "Black", "Pink" };
        ArrayList<String> Colours = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            Colours.add(array[i]);
        }
        System.out.println("Copied array to Colours");
        for (int i = 0; i < Colours.size(); i++) {
            System.out.println(Colours.get(i));
        }

        Colours.remove(2);
        System.out.println("Removing color Green \t");
        for (int i = 0; i < Colours.size(); i++) {
            System.out.println(Colours.get(i));
        }
        Colours.add(Colours.size(), "White");
        System.out.println("Adding color at the end White \t");
        for (int i = 0; i < Colours.size(); i++) {
            System.out.println(Colours.get(i));
        }
        Colours.add(Colours.size(), "Green");
        System.out.println("Adding color Green at the beginning ");
        Colours.add(0, "Green");
        for (int i = 0; i < Colours.size() - 1; i++) {
            System.out.println(Colours.get(i));
        }
        ArrayList<String> colorsSublist = new ArrayList<String>();
        colorsSublist.addAll(Colours.subList(2, 5));
        System.out.println("Adding values from 2 to 5 in new array");
        for (int i = 0; i < colorsSublist.size(); i++) {
            System.out.println(colorsSublist.get(i));

        }
    }

    public final class Text {

        public static final String TEXT =
                "Polymorphism is the ability of an object to take on many forms The most common use of polymorphism in " +
                        "OOP occurs when a parent class reference is used to refer to a child class object\n" +
                        "\n" +
                        "Any Java object that can pass more than one IS-A test is considered to be polymorphic In Java all " +
                        "Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object\n" +
                        "\n" +
                        "It is important to know that the only possible way to access an object is through a reference variable " +
                        "A reference variable can be of only one type Once declared the type of a reference variable cannot be changed\n" +
                        "\n" +
                        "The reference variable can be reassigned to other objects provided that it is not declared final The " +
                        "type of the reference variable would determine the methods that it can invoke on the object\n" +
                        "\n" +
                        "A reference variable can refer to any object of its declared type or any subtype of its declared type" +
                        " A reference variable can be declared as a class or interface type";

        private Text() {

        }
    }

    static void Task2() {
        ArrayList<String> listOfUniqueWords = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : Text.TEXT.split("\\s+")) {
            listOfUniqueWords.add(i.toLowerCase());
            if (map.containsKey(i.toLowerCase()))
                map.replace(i.toLowerCase(), map.get(i.toLowerCase()) + 1);
            else
                map.put(i.toLowerCase(), 1);
        }
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }


    public static void main(String[] args) {

        Task1();
        Task2();



    }
}
