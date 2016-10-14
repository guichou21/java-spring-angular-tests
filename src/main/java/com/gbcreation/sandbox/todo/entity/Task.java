package com.gbcreation.sandbox.todo.entity;


import com.gbcreation.sandbox.todo.utils.TaskStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="task")
@Data
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable=false)
    private Instant creationDate;

    private Instant dueDate;

    @Column(columnDefinition = "0")
    private Integer priority;

    private TaskStatus status;

    @OneToMany(mappedBy = "task")
    private Collection<Tag> tags;

}
