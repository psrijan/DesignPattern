package com.srijan.solid.dependencyinversion.correct.one;

import java.util.ArrayList;
import java.util.List;

public class Project {
    /**
     * High level module doesn't depend on low level modules.
     * These dependencies are passed to the class during runtime.
     */
    List<Developer>  developers;

    public Project(List<Developer>  developers) {
        this.developers = developers;
    }

    public void initialize() {
        /**
         * Sprint doesn't know what language the
         * developer is using to develop a code.
         *
         */
        developers.stream().forEach((dev) -> {
            dev.develop();
        });
    }

    public static void main(String[] args ) {
        Developer developer = new FrontendDeveloper();
        Developer developer1=new BackendDeveloper();

        List<Developer> list = new ArrayList<>();
        list.add(developer);
        list.add(developer1);

        Project project=new Project(list);
        project.initialize();
    }



}
