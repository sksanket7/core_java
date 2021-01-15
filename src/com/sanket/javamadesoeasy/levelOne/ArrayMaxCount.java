package com.sanket.javamadesoeasy.levelOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayMaxCount {

    public static void main(String[] args) {
        //int numArray[] = {1,24,98,100,22,100};
        //List<Integer> somelist = Arrays.asList(numArray);
        //System.out.println(numArray[1]);
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        int count = 0;
        Integer var = list.stream().max(Integer::compare).
        System.out.println(var);
    }
}
