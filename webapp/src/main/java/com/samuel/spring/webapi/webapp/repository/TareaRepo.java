package com.samuel.spring.webapi.webapp.repository;

import com.samuel.spring.webapi.webapp.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepo extends JpaRepository<Tarea, Long> {
}
