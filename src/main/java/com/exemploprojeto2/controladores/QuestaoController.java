package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.Questao;
import com.exemploprojeto2.repositories.QuestaoRepository;

@RestController
@RequestMapping(value = "/questoes")
public class QuestaoController {

    @Autowired
    private QuestaoRepository repositorio;

    @GetMapping
    public List<Questao> findAll() {
        List<Questao> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Questao findById(@PathVariable Long id) {
        Questao resultado = repositorio.findById(id).orElse(null);
        return resultado;
    }

    @PostMapping
    public Questao insert(@RequestBody Questao questao) {
        Questao resultado = repositorio.save(questao);
        return resultado;
    }
}
