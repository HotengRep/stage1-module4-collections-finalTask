package com.epam.mjc.collections.combined;

import java.util.Comparator;

public class CompareStringList implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int compareResult = Integer.compare(o1.length(),o2.length())*-1;

        if (compareResult == 0)
        {
            return o1.compareTo(o2)*-1;
        }

        return  compareResult;
    }
}
