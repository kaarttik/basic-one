package com.example.basicone;


import java.util.List; // Add this import statement

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(Task task);
    void deleteTask(Long id);
}
