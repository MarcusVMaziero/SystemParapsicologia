package com.parapsicologia.gateway.mapper;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.gateway.database.repository.entity.FormulacaoTable;
import com.parapsicologia.gateway.entity.FormulacaoResponseHttp;
import com.parapsicologia.gateway.entity.FormulacaoResquestHttp;
import org.springframework.stereotype.Component;

@Component
public class FormulacaoMapper {

    public FormulacaoEntity mapToEntity(FormulacaoResquestHttp entrada) {

        return FormulacaoEntity.builder()
                .titulo(entrada.getTitulo())
                .texto(entrada.getTexto())
                .publicacao(entrada.getPublicacao())
                .build();
    }

    public FormulacaoResponseHttp mapToHttp(FormulacaoEntity entrada) {

        return FormulacaoResponseHttp.builder()
                .idFormulacoes(entrada.getIdFormulacoes())
                .titulo(entrada.getTitulo())
                .texto(entrada.getTexto())
                .publicacao(entrada.getPublicacao())
                .build();
    }

    public FormulacaoEntity mapTableToEntity(FormulacaoTable entrada) {

        return FormulacaoEntity.builder()
                .idFormulacoes(entrada.getIdFormulacoes())
                .titulo(entrada.getTitulo())
                .texto(entrada.getTexto())
                .publicacao(entrada.getPublicacao())
                .build();
    }

    public FormulacaoTable mapEntityToTable(FormulacaoEntity entrada) {

        return FormulacaoTable.builder()
                .idFormulacoes(entrada.getIdFormulacoes())
                .titulo(entrada.getTitulo())
                .texto(entrada.getTexto())
                .publicacao(entrada.getPublicacao())
                .build();
    }
}