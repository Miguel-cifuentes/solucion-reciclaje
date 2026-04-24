package com.example.smarteco.service;

import com.example.smarteco.entity.Clasificacion;

import java.util.List;

public interface ClasificacionService {

    Clasificacion registrar(Clasificacion clasificacion);

    Clasificacion validar(Long id);

    List<Clasificacion> listar();
}