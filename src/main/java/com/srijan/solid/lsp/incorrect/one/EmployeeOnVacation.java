package com.srijan.solid.lsp.incorrect.one;

public class EmployeeOnVacation extends Employee{

    public EmployeeOnVacation(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("ProperEmployee is on holiday and won't be doing any work");
    }
}
