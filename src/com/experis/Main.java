package com.experis;

import com.experis.calculations.WordSplitter;
import com.experis.userInteraction.UserInput;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        WordSplitter wordSplitter = new WordSplitter();


        String userSentence = userInput.getUserChoiceOfInput();
        var mapSplittedWords = wordSplitter.mapSplitWordValue(userSentence);
        var sortedMapOfWords = wordSplitter.sortMapOfWordCount(mapSplittedWords);

        System.out.println("Word count of your sentence is: " + sortedMapOfWords);
    }
}
