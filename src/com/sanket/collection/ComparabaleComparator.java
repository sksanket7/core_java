package com.sanket.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparabaleComparator implements Comparator<Integer> {
    public static void main(String[] args) {
        Set<Integer> treeSet=new TreeSet<Integer>();
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(9);
        System.out.println(treeSet.toString());
        System.out.println("Git Test");
        System.out.println("Git Test 2");
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}
