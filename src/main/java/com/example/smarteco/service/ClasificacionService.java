package com.example.smarteco.service;

import com.example.smarteco.entity.Clasificacion;

import java.util.List;

public interface ClasificacionService {

    Clasificacion registrarClasificacion(Long usuarioId, Long residuoId);

    Clasificacion validarClasificacion(Long clasificacionId, Long residuoCorrectoId);

    List<Clasificacion> listarClasificaciones();

    List<Clasificacion> listarPorEstado(String estado);
}
