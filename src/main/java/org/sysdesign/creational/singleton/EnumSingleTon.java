package org.sysdesign.creational.singleton;

public enum EnumSingleTon {
    INSTANCE(1);

    public int counter;

    EnumSingleTon(int val){
        this.counter = val;
    }

    public void check(){
        System.out.println("I am an Enum Singleton with counter = " + counter);
        counter++;
    }
}
