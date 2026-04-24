package com.example.smarteco.controller;

import com.example.smarteco.dto.ClasificacionRequest;
import com.example.smarteco.dto.ClasificacionResponse;
import com.example.smarteco.service.ClasificacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clasificaciones")
@RequiredArgsConstructor
public class ClasificacionController {

    private final ClasificacionService clasificacionService;

    @PreAuthorize("hasRole('CIUDADANO')")
    @PostMapping
    public ClasificacionResponse clasificar(@RequestBody ClasificacionRequest request) {
        return clasificacionService.clasificar(request);
    }
}