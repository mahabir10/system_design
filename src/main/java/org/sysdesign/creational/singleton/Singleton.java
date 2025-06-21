package org.sysdesign.creational.singleton;

public class Singleton {

    private Singleton(){}

    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getSingleton() {
        return Holder.INSTANCE;
    }
}
