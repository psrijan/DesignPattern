package com.srijan.solid.singleresponsibility.correct;


public class UserValidator {

    public boolean checkParentsAge(User user) {
        if(user.parent.age > 100.0) {
            return true;
        }
        return false;
    }

    public boolean checkAgeForHoldingAccount(User user) {
        if(user.age > 20) {
            System.out.println("You can have a holding account");
            return true;
        }
        System.out.println(" Age less than holding account");
        return false;
    }

    public boolean checkAgeGreaterThanWorkingAge(User user) {
        if(user.age > 15.0 ) {
            System.out.println(" Age is greater than working age");
            return true;
        }
        System.out.println(" Age is less than working age");
        return false;
    }
}
