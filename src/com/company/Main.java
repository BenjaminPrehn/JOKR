package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main (String[] args)
    {
        ArrayList<String> jokes = new ArrayList<>();
        Random random = new Random();

        jokes.add("How does a scientist freshen their breath? With experi-mints");
        jokes.add("What did the 0 say to the 8? Nice belt.");
        jokes.add("Where do you learn to make banana splits? At sundae school.");

        System.out.println(jokes.get(random.nextInt(jokes.size())));
    }
}