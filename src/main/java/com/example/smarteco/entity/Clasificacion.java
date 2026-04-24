package com.example.smarteco.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clasificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "residuo_inicial_id")
    private Residuo residuoInicial;

    @ManyToOne
    @JoinColumn(name = "residuo_validado_id")
    private Residuo residuoValidado;

    @ManyToOne
    @JoinColumn(name = "caneca_id")
    private Caneca caneca;

    @ManyToOne
    @JoinColumn(name = "area_destino_id")
    private AreaDestino areaDestino;

    private String estado; // PENDIENTE, VALIDADO, CORREGIDO

    private LocalDateTime fecha;
}
