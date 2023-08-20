package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> listLessons = new LinkedHashSet<>();

        for(Map.Entry<String,List<String>> element :timetable.entrySet())
        {
            listLessons.addAll(element.getValue());
        }

        return  listLessons;

    }
}
