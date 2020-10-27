package com.experis.userInteraction;

import java.util.Scanner;

public class UserInput {

    public String getUserChoiceOfInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a tongue twisting sentence of your choice: ");
        String userSentence = scan.nextLine();
        String input = userSentence.toLowerCase().replaceAll("\\p{Punct}", "");
        return input;
    }
}
