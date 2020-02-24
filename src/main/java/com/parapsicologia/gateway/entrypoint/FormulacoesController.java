package com.parapsicologia.gateway.entrypoint;

import com.parapsicologia.core.usecase.GetAllFormulacaoUseCase;
import com.parapsicologia.core.usecase.GetFormulacaoUseCase;
import com.parapsicologia.core.usecase.PostFormulacaoUseCase;
import com.parapsicologia.gateway.entity.FormulacaoResponseHttp;
import com.parapsicologia.gateway.entity.FormulacaoResquestHttp;
import com.parapsicologia.gateway.mapper.FormulacaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/v1")
public class FormulacoesController {

    private final PostFormulacaoUseCase postFormulacaoUseCase;

    private final GetFormulacaoUseCase getFormulacaoUseCase;

    private final FormulacaoMapper mapper;

    private final GetAllFormulacaoUseCase getAllFormulacaoUseCase;

    @Autowired
    public FormulacoesController(PostFormulacaoUseCase postFormulacaoUseCase, GetAllFormulacaoUseCase getAllFormulacaoUseCase, FormulacaoMapper mapper, GetFormulacaoUseCase getFormulacaoUseCase) {
        this.postFormulacaoUseCase = postFormulacaoUseCase;
        this.mapper = mapper;
        this.getFormulacaoUseCase = getFormulacaoUseCase;
        this.getAllFormulacaoUseCase = getAllFormulacaoUseCase;
    }

    @PostMapping("/formulacoes")
    public FormulacaoResponseHttp postFormulacao(@RequestBody FormulacaoResquestHttp formulacaoResponseHttp) {
        return mapper.mapToHttp(postFormulacaoUseCase.postFormulacao(mapper.mapToEntity(formulacaoResponseHttp)));
    }

    @GetMapping("/formulacoes/all")
    public List<FormulacaoResponseHttp> getAllFormulacoes() {
        return mapper.mapListToListEntityHttp(getAllFormulacaoUseCase.getAll());
    }

    @GetMapping("/formulacoes")
    public FormulacaoResponseHttp getOneFormulacao(@RequestParam Long idFormulacoes) {
        return mapper.mapToHttp(getFormulacaoUseCase.getFormulacaoOne(idFormulacoes));
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/formulacoes")
    public FormulacaoResponseHttp putFormulacao(@RequestBody FormulacaoResquestHttp formulacaoResponseHttp) {
        return null;
    }
}
