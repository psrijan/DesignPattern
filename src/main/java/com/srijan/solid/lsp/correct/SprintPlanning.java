package com.srijan.solid.lsp.correct;


import com.srijan.solid.lsp.incorrect.one.Employee;
import com.srijan.solid.lsp.incorrect.one.Task;

import java.util.ArrayList;
import java.util.List;

public class SprintPlanning {

    List<WorkingEmployee> workingEmployees;
    List<NonWorkingEmployee> nonWorkingEmployees;

    public static void main(String[] args ) {
       Sprint sprint = new Sprint();
        sprint.setWorkingEmployees(makeWorkingEmployeeList());
        sprint.setNonWorkingEmployees(makeRestEmployeeList());
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
        for(int i=0;i< 1000;i++) {
            Task task = new Task();
            task.setTaskName(" Task " + (i + 1));
            tasks.add(task);
        }
        return tasks;
    }

    public static List<ProperEmployee> makeWorkingEmployeeList() {
//        Employee jikesh = new WorkingEmployee("Jikesh");
//        Employee srijan = new WorkingEmployee("srijan");
        ProperEmployee sabrin = new WorkingEmployee("sabrin");
        ProperEmployee prjwol = new WorkingEmployee("prajwol");
        ProperEmployee sandhya = new WorkingEmployee("sandhya");
        ProperEmployee narayan = new WorkingEmployee("narayan");
        ProperEmployee rashim = new WorkingEmployee("rashim");

        List<ProperEmployee> employees = new ArrayList<>();
        employees.add(sabrin);
        employees.add(prjwol);
        employees.add(sandhya);
        employees.add(narayan);
        employees.add(rashim);

        return employees;
    }

    public static List<ProperEmployee> makeRestEmployeeList() {
        ProperEmployee jikesh = new NonWorkingEmployee("Jikesh");
        ProperEmployee srijan = new NonWorkingEmployee("srijan");
        List<ProperEmployee> employees = new ArrayList<>();
        employees.add(jikesh);
        employees.add(srijan);
        return employees;
    }
}
