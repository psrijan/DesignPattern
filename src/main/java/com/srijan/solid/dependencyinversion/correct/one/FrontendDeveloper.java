package com.srijan.solid.dependencyinversion.correct.one;

public class FrontendDeveloper implements Developer {

    public void develop() {
        writeJavascriptCode();
    }

    public void writeJavascriptCode() {
        System.out.println("I'm writing javascript code");
    }
}
