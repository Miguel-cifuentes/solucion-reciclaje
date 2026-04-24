package com.example.smarteco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlertaResponse {

    private Long id;
    private String mensaje;
    private String estado; // ACTIVA, RESUELTA
}