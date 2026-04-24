package com.example.smarteco.service;

import com.example.smarteco.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Usuario crearUsuario(Usuario usuario);

    List<Usuario> listarUsuarios();

    Optional<Usuario> obtenerPorId(Long id);

    Optional<Usuario> obtenerPorEmail(String email);

    void eliminarUsuario(Long id);
}