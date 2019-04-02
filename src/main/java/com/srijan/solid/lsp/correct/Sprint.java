package com.srijan.solid.lsp.correct;

import com.srijan.solid.lsp.incorrect.one.Employee;
import com.srijan.solid.lsp.incorrect.one.Task;

import java.util.List;
import java.util.stream.Stream;

public class Sprint {
    private int sprintDays=14;
    private List<Task> tasks;
    private List<ProperEmployee> workingEmployees;
    private List<ProperEmployee> nonWorkingEmployees;

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public int getEstimate() {
        int taskSize = tasks.size();
        int capacity = workingEmployees.size() * 14;
        return capacity - taskSize;
    }

    public void assignTasks() {
        int curTaskCount =0;
        int totalEmployeeCount = workingEmployees.size();

        for(Task task : tasks) {
            ProperEmployee employee = workingEmployees.get(curTaskCount%totalEmployeeCount);
            ((WorkingEmployee) employee).assignTasks(task);
            curTaskCount++;
        }
    }

    public void start() {

        for(int i=0 ; i<sprintDays;i++ ) {
            nonWorkingEmployees.stream().forEach((employee) -> ((NonWorkingEmployee)employee).relax());
        }
        for(int i=0 ; i<sprintDays;i++ ) {
            workingEmployees.stream().forEach((employee) -> ((WorkingEmployee)employee).work());
        }

        System.out.println("---- Sprint is complete ---");
    }

    public void retrospect() {
        Stream<Task> remainingTask = tasks.stream().filter((task) -> !task.isComplete());
        if(remainingTask.count()>0) {
            System.out.println("Unable to complete all task in the current sprint ");
        } else {
            System.out.println("Sprint went as planned - everyone completed their work");
        }
    }

    public void setSprintDays(int sprintDays) {
        this.sprintDays = sprintDays;
    }

    public void setWorkingEmployees(List<ProperEmployee> workingEmployees) {
        this.workingEmployees = workingEmployees;
    }

    public void setNonWorkingEmployees(List<ProperEmployee> nonWorkingEmployees) {
        this.nonWorkingEmployees = nonWorkingEmployees;
    }
}
