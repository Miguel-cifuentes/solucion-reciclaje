package com.example.smarteco.service;

import com.example.smarteco.entity.Caneca;

import java.util.List;
import java.util.Optional;

public interface CanecaService {

    Optional<Caneca> obtenerPorTipo(String tipo);

    Caneca guardarCaneca(Caneca caneca);

    List<Caneca> listarCanecas();

    void actualizarCantidad(String tipo, int cantidad);
}