package org.sysdesign.creational.builder;

public class ImmutableObject {

    private String prop1;
    private int prop2;

    private ImmutableObject(String prop1, int prop2){
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    public static class ImmutableObjectBuilder{

        private String prop1;
        private int prop2;

        public ImmutableObjectBuilder prop1(String x){
            this.prop1 = x;
            return this;
        }

        public ImmutableObjectBuilder prop2(int x){
            this.prop2 = x;
            return this;
        }

        public ImmutableObject build(){
            return new ImmutableObject(this.prop1, this.prop2);
        }

    }

    // There wont be any setters
    public static ImmutableObjectBuilder builder(){
        return new ImmutableObjectBuilder();
    }

    public String toString(){
        return prop1 + " " + prop2;
    }

}
