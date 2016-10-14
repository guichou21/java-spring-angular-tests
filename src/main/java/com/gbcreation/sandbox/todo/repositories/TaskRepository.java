package com.gbcreation.sandbox.todo.repositories;

import com.gbcreation.app.demo.entity.Place;
import com.gbcreation.sandbox.todo.entity.Task;
import com.gbcreation.sandbox.todo.utils.TaskStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface TaskRepository extends CrudRepository<Task, Long> {
    Collection<Task> findByPriority(Integer priority);
}
