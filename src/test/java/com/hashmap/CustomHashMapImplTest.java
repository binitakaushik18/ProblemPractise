package com.hashmap;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

/**
 * Created by binita on 10/03/15.
 */
public class CustomHashMapImplTest {

    CustomHashMap<String,String> customHashMap = null;
    CustomHashMap<String,String> mockedCustomMap = null;
    Map<String,String> actualMap = null;
    Map<String,String> mockedMap = null;

    @Before
    public void setUp() throws Exception {

        actualMap = new HashMap<>();
        mockedMap = mock(HashMap.class);
        mockedCustomMap = new CustomHashMapImpl<String,String>(mockedMap);
        customHashMap = new CustomHashMapImpl<String,String>(actualMap);

    }

    @Test
    public void testSimpleDeletedElementCount() throws Exception {
        customHashMap.put("key","value");
        assertNotNull(customHashMap.remove("key"));
        assertEquals("Deleted element count should be 1",1,customHashMap.getDeletedCount());
        mockedCustomMap.put("key","value");
        verify(mockedMap).put("key","value");

    }

    @Test
    public void testDeletedElementCountForNoDeletionsOnMap() throws Exception {
        assertNull(customHashMap.remove("sample"));
        assertEquals("deleted element count should be zero",0,customHashMap.getDeletedCount());
    }

    @Test
    public void testDeletedElementCountForMultipleDeletions() throws Exception {
        customHashMap.put("key", "value");
        customHashMap.put("key2","value2");
        customHashMap.put("key3","value3");
        customHashMap.put("key4","value4");
        assertEquals("deleted element count should be zero",0,customHashMap.getDeletedCount());
        assertNotNull(customHashMap.remove("key"));
        assertNotNull(customHashMap.remove("key2"));
        assertNotNull(customHashMap.remove("key3"));
        assertEquals("Deleted element count should be 3",3,customHashMap.getDeletedCount());


    }

    @Test

    public void testPutMethod() throws Exception {
        assertEquals("should return null for no value associated with key",null,customHashMap.put("key", "value"));
        assertEquals("should return key for  value associated with key", "value", customHashMap.put("key", "value"));

    }

    @Test
    public void testEmptyPutMethod() throws Exception {
        assertEquals("should return null for no value associated with key",null,customHashMap.put("", ""));
    }

    @Test
    public void testGetMethod() throws Exception {
        mockedCustomMap.get("key");
        verify(mockedMap).get("key");
    }

    @Test
    public void testContainsKey() throws Exception {
        customHashMap.put("key", "value");
        assertFalse("should return false if map does not contain the key", customHashMap.containsKey("key1"));
        assertTrue("should return true if map contains the key", customHashMap.containsKey("key"));
        mockedCustomMap.containsKey("key");
        verify(mockedMap).containsKey("key");
    }

    @Test
    public void testContainsValue() throws Exception {
        customHashMap.put("key", "value");
        assertFalse("should return false if map does not contain the value", customHashMap.containsValue("value1"));
        assertTrue("should return true if map contains the value", customHashMap.containsValue("value"));

        mockedCustomMap.containsValue("value");
        verify(mockedMap).containsValue("value");


    }
    @Test
    public void testClearMethod() throws Exception {
        mockedCustomMap.clear();
        verify(mockedMap).clear();
        //assert
    }

    @Test
    public void testRemoveElement() throws Exception {
        mockedCustomMap.remove("key");
        verify(mockedMap).remove("key");

    }

    @Test
    public void testGetEntrySet() throws Exception {
        mockedCustomMap.entrySet();
        mockedCustomMap.entrySet();
        verify(mockedMap,times(2)).entrySet();

    }
    @Test
    public void testPutAll() throws Exception {
        mockedCustomMap.putAll(actualMap);
        verify(mockedMap).putAll(actualMap);

    }

    @Test
    public void testIsEmptyMap() throws Exception {
        mockedCustomMap.isEmpty();
        verify(mockedMap).isEmpty();

    }

    @Test
    public void testMapSize() throws Exception {
        mockedCustomMap.size();
        verify(mockedMap).size();
    }

    @Test
    public void testMapValues() throws Exception {
        mockedCustomMap.values();
        verify(mockedMap).values();

    }
}
