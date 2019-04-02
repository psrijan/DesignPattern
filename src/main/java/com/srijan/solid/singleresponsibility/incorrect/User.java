package com.srijan.solid.singleresponsibility.incorrect;

public class User {
    public Double age;
    public String name;
    public User parent;
    public String account;
    public Double amount;

    public boolean checkParentsAge() {
        if(parent.age > 100.0) {
            return true;
        }
        return false;
    }

    public boolean checkAgeForHoldingAccount() {
        if(age > 20) {
            System.out.println("You can have a holding account");
            return true;
        }
        System.out.println(" You are probably unemployed - No use of an account");
        return false;
    }

    public boolean checkAgeGreaterThanWorkingAge() {
        if(age > 15.0 ) {
            System.out.println("Is in working age");
            return true;
        }
        System.out.println(" Force him into child labour");

        return false;
    }
}
