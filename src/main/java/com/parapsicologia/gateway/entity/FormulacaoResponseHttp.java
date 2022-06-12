package com.parapsicologia.gateway.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormulacaoResponseHttp {

    private Long idFormulacoes;
    private String texto;
    @JsonProperty(value = "data_publicacao")
    private LocalDate dataPublicacao;

}
