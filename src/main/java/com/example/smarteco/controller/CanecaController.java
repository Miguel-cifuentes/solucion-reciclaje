package com.example.smarteco.controller;

import com.example.smarteco.entity.Caneca;
import com.example.smarteco.service.CanecaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canecas")
@RequiredArgsConstructor
public class CanecaController {

    private final CanecaService canecaService;

    @PostMapping
    public Caneca crear(@RequestBody Caneca caneca) {
        return canecaService.crear(caneca);
    }

    @GetMapping("/{id}")
    public Caneca obtenerPorId(@PathVariable Long id) {
        return canecaService.obtenerPorId(id);
    }

    @GetMapping("/llenas")
    public List<Caneca> obtenerLlenas() {
        return canecaService.obtenerLlenas();
    }

    @PutMapping("/{id}/vaciar")
    public Caneca vaciar(@PathVariable Long id) {
        return canecaService.vaciar(id);
    }
}