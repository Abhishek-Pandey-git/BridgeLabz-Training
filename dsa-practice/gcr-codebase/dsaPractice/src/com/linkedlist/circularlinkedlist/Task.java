package com.linkedlist.circularlinkedlist;

/**
 * Represents a task with ID, name, priority, and due date.
 */
public class Task {
    private final int taskId;
    private final String taskName;
    private final int priority;
    private final String dueDate;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + ", Name: " + taskName 
                + ", Priority: " + priority + ", Due: " + dueDate;
    }
}
