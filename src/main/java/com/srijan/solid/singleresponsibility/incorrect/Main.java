package com.srijan.solid.singleresponsibility.incorrect;

public class Main {
    public static void main() {

        User user = new User();
        //what is the use of the class user
        //it is used to hold information of user information AND validate it's values
        user.checkAgeForHoldingAccount();
        user.checkAgeGreaterThanWorkingAge();
        user.checkParentsAge();

        //Lets change age for holding account
        //changes to any validation for user results in change in User class.
        //is this justified?

    }
}
