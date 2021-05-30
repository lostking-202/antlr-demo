package org.antlr.demo;

import java.util.Iterator;

public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public abstract Entry add(Entry entry);
    public abstract Iterator iterator();
    public String toString(){
        return getName()+"("+getSize()+")";
    }
}
