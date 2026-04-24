package com.example.smarteco.service.impl;

import com.example.smarteco.entity.Alerta;
import com.example.smarteco.repository.AlertaRepository;
import com.example.smarteco.service.AlertaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertaServiceImpl implements AlertaService {

    private final AlertaRepository repository;

    @Override
    public List<Alerta> listar() {
        return repository.findAll();
    }

    @Override
    public Alerta crear(Alerta alerta) {
        alerta.setActiva(true);
        return repository.save(alerta);
    }
}