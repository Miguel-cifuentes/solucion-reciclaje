package com.example.smarteco.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Residuo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // botella, comida, papel

    private String tipo; // APROVECHABLE, ORGANICO, NO_APROVECHABLE

    private String color; // BLANCO, VERDE, NEGRO
}