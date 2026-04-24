package com.example.smarteco.controller;

import com.example.smarteco.service.AlertaService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alertas")
@RequiredArgsConstructor
public class AlertaController {

    private final AlertaService alertaService;

    @PreAuthorize("hasRole('RECICLADOR')")
    @GetMapping
    public Object getAlertas() {
        return alertaService.getAll();
    }
}