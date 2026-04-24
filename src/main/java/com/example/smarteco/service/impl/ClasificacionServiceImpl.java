package com.example.smarteco.service.impl;

import com.example.smarteco.entity.Clasificacion;
import com.example.smarteco.repository.ClasificacionRepository;
import com.example.smarteco.service.ClasificacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasificacionServiceImpl implements ClasificacionService {

    private final ClasificacionRepository repository;

    @Override
    public Clasificacion registrar(Clasificacion c) {
        c.setEstado("PENDIENTE");
        return repository.save(c);
    }

    @Override
    public Clasificacion validar(Long id) {
        Clasificacion c = repository.findById(id).orElseThrow();
        c.setEstado("VALIDADO");
        return repository.save(c);
    }

    @Override
    public List<Clasificacion> listar() {
        return repository.findAll();
    }
}