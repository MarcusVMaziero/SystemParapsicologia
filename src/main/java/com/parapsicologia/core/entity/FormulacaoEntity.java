package com.parapsicologia.core.entity;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FormulacaoEntity {

    private Long idFormulacoes;
    private String texto;
    private LocalDate dataPublicacao;
}
