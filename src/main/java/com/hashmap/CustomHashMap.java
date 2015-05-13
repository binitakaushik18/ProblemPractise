package com.hashmap;

import java.util.Map;

/**
 * Created by binita on 10/03/15.
 */
public interface CustomHashMap<K,V> extends Map<K,V> {
    int getDeletedCount();
}
