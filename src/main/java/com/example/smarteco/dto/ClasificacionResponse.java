package com.example.smarteco.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClasificacionResponse {
    private Long id;
    private String tipoResiduo;
    private String estado;
}