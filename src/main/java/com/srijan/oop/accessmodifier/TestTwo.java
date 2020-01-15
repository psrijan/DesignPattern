package com.srijan.oop.accessmodifier;

public class TestTwo extends TestOne {

    /**
     * privStr cant be reached in this instance,
     * essentially private values are accessible only inside the same class.
     *
     * @return
     */
    public String getValues() {
        defStr = "srijan";
        pubStr = "public";
        return defStr + " " + pubStr;
    }

    public static void main(String[] args) {
        TestTwo testTwo = new TestTwo();
        String val = testTwo.getValues();
        System.out.println(val);
    }




}
