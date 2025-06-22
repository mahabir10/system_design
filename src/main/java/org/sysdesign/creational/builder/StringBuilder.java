package org.sysdesign.creational.builder;

public class StringBuilder {

    private String curr_string;

    public StringBuilder(){
        curr_string = "";
    }

    public void append(Object obj){
        curr_string+=(curr_string.isEmpty() ? "" : " ") + obj.toString();
    }

    public String toString(){
        return curr_string;
    }

}
