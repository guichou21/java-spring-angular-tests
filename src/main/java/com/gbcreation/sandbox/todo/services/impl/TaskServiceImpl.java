package com.gbcreation.sandbox.todo.services.impl;

import com.gbcreation.sandbox.todo.entity.Task;
import com.gbcreation.sandbox.todo.repositories.TaskRepository;
import com.gbcreation.sandbox.todo.services.TaskService;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service("taskService")
public class TaskServiceImpl implements TaskService{

    @Resource
    @Getter
    @Setter
    private TaskRepository taskDAO;

    @Override
    public Collection<Task> getAllTasks() {
        return IteratorUtils.toList(taskDAO.findAll().iterator());
    }

    @Override
    public Task getTaskById(Long id) {
        return taskDAO.findOne(id);
    }

    @Override
    public Task createTask(Task task) {
        return taskDAO.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return taskDAO.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskDAO.delete(id);
    }

    @Override
    public Collection<Task> getTasksByPriority(Integer priority) {
        return IteratorUtils.toList(taskDAO.findByPriority(priority).iterator());
    }
}
