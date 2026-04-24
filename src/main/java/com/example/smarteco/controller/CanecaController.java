package com.example.smarteco.controller;

import com.example.smarteco.service.CanecaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/canecas")
@RequiredArgsConstructor
public class CanecaController {

    private final CanecaService canecaService;

    @GetMapping("/{id}")
    public Object getCaneca(@PathVariable Long id) {
        return canecaService.getById(id);
    }
}