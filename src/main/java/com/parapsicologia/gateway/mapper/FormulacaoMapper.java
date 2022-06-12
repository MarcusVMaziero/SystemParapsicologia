package com.parapsicologia.gateway.mapper;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.gateway.database.repository.entity.FormulacaoTable;
import com.parapsicologia.gateway.entity.FormulacaoResponseHttp;
import com.parapsicologia.gateway.entity.FormulacaoResquestHttp;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class FormulacaoMapper {

    public FormulacaoEntity mapToEntity(final FormulacaoResquestHttp entrada) {

        return FormulacaoEntity.builder()
                .texto(entrada.getTexto())
                .build();
    }

    public FormulacaoResponseHttp mapToHttp(final FormulacaoEntity entrada) {
        return FormulacaoResponseHttp.builder()
                .idFormulacoes(entrada.getIdFormulacoes())
                .texto(entrada.getTexto())
                .dataPublicacao(entrada.getDataPublicacao())
                .build();
    }

    public List<FormulacaoEntity> mapListToListEntity(List<FormulacaoTable> table) {

        return table.stream().map(this::mapTableToEntity).collect(Collectors.toList());

    }

    public List<FormulacaoResponseHttp> mapListToListEntityHttp(List<FormulacaoEntity> table) {

        return table.stream().map(this::mapToHttp).collect(Collectors.toList());

    }

    public FormulacaoEntity mapTableToEntity(FormulacaoTable entrada) {

        return FormulacaoEntity.builder()
                .idFormulacoes(entrada.getIdFormulacoes())
                .texto(entrada.getTexto())
                .dataPublicacao(entrada.getDataPublicacao())
                .build();
    }

    public FormulacaoEntity mapTableOptionalToEntity(Optional<FormulacaoTable> entrada) {
        FormulacaoTable formulacaoTable = entrada.get();

        return FormulacaoEntity.builder()
                .idFormulacoes(formulacaoTable.getIdFormulacoes())
                .texto(formulacaoTable.getTexto())
                .dataPublicacao(formulacaoTable.getDataPublicacao())
                .build();
    }

    public FormulacaoTable mapEntityToTable(FormulacaoEntity entrada) {

        return FormulacaoTable.builder()
                .idFormulacoes(entrada.getIdFormulacoes())
                .texto(entrada.getTexto())
                .dataPublicacao(LocalDate.now())
                .build();
    }
}
