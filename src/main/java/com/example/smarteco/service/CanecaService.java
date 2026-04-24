package com.example.smarteco.service;

import com.example.smarteco.entity.Caneca;

import java.util.List;

public interface CanecaService {

    Caneca crear(Caneca caneca);

    Caneca obtenerPorId(Long id);

    List<Caneca> obtenerLlenas();

    Caneca vaciar(Long id);
}