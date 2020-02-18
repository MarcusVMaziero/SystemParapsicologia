package com.parapsicologia.core.usecase;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.core.usecase.gateway.FormulacaoGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetFormulacaoUseCase {

    private FormulacaoGateway formulacaoGateway;

    @Autowired
    public GetFormulacaoUseCase(FormulacaoGateway formulacaoGateway) {
        this.formulacaoGateway = formulacaoGateway;
    }

    public FormulacaoEntity getFormulacaoOne(Long id){
    return formulacaoGateway.getFormulacaoOne(id);
    }
}
