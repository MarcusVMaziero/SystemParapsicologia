package com.parapsicologia.gateway.database.dataprovider;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.core.usecase.gateway.FormulacaoGateway;
import com.parapsicologia.gateway.database.repository.FormulacaoRepository;
import com.parapsicologia.gateway.mapper.FormulacaoMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class FormulacaoDataProvider implements FormulacaoGateway {

    private final FormulacaoMapper mapper;
    private final FormulacaoRepository repository;

    @Override
    public FormulacaoEntity postFormulacao(FormulacaoEntity formulacaoEntity) {
        return mapper.mapTableToEntity(
                repository.save(
                        mapper.mapEntityToTable(
                                formulacaoEntity)));
    }

    @Override
    public List<FormulacaoEntity> getFormulacao() {
        return mapper.mapListToListEntity(repository.findAll());
    }

    @Override
    public FormulacaoEntity getFormulacaoOne(Long id) {
        return mapper.mapTableOptionalToEntity(
                repository.findById(id));
    }
}
