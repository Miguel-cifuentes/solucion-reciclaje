package com.example.smarteco.repository;

import com.example.smarteco.entity.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlertaRepository extends JpaRepository<Alerta, Long> {

    List<Alerta> findByActivaTrue();
}
