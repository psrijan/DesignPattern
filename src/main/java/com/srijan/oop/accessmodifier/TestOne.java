package com.srijan.oop.accessmodifier;

public class TestOne {
    String defStr;
    public String pubStr;
    private String privStr;
    protected String protStr;

    /**
     * The inner class doesn't have any restriction because of the access modifiers
     * They are easily able to access all member variable of the class it is defined in.
     */
    class InnerClass {
        private void strPrinter() {
            System.out.println(privStr);
            System.out.println(pubStr);
            System.out.println(protStr);
            System.out.println(defStr);
        }
    }
}
