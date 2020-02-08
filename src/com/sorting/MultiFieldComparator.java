package com.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MultiFieldComparator<T> implements Comparator<T> {

    private final List<Comparator<T>> comparators = new ArrayList<Comparator<T>>();

    public void addComparator(Comparator<T> comparator) {
        comparators.add(comparator);
    }

    @Override
    public int compare(T o1, T o2) {
        for (Comparator<T> comparator : comparators) {
            int value = comparator.compare(o1, o2);
            if (value != 0) {
                return value;
            }
        }
        return 0;
    }

}