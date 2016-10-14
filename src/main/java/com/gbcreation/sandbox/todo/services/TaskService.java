package com.gbcreation.sandbox.todo.services;


import com.gbcreation.sandbox.todo.entity.Task;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface TaskService {
    Collection<Task> getAllTasks();

    Task getTaskById(Long id);

    Task createTask(Task task);

    Task updateTask(Task task);

    void deleteTask(Long id);

    Collection<Task> getTasksByPriority(Integer priority);
}
