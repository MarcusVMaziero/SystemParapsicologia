package com.parapsicologia.gateway.database.dataprovider;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.core.usecase.gateway.FormulacaoGateway;
import com.parapsicologia.gateway.database.repository.FormulacaoRepository;
import com.parapsicologia.gateway.mapper.FormulacaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FormulacaoDataProvider implements FormulacaoGateway {

    private final FormulacaoMapper mapper;
    private final FormulacaoRepository repository;

    @Autowired
    public FormulacaoDataProvider(FormulacaoMapper mapper, FormulacaoRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public FormulacaoEntity postFormulacao(FormulacaoEntity formulacaoEntity) {
        return mapper.mapTableToEntity(
                repository.save(
                        mapper.mapEntityToTable(
                                formulacaoEntity)));
    }
}
