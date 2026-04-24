package com.example.smarteco.controller;

import com.example.smarteco.entity.Alerta;
import com.example.smarteco.service.AlertaService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertas")
@RequiredArgsConstructor
public class AlertaController {

    private final AlertaService alertaService;

    @PreAuthorize("hasRole('RECICLADOR')")
    @GetMapping
    public List<Alerta> getAlertas() {
        return alertaService.listar();
    }
}