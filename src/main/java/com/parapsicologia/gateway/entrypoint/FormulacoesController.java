package com.parapsicologia.gateway.entrypoint;

import com.parapsicologia.core.usecase.PostFormulacaoUseCase;
import com.parapsicologia.gateway.entity.FormulacaoResponseHttp;
import com.parapsicologia.gateway.entity.FormulacaoResquestHttp;
import com.parapsicologia.gateway.mapper.FormulacaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/v1")
public class FormulacoesController {

    private final PostFormulacaoUseCase postFormulacaoUseCase;

    private final FormulacaoMapper mapper;

    @Autowired
    public FormulacoesController(PostFormulacaoUseCase postFormulacaoUseCase, FormulacaoMapper mapper) {
        this.postFormulacaoUseCase = postFormulacaoUseCase;
        this.mapper = mapper;
    }

    @PostMapping("/formulacoes")
    public FormulacaoResponseHttp postFormulacao(@RequestBody FormulacaoResquestHttp formulacaoResponseHttp) {
        return mapper.mapToHttp(postFormulacaoUseCase.postFormulacao(mapper.mapToEntity(formulacaoResponseHttp)));
    }

    @GetMapping("/formulacoes")
    public Iterable<FormulacaoResponseHttp> getAllFormulacoes() {
        return null;
    }

    @GetMapping("/formulacoes/all")
    public FormulacaoResponseHttp getOneFormulacao(@RequestParam Long idFormulacoes) {
        return null;
    }

    @PutMapping("/formulacoes")
    public FormulacaoResponseHttp putFormulacao(@RequestBody FormulacaoResquestHttp formulacaoResponseHttp) {
        return null;
    }
}
