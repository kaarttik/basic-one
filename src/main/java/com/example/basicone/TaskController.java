package com.example.basicone;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") int id) {

        return null;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable("id") int id) {

    }
}
