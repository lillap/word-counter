package com.experis.calculations;

import com.experis.userInteraction.UserInput;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class WordSplitter {

    public HashMap mapSplitWordValue(String userSentence) {
        HashMap<String, Integer> mapOfWordCount = new HashMap<>();

        String [] splittedWords = userSentence.split(" ");

        for (String word: splittedWords) {
            if(mapOfWordCount.containsKey(word)){
                int count = mapOfWordCount.get(word);
                mapOfWordCount.put(word, count + 1);
            } else {
                mapOfWordCount.put(word, 1);
            }
        }
        return mapOfWordCount;
    }

    public LinkedHashMap<String, Integer> sortMapOfWordCount(HashMap<String, Integer> mapOfWordCount) {
        LinkedHashMap<String,Integer> sortedMapOfWordCount = new LinkedHashMap<>();
        mapOfWordCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(keyValuePair -> sortedMapOfWordCount.put(keyValuePair.getKey(), keyValuePair.getValue()));

        return sortedMapOfWordCount;
    }
}
