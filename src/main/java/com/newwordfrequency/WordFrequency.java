package com.newwordfrequency;

import java.util.Map;

/**
 * Created by binita on 11/03/15.
 */
public interface WordFrequency {
    Map<String,Integer> getWordFrequency(String text);
}
