package org.sysdesign.creational.singleton;

public class SingleTonExample {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1);
        System.out.println(singleton2);

        EnumSingleTon singleTon3 = EnumSingleTon.INSTANCE;
        EnumSingleTon singleTon4 = EnumSingleTon.INSTANCE;

        singleTon3.check();
        singleTon4.check();

        System.out.print(singleTon3.counter);
    }

}
