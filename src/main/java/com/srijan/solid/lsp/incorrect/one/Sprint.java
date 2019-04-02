package com.srijan.solid.lsp.incorrect.one;

import java.util.List;
import java.util.stream.Stream;

public class Sprint {
    private int sprintDays=14;
    private List<Task> tasks;
    private List<Employee> employees;

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void setEmployee(List<Employee> employee) {
        this.employees = employee;
    }

    public int getEstimate() {
        int taskSize = tasks.size();
        int capacity = employees.size() * 14;
        return capacity - taskSize;
    }

    public void assignTasks() {
       int curTaskCount =0;
       int totalEmployeeCount = employees.size();

       for(Task task : tasks) {
            Employee employee =employees.get(curTaskCount%totalEmployeeCount);
            employee.assignSprintTask(task);
            curTaskCount++;
       }
    }

    public void start() {
        for(int i=0 ; i<sprintDays;i++ ) {
            employees.stream().forEach((employee) -> employee.work());
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


}
