package com.sanket.java8;

/*1.  By using 'default' keyword we can write method body into the interface
2.  If One class is implementing 2 interfaces at a same time and it is having
    same method, then concrete class needs to have implementation to avoid ambiguity problem.
3. There is also a third rule --> When class is extended and interface is implemented and both are
    having same method definition then it gives first priority to the class method and second priority to default method.*/


interface DefaultAndStaticInterface {
    public int returnInteger();

    public default int returnIntegerButImplHere() {
        return 2;
    }
}

interface DefaultAndStaticInterface2 {
    public int returnInteger();

    public default int returnIntegerButImplHere() {
        return 2;
    }
}

class DefaultAndStaticClass3 {
    public int returnIntegerButImplHere() {
        return 4;
    }
}

class ImplOfInterface extends DefaultAndStaticClass3 implements DefaultAndStaticInterface2, DefaultAndStaticInterface {

    @Override
    public int returnInteger() {
        return 0;
    }
}


public class DefaultAndStatic {
    public static void main(String[] args) {
        System.out.println("Hello");
        ImplOfInterface obj = new ImplOfInterface();
        System.out.println(obj.returnIntegerButImplHere());

    }
}
