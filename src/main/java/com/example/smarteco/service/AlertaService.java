package com.example.smarteco.service;

import com.example.smarteco.entity.Alerta;

import java.util.List;

public interface AlertaService {

    Alerta crearAlerta(Alerta alerta);

    List<Alerta> listarAlertasActivas();

    void desactivarAlerta(Long alertaId);
}