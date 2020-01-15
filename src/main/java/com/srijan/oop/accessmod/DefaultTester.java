package com.srijan.oop.accessmod;

import com.srijan.oop.accessmodifier.TestOne;

public class DefaultTester extends TestOne {

    /**
     * You can't access the defStr even if it's available in TestOne
     * class. This is because it's access right is default. Default
     * access modifier doesnt allow a variable to be accessed in
     * another package.
     */
    public void getString() {
        pubStr = "editing public string";
        protStr = "protected string can be edited because it is accessible in the child class";
    }

}
