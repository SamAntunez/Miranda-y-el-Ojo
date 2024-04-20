package com.samuel.spring.webapi.webapp.repository;

import com.samuel.spring.webapi.webapp.model.Ciudadano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadanoRepo extends JpaRepository<Ciudadano, Long> {
}
