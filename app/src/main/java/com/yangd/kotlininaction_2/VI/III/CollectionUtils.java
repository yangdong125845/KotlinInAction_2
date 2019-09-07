package com.yangd.kotlininaction_2.VI.III;

import java.util.List;

public class CollectionUtils {
    public static List<String> uppercaseAll(List<String> items) {
        for (int i=0;i<items.size();i++) {
            items.set(i,items.get(i).toUpperCase());
        }
        return items;
    }
}
