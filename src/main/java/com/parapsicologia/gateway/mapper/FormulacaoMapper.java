package com.parapsicologia.gateway.mapper;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.gateway.database.repository.entity.FormulacaoTable;
import com.parapsicologia.gateway.entity.FormulacaoResponseHttp;
import com.parapsicologia.gateway.entity.FormulacaoResquestHttp;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<FormulacaoEntity> mapListToListEntity(List<FormulacaoTable> table){

            return table.stream().map(tables ->{
               return mapTableToEntity(tables);
            }).collect(Collectors.toList());

    }

    public List<FormulacaoResponseHttp> mapListToListEntityHttp(List<FormulacaoEntity> table){

        return table.stream().map(tables ->{
            return mapToHttp(tables);
        }).collect(Collectors.toList());

    }

    public FormulacaoEntity mapTableToEntity(FormulacaoTable entrada) {

        return FormulacaoEntity.builder()
                .idFormulacoes(entrada.getIdFormulacoes())
                .titulo(entrada.getTitulo())
                .texto(entrada.getTexto())
                .publicacao(entrada.getPublicacao())
                .build();
    }

    public FormulacaoEntity mapTableOptionalToEntity(Optional<FormulacaoTable> entrada) {

        return FormulacaoEntity.builder()
                .idFormulacoes(entrada.get().getIdFormulacoes())
                .titulo(entrada.get().getTitulo())
                .texto(entrada.get().getTexto())
                .publicacao(entrada.get().getPublicacao())
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
