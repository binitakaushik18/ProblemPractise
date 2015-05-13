package com.newwordfrequency;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

/**
 * Created by binita on 11/03/15.
 */
public class WordFrequencyImpl implements WordFrequency {

    private static String DELIM = " ";
    private static String REGEX = "[^a-zA-Z\\d\\s]";


    @Override
    public Map<String, Integer> getWordFrequency(String text) {
        if (StringUtils.isBlank(text)) {
            throw new IllegalArgumentException("Null or empty string not allowed");
        }

        Map<String, Integer> frequencyMap = Maps.newHashMap();
        String newText = text.replaceAll(REGEX,"").toLowerCase();
        String[] splittedString = newText.split(" ");

        for (String checkString : splittedString) {

            if (frequencyMap.containsKey(checkString)) {
                Integer wordCount = frequencyMap.get(checkString);
                frequencyMap.put(checkString, wordCount + 1);
            }
            else {
                frequencyMap.put(checkString, 1);
            }
        }

        return frequencyMap;
    }
}
