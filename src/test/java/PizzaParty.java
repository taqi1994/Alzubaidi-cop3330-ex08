/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */

import java.util.Scanner;

public class PizzaParty {
    public static void main (String [] args)
    {
        int pizza; //how many pizza
        int person; //how many person
        int slice; //number of slices for each pizze
        int people; //total number of people
        int quotient;
        int left; //how many leftover pizzas left


        Scanner reader = new Scanner (System.in);
        System.out.print("How many people? ");
        person = reader.nextInt();

        System.out.print("How many pizzas do you have? ");
        pizza = reader.nextInt();

        System.out.print("How many slices per pizza? ");

        slice= reader.nextInt();

        people = pizza * slice;
        System.out.println(""+person+" people with "+pizza+" pizzas ("+people+" slices)");

        quotient = people / person;
        System.out.println("Each person gets "+quotient+" pieces of pizza.");
        left = people%person;
        System.out.println("There are "+left+" leftover pieces.");
    }

}
