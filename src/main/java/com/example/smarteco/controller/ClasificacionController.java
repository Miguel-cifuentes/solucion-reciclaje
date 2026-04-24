package com.example.smarteco.controller;

import com.example.smarteco.entity.Clasificacion;
import com.example.smarteco.service.ClasificacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clasificaciones")
@RequiredArgsConstructor
public class ClasificacionController {

    private final ClasificacionService clasificacionService;

    @PreAuthorize("hasRole('CIUDADANO')")
    @PostMapping
    public Clasificacion clasificar(@RequestBody Clasificacion clasificacion) {
        return clasificacionService.registrar(clasificacion);
    }
}