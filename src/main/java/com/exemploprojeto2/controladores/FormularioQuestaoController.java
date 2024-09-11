package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.FormularioQuestao;
import com.exemploprojeto2.repositories.FormularioQuestaoRepository;

@RestController
@RequestMapping(value = "/formularios-questoes")
public class FormularioQuestaoController {

    @Autowired
    private FormularioQuestaoRepository repositorio;

    @GetMapping
    public List<FormularioQuestao> findAll() {
        List<FormularioQuestao> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public FormularioQuestao findById(@PathVariable Long id) {
        FormularioQuestao resultado = repositorio.findById(id).orElse(null);
        return resultado;
    }

    @PostMapping
    public FormularioQuestao insert(@RequestBody FormularioQuestao formularioQuestao) {
        FormularioQuestao resultado = repositorio.save(formularioQuestao);
        return resultado;
    }
}
