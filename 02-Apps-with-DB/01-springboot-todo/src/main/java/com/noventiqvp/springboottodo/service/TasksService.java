package com.noventiqvp.springboottodo.service;

import java.util.List;

import com.noventiqvp.springboottodo.controller.wrapper.TaskResponse;
import com.noventiqvp.springboottodo.model.dto.TasksDto;
import com.noventiqvp.springboottodo.model.entity.Tasks;

public interface TasksService {
    TasksDto convertToDTO(Tasks task);
    TaskResponse createTask(TasksDto taskDTO);
    TaskResponse getTaskById(Integer taskId);
    TasksDto updateTask(Integer taskId, TasksDto taskDTO);
    void deleteTask(Integer taskId);
    List<TasksDto> getAllTasks();
}
