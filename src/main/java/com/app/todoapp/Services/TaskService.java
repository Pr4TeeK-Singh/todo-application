package com.app.todoapp.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.todoapp.Entity.Task;
import com.app.todoapp.Entity.TaskStatus;
import com.app.todoapp.Repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
    
    private final TaskRepository taskRepository;
    
    @Transactional(readOnly = true)
    public List<Task> getAllTasksByUserId(Long userId) {
        return taskRepository.findByUserIdOptimized(userId);
    }
    
    @Transactional(readOnly = true)
    public List<Task> getTasksByUserIdAndStatus(Long userId, TaskStatus status) {
        return taskRepository.findByUserIdAndStatus(userId, status);
    }
    
    @Transactional(readOnly = true)
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
    }
    
    @Transactional
    public Task createTask(Task task) {
        if (task.getCreatedAt() == null) {
            task.setCreatedAt(LocalDateTime.now());
        }
        task.setUpdatedAt(LocalDateTime.now());
        
        // Set default values if not provided
        if (task.getStatus() == null) {
            task.setStatus(TaskStatus.PENDING);
        }
        
        return taskRepository.save(task);
    }
    
    @Transactional
    public Task updateTask(Long id, Task taskDetails) {
        Task task = getTaskById(id);
        
        if (taskDetails.getTitle() != null) {
            task.setTitle(taskDetails.getTitle());
        }
        if (taskDetails.getDescription() != null) {
            task.setDescription(taskDetails.getDescription());
        }
        if (taskDetails.getStatus() != null) {
            task.setStatus(taskDetails.getStatus());
        }
        if (taskDetails.getPriority() != null) {
            task.setPriority(taskDetails.getPriority());
        }
        if (taskDetails.getDueDate() != null) {
            task.setDueDate(taskDetails.getDueDate());
        }
        
        task.setUpdatedAt(LocalDateTime.now());
        return taskRepository.save(task);
    }
    
    @Transactional
    public void deleteTask(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Task not found with id: " + id);
        }
        taskRepository.deleteById(id);
    }
    
    @Transactional(readOnly = true)
    public Long getTaskCountByStatus(Long userId, TaskStatus status) {
        return taskRepository.countByUserIdAndStatus(userId, status);
    }
}