package com.parapsicologia.core.usecase.gateway;

import com.parapsicologia.core.entity.FormulacaoEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface FormulacaoGateway {

    public FormulacaoEntity postFormulacao(FormulacaoEntity formulacaoEntity);

    public List<FormulacaoEntity> getFormulacao();

    public FormulacaoEntity getFormulacaoOne(Long id);
}
