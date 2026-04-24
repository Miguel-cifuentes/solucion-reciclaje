package com.example.smarteco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CanecaResponse {

    private Long id;
    private String tipo; // BLANCO, VERDE, NEGRO
    private int nivelActual;
    private int capacidadMaxima;
    private boolean llena;
}
