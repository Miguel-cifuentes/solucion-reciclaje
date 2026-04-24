package com.example.smarteco.controller;

import com.example.smarteco.entity.Usuario;
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

    // 🔒 SOLO ADMIN
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarUsuarios();
    }

    // 🔒 SOLO ADMIN (crear usuarios internos)
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }

    // 🌍 REGISTRO PÚBLICO (CIUDADANO)
    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario) {
        return usuarioService.registrar(usuario);
    }
}