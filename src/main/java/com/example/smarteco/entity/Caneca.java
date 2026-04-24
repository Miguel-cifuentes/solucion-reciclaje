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
public class Caneca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // BLANCO, VERDE, NEGRO

    private int capacidadMaxima;

    private int cantidadActual;
}