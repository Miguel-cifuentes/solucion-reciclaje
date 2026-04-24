package com.example.smarteco.repository;

import com.example.smarteco.entity.Caneca;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CanecaRepository extends JpaRepository<Caneca, Long> {

    Optional<Caneca> findByTipo(String tipo);
}
