package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList(sourceList);
        ArrayList arrayList1 = new ArrayList();
        if (arrayList.size()<3){
            return arrayList1;
        }
        else {
            for (int i = 0; i < arrayList.size(); i++) {
                if ((i+1) % 3 == 0) {
                    arrayList1.add(arrayList.get(i));
                    arrayList1.add(arrayList.get(i));
                }
            }
        }
        return arrayList1;
    }
}
