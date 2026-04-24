package com.example.smarteco.service;

import com.example.smarteco.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Usuario crearUsuario(Usuario usuario);

    Optional<Usuario> obtenerPorId(Long id);

    Optional<Usuario> obtenerPorEmail(String email);

    List<Usuario> listarUsuarios();

    void eliminarUsuario(Long id);
}