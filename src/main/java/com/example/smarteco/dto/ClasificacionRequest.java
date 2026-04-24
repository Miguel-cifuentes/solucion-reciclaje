package com.example.smarteco.dto;

import lombok.Data;

@Data
public class ClasificacionRequest {
    private String tipoResiduo;
    private Long canecaId;
}