package com.parapsicologia.core.usecase;

import com.parapsicologia.core.entity.FormulacaoEntity;
import com.parapsicologia.core.usecase.gateway.FormulacaoGateway;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class GetAllFormulacaoUseCase {

    private final FormulacaoGateway formulacaoGateway;

    public List<FormulacaoEntity> getAll(){
        return formulacaoGateway.getFormulacao();
    }
}
