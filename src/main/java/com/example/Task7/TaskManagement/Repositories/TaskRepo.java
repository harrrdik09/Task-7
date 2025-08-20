package com.example.Task7.TaskManagement.Repositories;



import com.example.Task7.TaskManagement.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {}


