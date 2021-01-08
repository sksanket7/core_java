package com.sanket.designPatterns;

interface IamInterface {
    public void methodOne();
}

class ImplOne implements IamInterface{

    @Override
    public void methodOne() {
        System.out.println("From methodOne and Implemented IamInterface");
    }
}


class ImplTwo implements IamInterface{

    @Override
    public void methodOne() {
        System.out.println("From methodTwo and Implemented IamInterface");
    }
}

class LetsCallThisBoth{
    private IamInterface ito;

    public IamInterface getIto() {
        return ito;
    }

    public void setIto(IamInterface ito) {
        this.ito = ito;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        IamInterface intO = new ImplOne();
        LetsCallThisBoth lts =new LetsCallThisBoth();
        lts.setIto(intO);
        lts.getIto().methodOne();
    }
}
