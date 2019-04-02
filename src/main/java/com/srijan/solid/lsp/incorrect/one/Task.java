package com.srijan.solid.lsp.incorrect.one;

public class Task {
    private String taskName;
    private boolean isComplete;


    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

}
