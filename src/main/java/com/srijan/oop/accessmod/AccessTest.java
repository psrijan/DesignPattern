package com.srijan.oop.accessmod;

import com.srijan.oop.accessmodifier.TestOne;

public class AccessTest {

    /**
     * This is the class outside the accessmodifier package.
     * I create the TestOne object instance.
     * I can only access the public string.
     * All Other strings aren't accessible.
     * @param args
     */
    public static void main(String[] args) {
        TestOne testOne = new TestOne();
        testOne.pubStr="public string editable";
    }

}
