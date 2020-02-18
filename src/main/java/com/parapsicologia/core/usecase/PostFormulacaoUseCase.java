package com.parapsicologia.core.usecase;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.core.usecase.gateway.FormulacaoGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostFormulacaoUseCase {

    private FormulacaoGateway formulacaoGateway;

    @Autowired
    public PostFormulacaoUseCase(FormulacaoGateway formulacaoGateway) {
        this.formulacaoGateway = formulacaoGateway;
    }

    public FormulacaoEntity postFormulacao(FormulacaoEntity formulacaoEntity){
        return formulacaoGateway.postFormulacao(formulacaoEntity);
    }
}
