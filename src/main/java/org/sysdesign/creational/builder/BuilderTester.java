package org.sysdesign.creational.builder;

public class BuilderTester {

    public static void main(String[] args){

        StringBuilder builder = new StringBuilder();

        builder.append("This is my first line");
        builder.append("This is my second line");
        builder.append(42);

        System.out.println(builder.toString());


        ImmutableObject obj1 = ImmutableObject.builder().prop1("Property1").prop2(42)
                .build();

        System.out.println(obj1.toString());

    }

}
