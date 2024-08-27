package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.Professor;
import com.exemploprojeto2.repositories.ProfessorRepository;

@RestController
@RequestMapping(value = "/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository repositorio;

    @GetMapping
    public List<Professor> findAll() {
        List<Professor> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Professor findAll(@PathVariable Long id) {
        Professor resultado = repositorio.findById(id).get();
        return resultado;

    }

    @PostMapping
    public Professor insert(@RequestBody Professor prof) {
        Professor resultado = repositorio.save(prof);
        return resultado;

    }
}
