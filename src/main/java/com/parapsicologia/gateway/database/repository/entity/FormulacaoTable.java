package com.parapsicologia.gateway.database.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class FormulacaoTable {

    @Id
    @GeneratedValue
    private Long idFormulacoes;
    private String texto;
    private LocalDate dataPublicacao;
}
