package com.srijan.solid.lsp.correct;

public class NonWorkingEmployee extends ProperEmployee {

    public NonWorkingEmployee(String name) {
        super(name);
    }

    public void relax() {
        System.out.printf("I %s is on a vacation right now " , name);
    }
}
