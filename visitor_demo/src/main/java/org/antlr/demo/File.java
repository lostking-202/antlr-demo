package org.antlr.demo;

import java.util.Iterator;

public class File extends Entry{
    private String name;
    private int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
