package com.samuel.spring.webapi.webapp.controlador;

import com.samuel.spring.webapi.webapp.model.Tarea;
import com.samuel.spring.webapi.webapp.repository.TareaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaControlador {
    @Autowired
    private TareaRepo tareaRepo;

    @GetMapping
    public List<Tarea> getAllTareas() {
        return tareaRepo.findAll();
    }

    @PostMapping
    public Tarea createTarea(@RequestBody Tarea tarea) {
        return tareaRepo.save(tarea);
    }

    
}
