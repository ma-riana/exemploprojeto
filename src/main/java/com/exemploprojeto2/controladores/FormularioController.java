package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.Formulario;
import com.exemploprojeto2.repositories.FormularioRepository;

@RestController
@RequestMapping(value = "/formularios")
public class FormularioController {

    @Autowired
    private FormularioRepository repositorio;

    @GetMapping
    public List<Formulario> findAll() {
        List<Formulario> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Formulario findById(@PathVariable Long id) {
        Formulario resultado = repositorio.findById(id).orElse(null);
        return resultado;
    }

    @PostMapping
    public Formulario insert(@RequestBody Formulario formulario) {
        Formulario resultado = repositorio.save(formulario);
        return resultado;
    }
}
