package com.srijan.solid.lsp.incorrect.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee {
    private String name;
    private List<Task> sprintTasks;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Task> getSprintTasks() {
        return sprintTasks;
    }

    public void setSprintTasks(List<Task> sprintTasks) {
        this.sprintTasks = sprintTasks;
    }

    public void assignSprintTask(Task task) {
        if(sprintTasks == null) {
            sprintTasks = new ArrayList<>();
        }
        sprintTasks.add(task);
    }

    public void work() {
        Optional<Task> remainingTask =sprintTasks.stream().filter((task)-> !task.isComplete()).findFirst();
        if(remainingTask.isPresent()){
            System.out.printf("%s is working on %s \n" , name , remainingTask.get().getTaskName() );
            remainingTask.get().setComplete(true);
            System.out.println("Task " + remainingTask.get().getTaskName()+ "is Status Complete : "+ remainingTask.get().isComplete());
        } else {
            System.out.printf("All task for %s is complete \n" , name);
        }
    }
}
