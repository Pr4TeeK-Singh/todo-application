package com.app.todoapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.todoapp.Entity.Task;
import com.app.todoapp.Entity.TaskPriority;
import com.app.todoapp.Entity.TaskStatus;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
    @Query("SELECT t FROM Task t JOIN FETCH t.user WHERE t.user.id = :userId ORDER BY t.priority DESC, t.dueDate ASC")
    List<Task> findByUserIdOptimized(@Param("userId") Long userId);
    
    @Query("SELECT t FROM Task t JOIN FETCH t.user WHERE t.user.id = :userId AND t.status = :status ORDER BY t.priority DESC")
    List<Task> findByUserIdAndStatus(@Param("userId") Long userId, @Param("status") TaskStatus status);
    
    @Query("SELECT t FROM Task t JOIN FETCH t.user WHERE t.user.id = :userId AND t.priority = :priority ORDER BY t.dueDate ASC")
    List<Task> findByUserIdAndPriority(@Param("userId") Long userId, @Param("priority") TaskPriority priority);
    
    @Query("SELECT COUNT(t) FROM Task t WHERE t.user.id = :userId AND t.status = :status")
    Long countByUserIdAndStatus(@Param("userId") Long userId, @Param("status") TaskStatus status);
}