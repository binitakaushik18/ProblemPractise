package com.newwordfrequency;

import com.google.common.collect.Maps;
import com.newwordfrequency.WordFrequencyImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 11/03/15.
 */
public class WordFrequencyImplTest {
    WordFrequency wordFrequency = null;
    Map<String,Integer> expectedMap = null;
    @Before
    public void setUp() throws Exception {
        wordFrequency = new WordFrequencyImpl();
        expectedMap = new HashMap<>();
    }

    @Test
    public void testForNullString() throws Exception {
        try{
            wordFrequency.getWordFrequency(null);
            fail("Should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Exception for null string","Null or empty string not allowed",e.getMessage());
        }
    }

    @Test
    public void testForEmptyString() throws Exception {
        try{
            wordFrequency.getWordFrequency("");
            fail("Should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Exception for empty string","Null or empty string not allowed",e.getMessage());
        }

    }

    @Test
    public void testForStringwithOneWord() throws Exception {
        String text= "random";
        expectedMap.put("random",1);

        assertEquals("Should return count as 1",expectedMap,wordFrequency.getWordFrequency(text));
    }

    @Test
    public void testForStringwithSpecialCharacters() throws Exception {
        String text = "This looks great and its wonderful. Wow! And superb it is. isnt it?";

        expectedMap.put("this",1);
        expectedMap.put("looks",1);
        expectedMap.put("great",1);
        expectedMap.put("looks",1);
        expectedMap.put("and",2);
        expectedMap.put("its",1);
        expectedMap.put("wonderful",1);
        expectedMap.put("wow",1);
        expectedMap.put("superb",1);
        expectedMap.put("it",2);
        expectedMap.put("is",1);
        expectedMap.put("isnt",1);
        assertEquals("Should return equals value map",expectedMap,wordFrequency.getWordFrequency(text));

    }

    @Test
    public void testForCaseSensitivityCheck() throws Exception {
        String text = "I will try to DO this and do whatever it takes. just Do IT.";
        expectedMap.put("i",1);
        expectedMap.put("will",1);
        expectedMap.put("try",1);
        expectedMap.put("to",1);
        expectedMap.put("do",3);
        expectedMap.put("this",1);
        expectedMap.put("and",1);
        expectedMap.put("whatever",1);
        expectedMap.put("it",2);
        expectedMap.put("takes",1);
        expectedMap.put("just",1);
        assertEquals("Should return the expected map",expectedMap,wordFrequency.getWordFrequency(text));

    }

    @Test
    public void testForStringHavingAllUniqueWords() throws Exception {
        String text = "This is a real string having all unique characters.";
        expectedMap.put("this",1);
        expectedMap.put("is",1);
        expectedMap.put("a",1);
        expectedMap.put("real",1);
        expectedMap.put("string",1);
        expectedMap.put("having",1);
        expectedMap.put("all",1);
        expectedMap.put("unique",1);
        expectedMap.put("characters",1);
        assertEquals("Should return expected map",expectedMap,wordFrequency.getWordFrequency(text));

    }

    @Test
    public void testForStringWithOneWordRepeated() throws Exception {
        String text = "Repeat repeat, REPEAT:, RePeAt'";
        expectedMap.put("repeat",4);
        assertEquals("Should return expected map",expectedMap,wordFrequency.getWordFrequency(text));
    }

    @Test
    public void testWordWithQuotes() throws Exception {
        String text = "Someone said: 'As you sow, shall you reap', 'as'";
        expectedMap.put("someone",1);
        expectedMap.put("said",1);
        expectedMap.put("as",2);
        expectedMap.put("you",2);
        expectedMap.put("sow",1);
        expectedMap.put("shall",1);
        expectedMap.put("reap",1);
        assertEquals("Should return expected map",expectedMap,wordFrequency.getWordFrequency(text));

    }

    @Test
    public void testForGarbageString() throws Exception {
        String text = "jfjdsk uertyu re er";
        expectedMap.put("jfjdsk",1);
        expectedMap.put("uertyu",1);
        expectedMap.put("re",1);
        expectedMap.put("er",1);
        assertEquals("Should retrn expected map",expectedMap,wordFrequency.getWordFrequency(text));



    }
}
