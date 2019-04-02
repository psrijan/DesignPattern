package com.srijan.solid.lsp.correct;

import com.srijan.solid.lsp.incorrect.one.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WorkingEmployee extends ProperEmployee {

    private List<Task> sprintTasks;

     public WorkingEmployee(String name) {
         super(name);
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

    public List<Task> getTasks() {
        return sprintTasks;
    }

    public void setTasks(List<Task> tasks) {
        this.sprintTasks = tasks;
    }

    public void assignTasks(Task task) {
        if(sprintTasks == null) {
            sprintTasks = new ArrayList<>();
        }
        sprintTasks.add(task);
    }
}
