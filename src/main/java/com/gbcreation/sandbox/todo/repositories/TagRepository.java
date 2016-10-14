package com.gbcreation.sandbox.todo.repositories;

import com.gbcreation.sandbox.todo.entity.Tag;
import com.gbcreation.sandbox.todo.entity.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface TagRepository extends CrudRepository<Tag, Long> {
    boolean isRelatedToATask(Tag tag);
    Collection<Task> retrieveTasksRelatedTOTag(Tag tag);
}
