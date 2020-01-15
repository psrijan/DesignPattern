package com.srijan.oop.accessmodifier;

/**
 * In this i want to check if we use composition to add TestOne
 * can we access different priority values from the list.
 */
public class AccessTest {

    /**
     * From here we find out that only private string is not accessible.
     * from a class in the same package.
     * @param args
     */
    public static void main(String[] args) {
        TestOne testOne = new TestOne();
        testOne.pubStr = "public string is accessible ";
        testOne.defStr = "default string is accessible";
        testOne.protStr = "protected string is accessible";
    }
}
