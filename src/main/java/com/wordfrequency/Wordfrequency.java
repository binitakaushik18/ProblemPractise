package com.wordfrequency;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by binita on 16/02/15.
 */
public interface Wordfrequency {

    public Integer letterCount(String inputString);
    public Map<String,Integer> wordCount(String inputString);

}
