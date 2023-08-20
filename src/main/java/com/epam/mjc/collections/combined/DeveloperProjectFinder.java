package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> projectsList = new LinkedList<>();


        for(Map.Entry<String,Set<String>> entry: projects.entrySet())
        {
            if(entry.getValue().contains(developer))
            {
                projectsList.add(entry.getKey());
            }

        }
        Comparator<String> comparator = new CompareStringList();
        projectsList.sort(comparator);
        return  projectsList;
    }
}
