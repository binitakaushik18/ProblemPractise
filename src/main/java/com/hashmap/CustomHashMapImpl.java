package com.hashmap;

import com.linkedlist.CustomLinkedList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by binita on 10/03/15.
 */
public class CustomHashMapImpl<K,V> implements CustomHashMap<K,V>{

    private Map<K,V> map;
    private int deletedCount = 0;

    @Override
    public int getDeletedCount() {
        return deletedCount;
    }

    public CustomHashMapImpl(Map<K,V> map) {
        this.map = map;
    }

    private int incrementDeleteCount() {
        deletedCount++;
        return deletedCount;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return map.get(key);
    }

    @Override
    public V put(K key, V value) {

        return map.put(key,value);
    }

    @Override
    public V remove(Object key) {

        Object removedElement = map.remove(key);
        if(removedElement != null) {
            incrementDeleteCount();
        }
        return (V)removedElement;
    }

    @Override
    public void putAll(Map m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set keySet() {
        return map.keySet();
    }

    @Override
    public Collection values() {
        return map.values();
    }

    @Override
    public Set<Map.Entry<K,V>> entrySet() {
        return map.entrySet();
    }
}
