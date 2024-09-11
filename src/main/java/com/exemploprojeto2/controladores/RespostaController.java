package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.Resposta;
import com.exemploprojeto2.repositories.RespostaRepository;

@RestController
@RequestMapping(value = "/respostas")
public class RespostaController {

    @Autowired
    private RespostaRepository repositorio;

    @GetMapping
    public List<Resposta> findAll() {
        List<Resposta> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Resposta findById(@PathVariable Long id) {
        Resposta resultado = repositorio.findById(id).orElse(null);
        return resultado;
    }

    @PostMapping
    public Resposta insert(@RequestBody Resposta resposta) {
        Resposta resultado = repositorio.save(resposta);
        return resultado;
    }
}
