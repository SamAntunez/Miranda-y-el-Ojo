package com.samuel.spring.webapi.webapp.controlador;

import com.samuel.spring.webapi.webapp.model.Ciudadano;
import com.samuel.spring.webapi.webapp.repository.CiudadanoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciudadanos")
public class CiudadanoControlador {
    @Autowired
    private CiudadanoRepo ciudadanoRepo;

    @GetMapping
    public List<Ciudadano> getAllCiudadanos() {
        return ciudadanoRepo.findAll();
    }

    @PostMapping
    public Ciudadano createCiudadano(@RequestBody Ciudadano ciudadano) {
        return ciudadanoRepo.save(ciudadano);
    }

 
}
