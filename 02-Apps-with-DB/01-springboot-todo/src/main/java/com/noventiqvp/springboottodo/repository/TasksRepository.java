package com.noventiqvp.springboottodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noventiqvp.springboottodo.model.entity.Tasks;

// @Repository
public interface TasksRepository extends JpaRepository<Tasks, Integer> {
    boolean existsByName(String name);
}
