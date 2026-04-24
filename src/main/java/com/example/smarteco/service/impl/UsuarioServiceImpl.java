package com.example.smarteco.service.impl;

import com.example.smarteco.entity.Usuario;
import com.example.smarteco.repository.UsuarioRepository;
import com.example.smarteco.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;

    // =========================
    // 🔐 CREAR USUARIO (ADMIN)
    // =========================
    @Override
    public Usuario crearUsuario(Usuario usuario) {

        validarEmail(usuario.getEmail());

        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        return repository.save(usuario);
    }

    // =========================
    // 🌍 REGISTRO PÚBLICO
    // =========================
    public Usuario registrar(Usuario usuario) {

        validarEmail(usuario.getEmail());

        if (usuario.getPassword() == null || usuario.getPassword().length() < 6) {
            throw new RuntimeException("La contraseña debe tener mínimo 6 caracteres");
        }

        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        return repository.save(usuario);
    }

    // =========================
    // 📋 LISTAR USUARIOS
    // =========================
    @Override
    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }

    // =========================
    // 🔎 BUSCAR POR ID
    // =========================
    @Override
    public Optional<Usuario> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    // =========================
    // 📧 BUSCAR POR EMAIL
    // =========================
    @Override
    public Optional<Usuario> obtenerPorEmail(String email) {
        return repository.findByEmail(email);
    }

    // =========================
    // ❌ ELIMINAR USUARIO
    // =========================
    @Override
    public void eliminarUsuario(Long id) {
        repository.deleteById(id);
    }

    // =========================
    // 🧠 VALIDACIÓN PRIVADA
    // =========================
    private void validarEmail(String email) {
        if (repository.findByEmail(email).isPresent()) {
            throw new RuntimeException("El email ya está registrado");
        }
    }
}