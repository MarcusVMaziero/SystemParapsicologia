package com.parapsicologia.core.usecase.gateway;

import com.parapsicologia.core.entity.FormulacaoEntity;
import org.springframework.stereotype.Component;

@Component
public interface FormulacaoGateway {

    public FormulacaoEntity postFormulacao(FormulacaoEntity formulacaoEntity);
}
