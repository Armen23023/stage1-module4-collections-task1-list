package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList,new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b)   {
        if ((5*(Integer.parseInt(a)*Integer.parseInt(a))+3)  ==  (5*(Integer.parseInt(b)*Integer.parseInt(b))+3)){
            if (Integer.parseInt(a)<0){
                return -1;
            }
            else return 1;
        }
        else if ((5*(Integer.parseInt(a)*Integer.parseInt(a))+3)  >  (5*(Integer.parseInt(b)*Integer.parseInt(b))+3))
            return 1;
        else
            return -1;
    }
}
