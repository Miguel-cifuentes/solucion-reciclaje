package com.example.smarteco.repository;

import com.example.smarteco.entity.Residuo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResiduoRepository extends JpaRepository<Residuo, Long> {

    List<Residuo> findByTipo(String tipo);
}
