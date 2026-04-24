package com.example.smarteco.repository;

import com.example.smarteco.entity.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClasificacionRepository extends JpaRepository<Clasificacion, Long> {

    List<Clasificacion> findByEstado(String estado);

    List<Clasificacion> findByUsuarioId(Long usuarioId);
}
