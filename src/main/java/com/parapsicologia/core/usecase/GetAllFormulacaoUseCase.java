package com.parapsicologia.core.usecase;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.core.usecase.gateway.FormulacaoGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllFormulacaoUseCase {

    private FormulacaoGateway formulacaoGateway;

    @Autowired
    public GetAllFormulacaoUseCase(FormulacaoGateway formulacaoGateway) {
        this.formulacaoGateway = formulacaoGateway;
    }

    public List<FormulacaoEntity> getAll(){
        return formulacaoGateway.getFormulacao();
    }
}
