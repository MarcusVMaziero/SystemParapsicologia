package com.parapsicologia.core.usecase;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.core.usecase.gateway.FormulacaoGateway;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PostFormulacaoUseCase {

    private final FormulacaoGateway formulacaoGateway;

    public FormulacaoEntity postFormulacao(final FormulacaoEntity formulacaoEntity){
        return formulacaoGateway.postFormulacao(formulacaoEntity);
    }
}
