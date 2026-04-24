package com.example.smarteco.service.impl;

import com.example.smarteco.entity.Caneca;
import com.example.smarteco.repository.CanecaRepository;
import com.example.smarteco.service.CanecaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CanecaServiceImpl implements CanecaService {

    private final CanecaRepository repository;

    @Override
    public Caneca crear(Caneca caneca) {
        return repository.save(caneca);
    }

    @Override
    public Caneca obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Caneca no encontrada"));
    }

    @Override
    public List<Caneca> obtenerLlenas() {
        return repository.findAll()
                .stream()
                .filter(c -> c.getCantidadActual() >= c.getCapacidadMaxima())
                .toList();
    }

    @Override
    public Caneca vaciar(Long id) {
        Caneca c = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Caneca no encontrada"));

        c.setCantidadActual(0);
        return repository.save(c);
    }
}