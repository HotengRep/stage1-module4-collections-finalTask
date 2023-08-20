package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new LinkedHashMap<>();

        Set<String> keys = sourceMap.keySet();

        for(String key: keys)
        {
            if(map.containsKey(key.length()))
            {
                Set<String> temp = map.get(key.length());
                temp.add(key);
            }else{
                Set<String> temp = new HashSet<>();
                temp.add(key);
                map.put(key.length(),temp );
            }
        }

        return  map;
    }
}
