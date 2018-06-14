package com.example.whykotlin.java.extensionfunctions;

import java.util.List;

import static java.util.Arrays.asList;

public class ExtendSomething {

    private void swap(List<Integer> list, Integer index1, Integer index2) {
        Integer tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }

    void swapSomething() {
        List<Integer> list = asList(1, 2, 3);
        swap(list, 0, 2);
    }
}