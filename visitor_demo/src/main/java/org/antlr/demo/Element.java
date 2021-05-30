package org.antlr.demo;

public interface Element {
    void accept(Visitor v);
}
