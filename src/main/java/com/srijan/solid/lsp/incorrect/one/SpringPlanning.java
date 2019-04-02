package com.srijan.solid.lsp.incorrect.one;

import java.util.ArrayList;
import java.util.List;

public class SpringPlanning {
    public static void main(String [] args ) {

        Sprint sprint = new Sprint();
        sprint.setEmployee(makeEmployeeList());
        sprint.setTasks(makeTasks());

        if(sprint.getEstimate() > 0) {
            sprint.assignTasks();
            sprint.start();
            sprint.retrospect();
        } else {
            System.out.println("Too many tasks reduce a few ");

        }
        /**
         * Supposing object S is a subtype of object T, then objects of type T may
         * be replaced with objects of type S without altering any of the desirable properties of T.
         */
    }

    public static List<Task> makeTasks() {

        List<Task> tasks = new ArrayList<>();
        for(int i=0;i< 10;i++) {
            Task task = new Task();
            task.setTaskName(" Task " + (i + 1));
            tasks.add(task);
        }
        return tasks;
    }

    public static List<Employee> makeEmployeeList() {
        Employee jikesh = new Employee("Jikesh");
        Employee srijan = new Employee("srijan");
        Employee sabrin = new Employee("sabrin");
        Employee prjwol = new Employee("prajwol");
        Employee sandhya = new Employee("sandhya");
        Employee narayan = new Employee("narayan");
        Employee rashim = new Employee("rashim");

        List<Employee> employees = new ArrayList<>();
        employees.add(jikesh);
        employees.add(srijan);
        employees.add(sabrin);
        employees.add(prjwol);
        employees.add(sandhya);
        employees.add(narayan);
        employees.add(rashim);

        return employees;
    }

    public static List<Employee> makeProblematicEmployeeList() {
        Employee jikesh = new Employee("Jikesh");
        Employee srijan = new Employee("srijan");
        Employee sabrin = new EmployeeOnVacation("sabrin");
        Employee prjwol = new EmployeeOnVacation("prajwol");
        Employee sandhya = new Employee("sandhya");
        Employee narayan = new Employee("narayan");
        Employee rashim = new Employee("rashim");

        List<Employee> employees = new ArrayList<>();
        employees.add(jikesh);
        employees.add(srijan);
        employees.add(sabrin);
        employees.add(prjwol);
        employees.add(sandhya);
        employees.add(narayan);
        employees.add(rashim);

        return employees;
    }
}
