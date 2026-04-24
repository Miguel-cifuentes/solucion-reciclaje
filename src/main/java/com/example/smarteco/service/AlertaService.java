package com.example.smarteco.service;

import com.example.smarteco.entity.Alerta;

import java.util.List;

public interface AlertaService {

    List<Alerta> listar();

    Alerta crear(Alerta alerta);
}