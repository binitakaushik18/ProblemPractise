package com.arraysum;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 09/03/15.
 */
public class ArraySumImplTest {
    ArrayElementSum pairLogic = null;
    Map<String,Integer> expectedMap = null;
    List<Integer> integerList = null;

    @Before
    public void setUp() throws Exception {
        pairLogic = new ArraySumImpl();
        expectedMap = Maps.newHashMap();
        integerList = Lists.newArrayList();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArray() throws Exception {
        pairLogic.findPairs(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray() throws Exception {
        pairLogic.findPairs(integerList);

    }

    @Test
    public void testArrayWithNoSumofElements() throws Exception {
        assertEquals("No elements should be returned",expectedMap,pairLogic.findPairs(Lists.newArrayList(1,2,5,9,-90,67)));
    }

    @Test
    public void testArraySumWithMoreThanOneSum() throws Exception {

        expectedMap.put("-4,7",3);
        expectedMap.put("1,2",3);
        expectedMap.put("1,3",4);
        expectedMap.put("3,4",7);

        assertEquals("Should return one pair", expectedMap, pairLogic.findPairs(Lists.newArrayList(1, 2, 3, 4, 3, 4, 7, -4)));

    }

    @Test
    public void testArraySimpleWithOnePair() throws Exception {
        Map<String,Integer> expectedMap = Maps.newHashMap();
        expectedMap.put("1,2",3);
        assertEquals("Should return one pair", expectedMap, pairLogic.findPairs(Lists.newArrayList(1, 2, 3)));
    }

    @Test
    public void testArrayWithMultiplePair() throws Exception {
        Map<String,Integer> expectedMap = Maps.newHashMap();
        expectedMap.put("1,2",3);
        expectedMap.put("1,2",3);
        expectedMap.put("1,1",2);
        assertEquals("Should return one pair", expectedMap, pairLogic.findPairs(Lists.newArrayList(1, 2, 3,1,2,3)));

    }
}
