package com.sanket.designPatterns.creational;

public class PrototypePattern {
    interface Prototype{
        Prototype clone();
    }

    class implPrototype implements Prototype{
        int j;

        public implPrototype(){

        }


        @Override
        public Prototype clone() {
            return null;
        }
    }

    }
