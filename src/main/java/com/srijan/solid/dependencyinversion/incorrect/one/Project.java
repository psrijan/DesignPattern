package com.srijan.solid.dependencyinversion.incorrect.one;

public class Project {

    /**
     * Violation of Dependency Inversion rule.
     * Why?
     * High level module ie Sprint dependent on low level module - FED BED
     */
    private FronendDeveloper fronendDeveloper = new FronendDeveloper();
    private BackendDeveloper backendDeveloper = new BackendDeveloper();

    public void initiateProject() {
        /**
         * Violates second part of inversion of control
         * high level component is depending on details.
         * why?
         * Higher level module knows details of lower level module
         * Hiding the implementation details (ie Abstraction) isn't followed properly here.
         */
        fronendDeveloper.writeJavascript();
        backendDeveloper.writeJavaCode();
    }

    public static void main(String[] args ) {
        Project project= new Project();
        project.initiateProject();

    }
}
