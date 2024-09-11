package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.Opcao;
import com.exemploprojeto2.repositories.OpcaoRepository;

@RestController
@RequestMapping(value = "/opcoes")
public class OpcaoController {

    @Autowired
    private OpcaoRepository repositorio;

    @GetMapping
    public List<Opcao> findAll() {
        List<Opcao> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Opcao findById(@PathVariable Long id) {
        Opcao resultado = repositorio.findById(id).orElse(null);
        return resultado;
    }

    @PostMapping
    public Opcao insert(@RequestBody Opcao opcao) {
        Opcao resultado = repositorio.save(opcao);
        return resultado;
    }
}
