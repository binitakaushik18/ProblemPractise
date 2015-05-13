package com.wordfrequency;

import com.newwordfrequency.WordFrequency;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by binita on 16/02/15.
 */
public class WordFrequencyImpl implements Wordfrequency {

    public static final String DELIM = " ";
    public static final String replaceRegex = "[^a-zA-Z\\d\\s]";

    @Override //old methd for letter count
    public Integer letterCount(String inputString) {

        //LineIterator fileIterator = FileUtils.lineIterator(new File(fileLocation));
        char[] characterArray = inputString.toCharArray();
        Map<Character, Integer> wordFrequencyMap = new HashMap<Character, Integer>();

        for (char character : characterArray) {
            if (wordFrequencyMap.containsKey(character)) {

                Integer wordCount = (Integer) wordFrequencyMap.get(character);
                wordFrequencyMap.put(character, wordCount + 1);

            } else {
                wordFrequencyMap.put(character, 1);

            }
        }
        return null; //iterateWordCount(wordFrequencyMap);
    }

    @Override // new method for word count
    public Map<String, Integer> wordCount(String inputString) {


        Map<String, Integer> wordCountMap = new HashMap<>();

        if (StringUtils.isNotEmpty(inputString)) {
            inputString = inputString.replaceAll(replaceRegex,"").toLowerCase();


            String[] inputStringArray = StringUtils.split(inputString, DELIM);
            for (String word : inputStringArray) {
                if (wordCountMap.containsKey(word)) {
                    Integer count = wordCountMap.get(word);
                    wordCountMap.put(word, count + 1);
                } else {
                    wordCountMap.put(word, 1);
                }

            }


        }
        else{
            return wordCountMap;
        }
        return wordCountMap;

    }

    private Integer iterateWordCount(Map<String, Integer> wordFrequencyMap, String word) {
        Integer wordCount = 0;
        if (wordFrequencyMap.containsKey(word)) {
            wordCount = wordFrequencyMap.get(word);
        }
        return wordCount;
    }


}
