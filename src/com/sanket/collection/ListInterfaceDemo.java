package com.sanket.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {

        //ArrayList *****************************************************************
        List arrayList=new ArrayList();
        arrayList.add(2);
        arrayList.add("three");
        arrayList.add("4 - String");
        arrayList.add('^');
        System.out.println(arrayList.toString());
        System.out.println("Lets Iterate this --> ");
        Iterator iterate = arrayList.iterator();
        int count = 0;
        while (iterate.hasNext()){
            System.out.println(iterate.next()+" --> With Index"+ count++);
        }

        //LinkedList *****************************************************************
        List linkedList = new LinkedList();
        linkedList.add(9);
        linkedList.add("eight");
        linkedList.add("45 - String");
        linkedList.add('+');
        System.out.println(linkedList.toString());
        System.out.println("Lets Iterate this --> ");
        Iterator iterate2 = linkedList.iterator();
        int count2 = 0;
        while (iterate2.hasNext()){
            System.out.println(iterate2.next()+" --> With Index"+ count2++);
        }
    }
}
