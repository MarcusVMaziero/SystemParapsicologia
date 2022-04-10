package com.parapsicologia.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FormulacaoEntity {

    private Long idFormulacoes;
    private String texto;
    private LocalDate dataPublicacao;
}
