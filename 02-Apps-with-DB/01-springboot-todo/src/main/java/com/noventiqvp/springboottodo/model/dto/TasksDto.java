package com.noventiqvp.springboottodo.model.dto;

import java.util.Date;

import com.noventiqvp.springboottodo.model.entity.TasksStatusEnum;

import lombok.Data;

@Data
public class TasksDto {
    private long id;
    private String name;
    private String description;
    private TasksStatusEnum status;
    private Date dueDate;
    private Date createdAt;
    private Date updatedAt;
}
