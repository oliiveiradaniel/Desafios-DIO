package controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final List<String> tasks = new ArrayList<>();

    @PostMapping
    public void createTask(@RequestBody String task) {
        tasks.add(task);
    }

    @GetMapping
    public List<String> getAllTasks() {
        return tasks;
    }

    @PutMapping("/{index}")
    public void updateTask(@PathVariable int index, @RequestBody String updatedTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, updatedTask);
        }
    }

    @DeleteMapping("/{index}")
    public void deleteTask(@PathVariable int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
}