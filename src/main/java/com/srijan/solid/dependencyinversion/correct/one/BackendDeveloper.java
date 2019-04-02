package com.srijan.solid.dependencyinversion.correct.one;

public class BackendDeveloper implements Developer {

    public void develop() {
        writeJavaCode();
    }

    public void writeJavaCode() {
        System.out.println("Write Java code");
    }
}
