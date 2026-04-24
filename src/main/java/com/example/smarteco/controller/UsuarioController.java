package com.example.smarteco.controller;

import com.example.smarteco.dto.UsuarioRequest;
import com.example.smarteco.dto.UsuarioResponse;
import com.example.smarteco.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<UsuarioResponse> getAll() {
        return usuarioService.getAll();
    }

    @PostMapping
    public UsuarioResponse create(@RequestBody UsuarioRequest request) {
        return usuarioService.create(request);
    }
}