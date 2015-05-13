package com.wordfrequency;


import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class WordFrequencyImplTest {

    Wordfrequency wordfrequency = null;
    Map<String,Integer> wordCount = null;

    @Before
    public void setUp() throws Exception {

        wordfrequency = new WordFrequencyImpl();
        wordCount = new HashMap<>();
    }

     @Test
    public void testNullInput() throws Exception
    {

        assertEquals("null word count should return empty map",wordCount,wordfrequency.wordCount(null));
    }

    @Test
    public void testForOneCharacter() throws Exception {

        wordCount.put("a",1);
        assertEquals("should return 1",wordCount,wordfrequency.wordCount("a"));
    }



    @Test
    public void testWithMultipleValidWords() throws Exception {
       String sampleString = "I love Bakku and I love my dear baby Ishu and I love my family";
        wordCount.put("i",3);
        wordCount.put("love",3);
        wordCount.put("bakku",1);
        wordCount.put("and",2);
        wordCount.put("my",2);
        wordCount.put("dear",1);
        wordCount.put("baby",1);
        wordCount.put("ishu",1);
        wordCount.put("family",1);
        assertEquals("should return as expected",wordCount,wordfrequency.wordCount(sampleString));

    }

    @Test
    public void testWordsWithSpecialCharacters() throws Exception {
        String sampleString = "This is the greatest advice: that follow your own advice";

        wordCount.put("this",1);
        wordCount.put("is",1);
        wordCount.put("the",1);
        wordCount.put("greatest",1);
        wordCount.put("advice",2);
        wordCount.put("that",1);
        wordCount.put("follow",1);
        wordCount.put("your",1);
        wordCount.put("own",1);
        assertEquals("should return as expected",wordCount,wordfrequency.wordCount(sampleString));

    }

    @Test
    public void testWordsWithQuotes() throws Exception {
        String sampleString = "Three little kittens and the three Little 'kittens'";

        wordCount.put("three",2);
        wordCount.put("little",2);
        wordCount.put("the",1);
        wordCount.put("kittens",2);
        wordCount.put("and",1);
        assertEquals("should return as expected",wordCount,wordfrequency.wordCount(sampleString));

    }
}